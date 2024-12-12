package String;

public class Repeated_String {
    public static void main(String[] args) {
        String s="abca";
        int n=10;
        int result=repeated_String(s,n);
        System.out.println(result);
    }

    private static int repeated_String(String s, int n) {
       int counta=0;
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='a')
        counta++;
       }
       counta=counta * (n/s.length());
       for(int i=0;i<(n%s.length());i++){
        if(s.charAt(i)=='a')
        counta++;
       }
       return counta;
    }
}
