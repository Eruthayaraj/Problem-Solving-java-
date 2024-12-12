package Array;
import java.util.Scanner;

public class Largest_one_Consecutive {
    public static void main(String[] args) {
        System.out.println(6&13);
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println(checkconsecutiveone(n));
        System.out.println(consecutiveone(n));

    }

  private static boolean checkconsecutiveone(int n) {
    if((n&(n>>1)) != 0)
      return true;
    else{
      return  false;
    }
}

static int  consecutiveone(int n){
    int count=0;

    while(n>1){
        System.out.println(n);
        n=n&n<<1;
        count++;
    }
    return count;
  }

}