package Array;

public class SecondLargestArray {

    public static void main(String[] args) {
        int a[]={20,10,32,33,35};
      int result=  Second_Largest_num(a);
      System.out.println(result);
    }

    private static int Second_Largest_num(int[] a) {
        int max1;
        int max2;
       if(a[0]>a[1]){
        max1=a[0];
        max2=a[1];
       }
       else{
        max2=a[0];
        max1=a[1];
       }
       for(int i=2;i<a.length;i++)
       {
        if(a[i]>max1)
        {
            max2=max1;
            max1=a[i];
        }
        else if(a[i]>max2){
            max2=a[i];
        }
       }
       return max2;
    }
}