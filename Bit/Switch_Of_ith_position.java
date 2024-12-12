public class Switch_Of_ith_position {
    public static void main(String[] args) {
        int n=6;
        int i=2;
        int mask=~(1<<i);
      System.out.println(mask&n);
    }
}
