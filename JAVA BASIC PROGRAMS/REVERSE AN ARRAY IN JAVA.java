import java.util.*;

public class Main {
    public static void main(String[] args) {
      int[] arr = {20,2,3,4,5,10,0};
      reverse(arr);
     
      System.out.println(Arrays.toString(arr));
  }
  static void reverse(int[] arr){
    int start = 0;
    int end = arr.length-1;
    while(start < end){
     int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
      start++;
      end--;
    }
  }
  
  
}