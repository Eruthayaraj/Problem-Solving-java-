import java.util.ArrayList;

/**
 * Lonely_Integer
 */
public class Lonely_Integer {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(3);
        int result=lonely_integer(list);
        System.out.println(result);
    }

    private static int lonely_integer(ArrayList<Integer> list) {
        int n=0;
      for(int i=0;i<list.size();i++){
        if(list.indexOf(list.get(i))==list.lastIndexOf(list.get(i))){
            n=list.get(i);
        }
      }
      return n;
    }
}                        