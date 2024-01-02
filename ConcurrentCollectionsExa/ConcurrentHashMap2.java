import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.*;

public class ConcurrentHashMap2 extends Thread {

   static ConcurrentHashMap chm=new ConcurrentHashMap();

    public void run(){
        try{
            Thread.sleep(2000);

        }catch(InterruptedException e){
            System.out.println("Addd new elements");
            chm.put(101, "suhas");
       }
    }
    public static void main(String[] args) throws InterruptedException {
        chm.put(102, "dip");
        chm.put(103, "akash");
        Thread t=new Thread();
        t.start();
        Set s=chm.keySet();
        Iterator it=s.iterator();
        while(it.hasNext()){
            Integer i=(Integer) it.next();
            System.out.println(" "+i);

            Thread.sleep(2000);
        }
        System.out.println(chm);

        
    }
}
