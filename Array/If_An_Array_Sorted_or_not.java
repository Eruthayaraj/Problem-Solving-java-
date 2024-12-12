package Array;
public class If_An_Array_Sorted_or_not {
    
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(Sortedornot(arr));
    }

    private static boolean Sortedornot(int[] arr) {
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
