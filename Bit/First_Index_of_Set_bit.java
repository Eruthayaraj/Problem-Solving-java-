public class First_Index_of_Set_bit {
    public static void main(String[] args) {
        int i=40;
        System.out.println(first_Index_of_Set_bit(i));
       
    }
   static int first_Index_of_Set_bit(int n){
    int i=n;
    int index=1;
    int mask=1;
    if(i==0){
        return-1;
    }
    while((i&mask)==0){
      mask= mask<<1;
        index++;
    }
    return index;
   }
}
