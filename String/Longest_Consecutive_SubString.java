package String;

import java.util.HashSet;
import java.util.Set;

public class Longest_Consecutive_SubString {
    public static void main(String[] args) {
        String s="hello";
        int result=longest_Consecutive_SubString(s);
        System.out.println(result);
    }

    private static int longest_Consecutive_SubString(String s) {
      int maxlen=0;
      for(int i=0;i<s.length();i++){
        Set <Character>se=new HashSet<>();
        for(int j=i;j<s.length();j++){
            if(se.contains(s.charAt(j))){
                maxlen=Integer.max(maxlen, j-i);
                break;
            }
           
        se.add(s.charAt(j));
        }
      }
      return maxlen;
    }
}
