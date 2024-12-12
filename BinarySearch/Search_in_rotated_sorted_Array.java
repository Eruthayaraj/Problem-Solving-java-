package BinarySearch;

public class Search_in_rotated_sorted_Array {
    public static void main(String[] args) {
  
    int nums[]={4,5,6,7,1,2,3};
    int target=7;
   System.out.println( search_in_rotated_sorted_Array(nums,target));
    
}

    private static int  search_in_rotated_sorted_Array(int[] nums, int target) {
        int l=0,m=0,h=nums.length-1;
        while(l<=h){
            m=(l+h)/2;
            if(nums[m]==target)
            return m;
            else if(nums[l]<=nums[m]){
                if(target>=nums[l] && target<nums[m])
                h=m-1;
                else 
                l=m+1;
            }
            else{
            if(target>nums[m] && target<=nums[h])
                l=m+1;
            else 
            h=m-1;
            }
           
        }
        return -1;
    }
      
}
