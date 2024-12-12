package Array;
public class Max_AND_Value_In_ArrayElement {

  public static int maxandvalue(int ar[]){
    int res=0;
    for(int i=0;i<ar.length-1;i++){
        for(int j=1;j<ar.length;j++){
            if((ar[i]&ar[j]) > res){
              res=ar[i]&ar[j];
            }
        }
        
    }
    return res;}


  
    public static void main(String[] args) {
        int ar[]={16,9,6,3};
        System.out.println(maxandvalue(ar));
    }
}
