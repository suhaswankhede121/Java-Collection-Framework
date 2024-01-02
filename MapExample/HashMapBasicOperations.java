import java.security.KeyStore.Entry;
import java.util.*;

class HashMapBasicOperations{
    public static void main(String[] args) {
        HashMap<Integer, String> hm=new HashMap<>();
        hm.put(1,"suhas");
        hm.put(2,"akash");
        hm.put(3, "dip");
        hm.put(4, "shiva");
        // System.out.println(hm);
        // System.out.println(hm.get(4));
        // System.out.println(hm.isEmpty());
        // System.out.println(hm.containsKey(5));
        // System.out.println(hm.containsValue("Dip"));
        // hm.remove(2);
        // System.out.println(hm);

       HashMap<Integer,String> hm2=new HashMap<>();
       hm2.put(44, "rajat");
       hm2.put(32, "ishan");
       hm2.put(67, "sanket");
       
       hm2.putAll(hm); // this function helps to add another collections

       System.out.println(hm2);

       // use foreach to display

      for(Object e: hm2.keySet()){
        System.out.println(e);
      }

      for(Object e: hm2.values()){
        System.out.println(e);
      }

      for(Object i: hm2.keySet()){
        System.out.println(i+ "  "+hm2.get(i));
      }

      //Use of Entry Method which is provided by Map Interface

      HashMap<Integer,String> h=new HashMap<>();

      h.put(23, "cat");
      h.put(56, "mat");
      h.put(76, "dog");

      for(Map.Entry entry: h.entrySet()){
        System.out.println(entry.getKey()+" "+entry.getValue());
      }

      //Use of entry set

      Set s=h.entrySet();
      Iterator it=s.iterator();
      while(it.hasNext()){
       // System.out.println(it.next());
       Map.Entry entry=(java.util.Map.Entry) it.next();

       System.out.println(entry.getKey()+ " "+entry.getValue());
      }
     
    }
}