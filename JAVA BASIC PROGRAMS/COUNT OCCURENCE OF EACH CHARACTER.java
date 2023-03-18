import java.util.*;

public class Main {
    public static void main(String[] args) {
      HashMap<Character,Integer> map = new HashMap<>();
      String str = "ABCDEABCDE";
      char ch;
      int count = 0;
     for(int i=0;i<str.length();i++){
       ch = str.charAt(i);
       if(map.containsKey(ch)){
         count = map.get(ch);
         count++;
         map.replace(ch,count);
       }
       else{
         map.put(ch,1);
       }
     }
     for(char c : map.keySet()){
       System.out.println(c+"="+map.get(c));
     }
  }
}