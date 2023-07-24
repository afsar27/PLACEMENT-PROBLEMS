import java.util.*;

public class Main {
    public static void main(String[] args) {
      int arr[] = {1,2,3,4,5};
      int n = 2;
      for(int i=0;i<n;i++){
        int j,lastElement = arr[arr.length-1];
        for(j = arr.length-1; j > 0; j--){
          arr[j] = arr[j-1];
        }
        arr[j] = lastElement;
      }
      System.out.println(Arrays.toString(arr));
  }
}