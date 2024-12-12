package Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Thrid_largest {
    public static void main(String[] args) {
        int[] array = {5,3,2,2,3,1,7,6,33,8};
        Set ss=new TreeSet();
        // Convert array to ArrayList
        for (int var : array) {
           ss.add(var); 
        }
        int thrid=ss.size()-3;
        List a=new ArrayList<>(ss);
        System.out.println(ss);
        System.out.println(a.get(thrid));
    }
}
