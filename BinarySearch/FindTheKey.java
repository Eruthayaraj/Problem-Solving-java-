package BinarySearch;

public class FindTheKey {
    
    public static void main(String[] args) {
        int arr[]={1,13,15,22,34,66,99};
        int key=99;
        System.out.println(binarySearch(arr,key));
    }

    private static int binarySearch(int[] arr, int key) {
      int low=0,mid=0,high=arr.length;
      while (low<=high) {
        mid=(low+high)/2;
        if(arr[mid]==key)
        return mid;
        else if(key < arr[mid])
        high=mid -1;
        else
        low=mid+1;
    }
    return -1;
}
}
