import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//package HashSetExample;

public class anotherOperation {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>();
        l1.add(2);
        l1.add(4);
        l1.add(6);

        List<Integer> l2=new ArrayList<>();
        l2.add(3);
        l2.add(6);
        l2.add(9);

        HashSet<Integer> hs=new HashSet(l1); // that hold the hashset value
        hs.addAll(l2); // that all elements using set to list
        System.out.println(hs); 

       hs.removeIf(num->num % 2==0); // lambda expression 
       System.out.println(hs); 
  }
}
