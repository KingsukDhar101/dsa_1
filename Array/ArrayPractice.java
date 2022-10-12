package Array;
import java.util.*;
public class ArrayPractice{
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
    //   int val = sc.nextInt();
      int size = sc.nextInt();

      int arr[] = new int[size];
      
      for(int i=0; i<size; i++){
        arr[i] = sc.nextInt();
      }
      
    //   System.out.println(countSetBits(n));

    // // linear search
    // int pos = getPosition(arr, val);
    // if(pos != -1)
    //     System.out.println(val+" found in "+pos+"th position");
    // else
    //     System.out.println(val+" not found in array");

    // // clone array
    //  printArray(arr);

    // int arr2[] = arr.clone();

    // printArray(arr2);
    
    // reverse an array
    printArray(arr);
    reverseArray(arr);
    printArray(arr);
    

    sc.close();
 }
    public static void reverseArray(int arr[]){
        int start = 0;
        int end = arr.length-1;
        int mid = end/2;

        System.out.println("reverse array");

        while(arr[start] <= mid){
            System.out.println(arr[start] +" ** "+mid);
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
    public static void printArray(int arr[]){
        System.out.print("array: "+arr+" : ");
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    
    public static void swap(int arr[], int pos1, int pos2){
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

    public static int getPosition(int arr[], int val){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == val){
                return i;
            }
        }
        return -1;
    }
    public static int countSetBits(int n){
        int count = 0;
        
        while(n > 0){
            count += n&1;
            n = n>>1;
        }
        
        return count;
    }
}