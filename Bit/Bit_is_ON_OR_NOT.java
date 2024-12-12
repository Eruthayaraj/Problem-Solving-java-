public class Bit_is_ON_OR_NOT {
    public static void main(String[] args) {
        int n=6;
        int i=3;
        int mask=1<<i;
        if((mask&n)>1)
        System.out.println("On");
        else
        System.out.println("off");
    }
}
