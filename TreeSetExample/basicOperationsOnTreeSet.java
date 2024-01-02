//package TreeSetExample;


import java.util.*;
public class basicOperationsOnTreeSet {
    public static void main(String[] args) {
       // TreeSet<String> fruit=new TreeSet<>(String.CASE_INSENSITIVE_ORDER);//String.caseInsensitive use to restrict the dublicates whether it is small case or upper case

       TreeSet<String> fruit=new TreeSet<>(Comparator.reverseOrder()); //this will help u to get descending order
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Orange");
       // fruit.add("banana");
        fruit.add("Graphs");

        System.out.println(fruit);

        TreeSet<Integer> num=new TreeSet<>();
        num.add(12);
        num.add(14);
        num.add(1);
        num.add(67);
        num.add(5);
        num.add(72);
        num.add(100);
        num.add(23);

        System.out.println(num.size());
        System.out.println(num.remove(5));
        System.out.println(num.contains(56));
        System.out.println(num.pollFirst());
        System.out.println(num.pollLast());
        System.out.println(num.first());
        System.out.println(num.last());

        num.removeIf(nums->nums % 2==0);

        System.out.println(num);

        int value=25;
        System.out.println("Higher than "+value+ " "+num.higher(value)+" Lower than "+num.lower(value));



    }
}
