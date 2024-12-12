package Array;

import java.util.Arrays;

public class Remove_dupplicate_array {
    
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4};
        Arrays.sort(arr);
       int rd= removedupplicatearray(arr);
        for(int i=0;i<rd;i++)
        {
            System.out.print(arr[i]+" ");
        }
       

       
    }


    private static int removedupplicatearray(int[] arr) {
       int rd=0;
       for(int i=1;i<arr.length;i++){
        if(arr[rd]!=arr[i]){
            rd++;
            arr[rd]=arr[i];
        }
       }
       return rd+1;
       
    
}
}

