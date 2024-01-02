import java.util.*;

class allBasicOperation{
    public static void main(String[] args) {
       // HashSet hs=new HashSet(); // default constructor with initial size 16
       // HashSet hs=new HashSet(100,(float)0.95); // specified the size and load factor with 0.95% i
                                                                 //initially it was 0.75 as a load factor
         // HashSet hs=new HashSet(100); // specified size
        // HashSet<Integer> hs=new HashSet<Integer>(); // specified type of data is allowed i.e Integer
        
          HashSet hs=new HashSet();
          
          hs.add(10);
          hs.add("Suhas");
          hs.add(89.089);
          hs.add('A');
          hs.add(true);
          hs.add(null);

          System.out.println(hs); // order is not preserved when we recompile the program always display differnt way

          hs.remove(true);
          System.out.println(hs); //remove true
          System.out.println(hs.contains(12)); //return false 
          System.out.println(hs.isEmpty());
          System.out.println(hs.size());

          // print the HashSet using foreach

          System.out.println("for each");
          for(Object e: hs){     // here is object type that use for differnce type to be accessed
            System.out.print(" "+e);
          }
          System.out.println();

          // using forLoop

          System.out.println("for loop");
          for(int i=0;i<hs.size();i++){
            System.out.print(" "+i);
          }
          System.out.println();

          //use Iterator

          System.out.println("Iterator");
          Iterator<Integer> it=hs.iterator();
          while(it.hasNext()){
            System.out.print(" "+it.next());
          }
          System.out.println();

          //use lambda expression

          System.out.println("lambda expression");

          hs.forEach(itt->{
            System.out.print(" "+itt);
          });

          // we can done mathematical operation on set i.e Unino, Intersection and Differnce
          System.out.println();
          HashSet<Integer> hs1=new HashSet<Integer>();

          hs1.add(1);
          hs1.add(2);
          hs1.add(3);
          hs1.add(4);

          HashSet<Integer> hs2=new HashSet<Integer>();

          hs2.add(3);
          hs2.add(4);
          hs2.add(5);
          hs2.add(6);
          hs2.add(7);

          // we can achieved union by using addAll()
          hs1.addAll(hs2);
          System.out.println(" Union: "+hs1);

         // we can achieved Intersection by using removeAll()

         hs1.removeAll(hs2);
         System.out.println("Intersection: "+hs1);

         // we can achieved Differance and subset also by using containsAll()

         hs1.containsAll(hs2);

         System.out.println("Differnce: "+hs2);





    }
}