import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class withCopyOperations {
    public static void main(String[] args) {
        ArrayList l=new ArrayList<>();
        l.add("A");
        l.add("B");

        CopyOnWriteArrayList l1=new CopyOnWriteArrayList<>();
        l1.add("A");
        l1.addIfAbsent("C");
        l1.addAll(l);

        ArrayList l2=new ArrayList<>();
        l2.add("B");
        l2.add("N");
        l2.addAll(l1);

        System.out.println(l2);
    }
}
