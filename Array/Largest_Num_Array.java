package Array;
public class Largest_Num_Array {
    public static void main(String[] args) {
        int a[]={20,40,92,35,88};
        int result=largest_Num_Array(a);
        System.out.println(result);
        
    }

    private static int largest_Num_Array(int[] a) {
       int max;
       if(a[0]>a[1]){
        max=a[0];
       }
       else{
        max=a[1];
       }
       for(int i=1;i<a.length;i++){
        if(a[i]>max)
        max=a[i];
       }
       return max;
    }
}
