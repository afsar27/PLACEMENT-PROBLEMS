import java.util.*;

public class Main {
    public static void main(String[] args) {
      int arr[] = {1,2,3,4,5};
      int n = 2;
      for(int i=0;i<n;i++){
        int j,firstElement = arr[0];
        for(j = 0; j < arr.length-1; j++){
          arr[j] = arr[j+1];
        }
        arr[j] = firstElement;
      }
      System.out.println(Arrays.toString(arr));
  }
}