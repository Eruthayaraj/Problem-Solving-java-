package Array;
public class Reverse_Araay {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        reverse_Array(arr);
    }
    static void reverse_Array(int arr[]){
        int i=0,j=arr.length-1;
        while (i<j) {
         int temp=arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
         i++;
         j--;
        }
       
    }
}
