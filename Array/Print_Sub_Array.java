package Array;
public class Print_Sub_Array {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,0};
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
           
        }
    }
}