public class Toggle {
    //0->1
    // 1->0
    public static void main(String[] args) {
        int n=6;
        int i=1;
        int mask=1<<i;
      System.out.println(mask^n);
    }
}
