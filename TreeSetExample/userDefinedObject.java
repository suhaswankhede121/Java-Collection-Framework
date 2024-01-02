import java.util.Comparator;
import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;


//package TreeSetExample;

class Employee implements Comparable<Employee>{
    String name;
    int id;
   public Employee( String name,int id){
        this.name=name;
        this.id=id;
    }

   public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

   public int getId(){
        return id;
    }

   public void setId(int id){
        this.id=id;
    }

    public boolean equals(Object o){
       if(this==o) return true;
       if(o==null || getClass() !=o.getClass() ) return false;
       Employee employee=(Employee) o;
       return id==employee.id;
    }

    public int hashCode(){
        return Objects.hash(id);
    }

  public  int compareTo(Employee employee){
        return this.getId()-employee.getId();
    }

   public String toString(){
        return "{"+
                     
                       " Name "+name+ " id "+id
        
        +'}';
    }
}

public class userDefinedObject {
    public static void main(String[] args) {
    SortedSet<Employee> emp=new TreeSet<>();
        emp.add(new Employee("Suhas", 101));
        emp.add(new Employee("Akash", 781));
        emp.add(new Employee("Om", 89));

        System.out.println("According to Id : "+emp);

        emp=new TreeSet<>(Comparator.comparing(Employee::getName));

        emp.add(new Employee("dip", 282));
        emp.add(new Employee("Ashwin", 893));

        System.out.println("Sorted According their Name "+emp);

    }
}
