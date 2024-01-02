
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
//import java.util.*;

class basicOperationOnLL{
    public static void main(String[] args) {
        // LinkedList ll=new LinkedList();

        // ll.add("suhas");
        // ll.add('A');
        // ll.add(23);
        // ll.add(89.99);
        // ll.add(true);
        // ll.add(false);
        // ll.add(23);
        // ll.add(null);
        // //System.out.println(ll);
        // ll.addFirst(12);
        // ll.addLast("Aksh");
        // System.out.print("After use Deque Methods: "+ll);
        // ll.remove(2);
        // ll.removeFirst();
        // ll.removeLast();
        // System.out.println();
        // System.out.println("Use remove method "+ll);

        // System.out.println(ll.contains("suhas"));//true
        // System.out.println(ll.contains("om"));//false

        // System.out.println(ll.get(2));
        // System.out.println(ll.set(4, "om"));
        // System.out.println(ll);

        // LinkedList ll2=new LinkedList();

        // ll2.add("cat");
        // ll2.add("dog");

        // ll2.addAll(ll);

        // System.out.println(ll2);
        
        // ll2.removeAll(ll);

        // System.out.println(ll2);


        LinkedList ll3=new LinkedList();

        ll3.add(2);
        ll3.add(22);
        ll3.add(87);
        ll3.add(0);
        ll3.add(11);
        ll3.add(52);

        // Collections.sort(ll3);
        // System.out.print("After Sort "+ll3);
        // System.out.println();
        // Collections.sort(ll3,Collections.reverseOrder());
        // System.out.print("To Reverse Sorted order "+ll3);

        //Iterate over the list using foreach

        for(Object e: ll3){
            System.out.print(" "+e);
        }

        System.out.println();
        //Using for Loop

        for(int i=0;i<ll3.size();i++){
            System.out.print(" "+ll3.get(i));
        }

        //use Iterator

        System.out.println();
        Iterator<Integer> it=ll3.iterator();

        while(it.hasNext()){
            System.out.print(" "+it.next());
        }

        //Use Lambda Expression
        System.out.println();
        ll3.forEach(i->{
            System.out.print(" "+i);
        });

System.out.println();
        LinkedList<String> ll4=new LinkedList<>();
        ll4.add("suhas");
        ll4.add("Om");
        ll4.add("Sky");
        ll4.add("Aksh");

        ll4.removeIf(rmv->rmv.startsWith("s"));
        System.out.println(ll4);

        ll4.removeIf(rmv2->rmv2.endsWith("m"));

        System.out.println(ll4);

        ll4.clear();

        System.out.println(ll4);
        System.out.println(ll4.isEmpty());//true


    }
}