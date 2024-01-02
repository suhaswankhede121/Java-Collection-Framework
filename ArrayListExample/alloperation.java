import java.util.*;

 class alloperation{
    public static void main(String[] args) {
        List<Integer> al=new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);

        al.add(5, 6);

        List<Integer> al2=new ArrayList<Integer>();

        al2.add(7);
        al2.add(8);
        al2.add(9);
        al2.add(10);

        al.addAll(al2);
//   System.out.println("..........Remove Using Interator ()..........");
      
//      Iterator<Integer> iter=al.iterator();
//      while(iter.hasNext()){
//         Integer num=iter.next();
//         if(num % 2==0 ){
//             al.remove(num);
//         }
//      }
// System.out.println(al);
        //List Iterate using lambda Exapressions
        System.out.println("..........Lambda Expression ...........");
        al.forEach(it->{
            System.out.print(" "+it);
        });
        System.out.println();
       
        System.out.println("..........Interator ()..........");

        Iterator<Integer> it=al.iterator();
        while(it.hasNext()){
            System.out.print(" "+it.next());
        }

        System.out.println();
       
        System.out.println("..........ListInterator ()..........");


        ListIterator<Integer> lit=al.listIterator(al.size());
        while(lit.hasPrevious()){
            System.out.print(" "+lit.previous());
        }
        System.out.println();
       
      

   //  Object arr[]={1,"suhas",7.3,'A'};

// for(Object e:arr){
//     System.out.println(e);
// 
    // System.out.println(al3);

       System.out.println("new Array list :- " +al );


        // accessing the elements 

        // System.out.println(al.size());
        // System.out.println(al.get(9));
        // System.out.println(al.set(2, 12));
        // System.out.println(al);
        // System.out.println(al.isEmpty());


        //removing elements from array 

    //    List<String> str=new ArrayList<>();
    //    str.add("suhas");
    //    str.add("akash");
    //    str.add("om");
    //    boolean isremove=str.remove("om");
    //    System.out.println(isremove);

    //    str.remove(1);
    //    System.out.println(str);

    // al.removeAll(al2);
    // System.out.println(al);

    // str.removeIf(new Predicate<String>(){

    //     public boolean test(String s){
    //         return s.startsWith("o");
    //     }
    // });

   // str.removeIf(p->p.startsWith("s"));   //lambda expressions
    // str.removeIf(new Predicate<String>(){

    //     public boolean test(String s){
    //         str.removeIf(s->s.startsWith("s"));
    //     }
    // });
//System.out.println(str);

    

    }
}