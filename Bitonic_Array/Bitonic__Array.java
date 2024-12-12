package Bitonic_Array;

class Bitonic__Array{
    public static void main(String[] args) {
        int a[]={1,3,5,7,4,2,0};
        int key=0;
       int bindex= find_bitonic(a);
       System.out.println(a[bindex]);
       System.out.println(search(a, key, bindex));
    }

    private static int find_bitonic(int[] a) {

        int l=0,r=a.length-1,m;
        while(l<=r){
            m=(l+r)/2;
            if(a[m]>a[m-1] && a[m]>a[m+1])
            return m;
            else if(a[m]>a[m-1]&&a[m]<a[m+1])
            l=m;
            else
            r=m;
        }
return -1;
    }
    private static int search(int a[],int key,int bindex){
        if(key==a[bindex])return bindex;
        if(key>a[bindex])return -1;
        int res=ascending_binary_search(a,bindex-1,key);
         if(res!=-1)return res;
        int res1= descending_binary_search(a,bindex+1,key);   
             if(res1!=-1)return res1;
        return-1;
    }

    private static int descending_binary_search(int[] a, int range, int key) {
        int l=range,r=a.length-1,m;
        while(l<=r){
         m=(l+r)/2;
         if(a[m]==key)
         return m;
         else if(key<a[m])
         l=m+1;
         else
         r=m-1;
        }
        return -1;
     }
 

    private static int ascending_binary_search(int[] a, int range, int key) {
       int l=0,r=range,m;
       while(l<=r){
        m=(l+r)/2;
        if(a[m]==key)
        return m;
        else if(key<a[m])
        r=m-1;
        else
        l=m+1;
       }
       return -1;
    }
}