
import java.util.*;



public class ArraysSort {
    public static void main(String[] args) {
        List<Integer> num=new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(76);
        num.add(5);
        num.add(11);
        num.add(0);
        num.add(9);
        num.add(11);

        num.sort((n1,n2)->n1.compareTo(n2)); //most important and concise method to
                                            // get sort O(1) space complexity
        System.out.print(" Sort using lambada Expression : "+num);
        System.out.println();
        // Sort using Collections.sort()
        Collections.sort(num);
System.out.println("using Collection for sorting");
        System.out.print(" "+num);


        List<String> str=new ArrayList<>();
        str.add("Suhas");
        str.add("Aksh");
        str.add("om");
        str.add("dip");
        str.add("xyz");
        str.add("pqr");

        System.out.println();
        System.out.println("Using itself sort() provided by List Interface");

        str.sort(new Comparator<String>() {
            public int compare(String name1, String name2) {
                return name1.compareTo(name2);
            }
        });

        System.out.print(" "+str);
        System.out.println();
        System.out.println("...........Lambda Expression......");

        str.sort((name1,name2)->name1.compareTo(name2));

    System.out.print("After Lambda Expression : "+str);
 
    System.out.println();
    System.out.println("...........very very concise way to sort......");
    
    str.sort(Comparator.naturalOrder());

    System.out.println(str);


    }
}
