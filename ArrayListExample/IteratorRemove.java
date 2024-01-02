import java.util.*;

public class IteratorRemove {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);



        Iterator<Integer> numbersIterator = numbers.iterator();
        while (numbersIterator.hasNext()) {
            Integer num = numbersIterator.next();
            if(num % 2 == 0) {
                numbersIterator.remove();
            }
        }

        System.out.println(numbers);


        List<String> str=new ArrayList<>();
        str.add("suhas");
        str.add("om");
        str.add("basi");
        str.add(" ");

        System.out.println(str.contains("om")); //return booleans
        System.out.println(str.indexOf("suhas")); // return index
        System.out.println(str.lastIndexOf(" ")); //retrun index
    }
    

   

}
