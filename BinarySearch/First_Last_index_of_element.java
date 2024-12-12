package BinarySearch;

public class First_Last_index_of_element {
    public static void main(String[] args) {
        int nums[]={5,7,7,8,8,10};
        int target=8;
         
         for(int i:searchRange(nums,target))
         System.out.println(i);
    }

    public static int[] searchRange(int[] nums, int target) {
        int starting=0,middle=0,ending=nums.length-1;
        int res[]={-1,-1};
        while(starting<=ending){
            middle=(starting+ending)/2;
            if(nums[middle]==target){
                res[0]=middle;
                ending=middle-1;
            }
            else if(nums[middle]<target)
                    starting=middle+1;
            else
                ending=middle-1;
        }
        starting=0;middle=0;ending=nums.length-1;
        while(starting<=ending){
            middle=(starting+ending)/2;
            if(nums[middle]==target){
                res[1]=middle;
                starting=middle+1;
            }
            else if(nums[middle]<target)
                    starting=middle+1;
            else
                ending=middle-1;
        }

        return res;
       }
}
