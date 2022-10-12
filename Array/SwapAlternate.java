package Array;
import java.util.*;
// import Array.ArrayPractice;

public class SwapAlternate {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //   int val = sc.nextInt();
    int size = sc.nextInt();

    int arr[] = new int[size];
      
    for(int i=0; i<size; i++){
      arr[i] = sc.nextInt();
    }

    // ArrayPractice arrPractice = new ArrayPractice();
    
    ArrayPractice.printArray(arr);
    swapAlternate(arr);
    ArrayPractice.printArray(arr);

    sc.close();
  }
  public static void swapAlternate(int arr[]){
    // int start = 0;
    // int end = arr.length-1;
    for(int i=0; i<arr.length-1; i=i+2){
      ArrayPractice.swap(arr, i, i+1);
    }
  }
}
