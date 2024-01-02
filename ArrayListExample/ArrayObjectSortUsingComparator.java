
import java.util.*;
import java.util.Comparator;

class student{
    private String name;
    private int rno;

    student(String name, int rno){
        this.name=name;
        this.rno=rno;
    }

    public String getName(){ // Gettter Method
        return name;
    }

    public void setName(String name){  //Setter Method
        this.name=name;
    }

    public int getRno(){
        return rno;
    }

    public void setRno(int rno){
        this.rno=rno;
    }

    public String toString(){
        return 
        "{"+
            "Name: "+name+" RollNo "+rno
        +'}';
    }

}

public class ArrayObjectSortUsingComparator {
    public static void main(String[] args) {
        List<student> stu=new ArrayList<>();

        stu.add(new student("suhas", 194));
        stu.add(new student("Aksh",123));
        stu.add(new student("sandy", 67));
        stu.add(new student("Akash", 200));

        System.out.println("sort acoording to their RollNo");

        stu.sort((student1,student2)->{
            return student1.getRno()-student2.getRno();
        });

        System.out.print("Sorting done by RolNo "+stu);

        System.out.println();
        System.out.println("sort acoording to their Name");
        Collections.sort(stu,Comparator.comparing(student::getName));

        System.out.println("Sorting done by their name "+stu);
    }


}
