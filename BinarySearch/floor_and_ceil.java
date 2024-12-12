package BinarySearch;

public class floor_and_ceil {
    public static void main(String[] args) {
       int arr[]={1,2,3,5,8,9};
       System.out.println(ceil(arr,1));
      System.out.println(floor(arr,1));
    } 

    public static int ceil(int arr[],int num){
        int low=0,high=arr.length-1,medium;
        while (low<=high) {
            medium=(low+high)/2;
            if(num==arr[medium])
            return medium;
            else if(arr[medium]>num)
            high=medium-1;
            else
            low=medium+1; 
        }
        if(low<=arr.length-1)
        return arr[low];
        else
        return -1;
    }
    public static int floor(int arr[],int num){
        int low=0,high=arr.length-1,medium;
        while (low<=high) {
            medium=(low+high)/2;
            if(num==arr[medium])
            return medium;
            else if(arr[medium]>num)
            high=medium-1;
            else
            low=medium+1; 
        }
        if(high>=0)
        return arr[high];
        else
        return -1;
    }
}
