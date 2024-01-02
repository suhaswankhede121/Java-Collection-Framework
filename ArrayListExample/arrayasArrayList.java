import java.util.*;

import javax.sql.rowset.Predicate;

public class arrayasArrayList {
    public static void main(String[] args) {
        // int[] arr = {1, 2, 4, 5, 6, 7, 9, 9, 2, 4};
        // List<Integer> list = new ArrayList<>();
        // for(int num:arr){
        //     list.add(num);
        // }
        // Iterator<Integer> it = list.iterator();
        // while (it.hasNext()) {
        //     if (it.next() % 2 == 0) {
        //         it.remove();
        //     }
        // }

        // System.out.println(list);

        String[] arr={"suhas","yxz","xpw","yss"};
        List<String> list=new ArrayList<>();
        for(String str : arr){
             list.add(str);
        }
         list.removeIf(s->s.startsWith("y"));  //no need to mention type we can mention also (String s)-> s.startsWith("y")
        
        System.out.println(list);
    }

}
