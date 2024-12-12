

import java.util.Scanner;

public class bitmanipulation {
    public static void main(String[] args)   {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     String decimal=decimal_to_binary(n);
     System.out.println(decimal);
     System.out.println(binary_to_decimal(decimal));
    
}

    private static int binary_to_decimal(String n) {
     int result=0;
     int power=1;
     for(int i=n.length()-1;i>=0;i--){
        
        if(n.charAt(i)=='1')
        {
        result=result+power;
    }
        power=power*2;
     }
     return result;
    }

    private static String decimal_to_binary(int n) {
          String remainder="";
          int temp=0;
          while(n>=1){
             temp=n%2;
            remainder=temp+remainder;
            n=n/2;
          }
          return remainder;
    }
    
}