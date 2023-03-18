import java.util.*;

public class Main {
    public static void main(String[] args) {
      int n=5;
      for(int row=1;row<=2*n;row++){
        int totalcol = row > n ? 2 * n-row : row;
        for(int col=1;col<=totalcol;col++){
           System.out.print("* ");
        }
         System.out.println();
      }
      
  }
}