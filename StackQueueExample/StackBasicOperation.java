//package StackQueueExample;

import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;
public class StackBasicOperation {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(12);
        s.push(13);
        s.push(87);
        s.push(56);
        System.out.println(s);

        s.pop();

        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.search(7));
        System.out.println(s.size());
        System.out.println(s.isEmpty());

       Stack<Integer> s1=new Stack<>();

       s1.push(22);
       s1.push(32);
       s1.push(12);
       s1.push(13);
       s1.push(87);
       s1.push(56);

       // Iterate using for each

       for(Object e: s1){
        System.out.print(" "+e);
       }

       System.out.println();

       
       // Iterate using for loop

       for(int i=0;i<s1.size();i++){
        System.out.print(" "+s1.get(i));
       }

       System.out.println();
       
       // Iterate using Iterator 

       java.util.Iterator<Integer> it=s1.iterator();

       while(it.hasNext()){
        System.out.print(" "+it.next());
       }

       System.out.println();

       
       // Iterate using ListIterator

       ListIterator<Integer> lit=s1.listIterator();

       while(lit.hasPrevious()){
        System.out.print(" "+lit.previous());
       }

       // Using lambda 

       s1.forEach(num->{
        System.out.print(" "+num);
       });
    }
    }
