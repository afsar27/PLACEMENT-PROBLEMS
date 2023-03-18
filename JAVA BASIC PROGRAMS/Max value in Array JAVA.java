import java.util.*;

public class Main {
    public static void main(String[] args) {
      int[] arr = {20,2,3,4,5,10,0};
      int result = max(arr);
     
      System.out.println(result);
  }
  static int max(int[] a){
    int max = a[0];
    for(int i=1;i<a.length;i++){
      if(max < a[i]){
        max = a[i];
      }
    }
    return max;
  }
}