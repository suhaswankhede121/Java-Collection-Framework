import java.sql.Struct;
import java.util.*;

class User{
    private String name;
    private int age;

    User(String name,int age){
        this.name=name;
        this.age=age;
    }

    //getter
    
   public  String getName(){
        return name;
    }

    // setter

  public void setName(String name){
         this.name=name;
    }

    public int getAge(){
        return age;
    }

    public void setName(int age){
        this.age=age;
    }

}

public class userDefinedObject {
    public static void main(String[] args) {
       List<User> list=new ArrayList<>();
       list.add(new User("suhas", 22)); //Important Concepts 
       list.add(new User("om", 22));

       list.forEach(User->{
        System.out.print("name: "+User.getName()+": Age :"+User.getAge()+"\n");
       });
        
    }
}
