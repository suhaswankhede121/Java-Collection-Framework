
import java.util.*;;


class Employee{
    int id;
    String name;
    String city;
    Employee( int id,String name, String city){
        this.id=id;
        this.name=name;
        this.city=city;
    }

    int getId(){
        return id;

    }

    void setId(int id){
        this.id=id;
    }

    String getName(){
        return name;
    }

    void setName(String name){
        this.name=name;
    }

    String getCity(){
        return city;
    }

    void setCity(String city){
        this.city=city;

    }


    // to diplay proper output we can use toString()

   public String toString(){
        return "Employee{"+

        "Id :"+id+ " Name: "+name+ " City: "+city

        +'}';
    }
}
public class userDefinedObject {
    public static void main(String[] args) {
        HashMap<Integer,Employee> hm=new HashMap<>();
        hm.put(101,new Employee(101,"suhas","wardha"));
        hm.put(102,new Employee(102,"akash", "nagput"));
        hm.put(103 ,new Employee(103, "shiva","wani"));

        System.out.println(hm);
    }
}
