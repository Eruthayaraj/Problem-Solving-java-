package Array;

public class Next_Greatest_Element {
    public static void main(String[] args) {
        int nums1[] = { 4, 1, 2 };
        int nums2[] = { 1, 3, 4, 2 };
        int res[] = {-1,-1,-1};
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    
                        for (int k = j + 1; k < nums2.length; k++) {
                            if (nums2[j] < nums2[k]) {
                                res[i] = nums2[k];
                                break;
                            } 
                        }
                        break;

                    } 
                } 
            }
        
        for(int i:res){
            System.out.println(i);
        }

    }

}
