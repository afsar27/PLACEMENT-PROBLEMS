import java.util.*;

public class Main {
    public static void main(String[] args) {
      int[] arr = {1,2,4,10,23,5,11};
      int max = arr[0];
      int min = arr[0];
      for(int i=1;i<arr.length;i++){
        if(arr[i] > max){
          max = arr[i];
        }
        if(arr[i] < min){
          min = arr[i];
        }
      }
      System.out.println("Maximum value in Array "+max);
      System.out.println("Minimum value in Array "+min);
      
  }
}