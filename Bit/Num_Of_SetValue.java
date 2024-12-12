public class Num_Of_SetValue {
    public static void main(String[] args) {
       numOfSetValue(485);
    }

     static void numOfSetValue(int i) {
       int count=0;
       if(i==0){
       System.out.println(-1);
       }
       while(i!=0){
       i=i&i-1;
        count++;
    }
   System.out.println(count);
}
}