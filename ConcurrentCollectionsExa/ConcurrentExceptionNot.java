import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.*;

class ConcurrentExceptionNot extends Thread {
    static CopyOnWriteArrayList l=new CopyOnWriteArrayList<>();
    public void run(){
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("Updation is occured");
            l.add("C");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        l.add("A");
        l.add("B");

        Thread t=new Thread();
        t.start();
        Iterator it=l.iterator();
        while(it.hasNext()){
            String value=(String) it.next();
            System.out.println(" "+value);
            Thread.sleep(2000);
        }

        System.out.println(l);
    
    }
}