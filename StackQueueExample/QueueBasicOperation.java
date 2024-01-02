//package StackQueueExample;

import java.util.*;
public class QueueBasicOperation {
   public static void main(String[] args) {
    PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
    pq.offer(12);
    pq.offer(123);
    pq.add(23);
    pq.add(13);
    pq.add(34);
    pq.add(8);
    pq.offer(22);
    pq.offer(22); // both method works similar but add() method throws exception if not add sucessfully

    System.out.println(pq);// now return descending order

    pq.poll();
    pq.remove(); // both work similar but remove() throws exception 

    System.out.println(pq.element()); 
    System.out.println(pq.peek());

    Comparator<String> lengthString=(s1,s2)->{
        return s1.length()- s2.length();
       };
    PriorityQueue<String> str=new PriorityQueue<>(lengthString);
    str.add("suhas");
    str.add("Om");
    str.add("dip");
    str.add("akash");
    str.add("shiva");
    str.add("darshan");

   while(!str.isEmpty()){
    System.out.print(" "+str.remove()); //Dequeue
   }
   
   } 
}
