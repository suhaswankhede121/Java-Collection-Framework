import java.util.HashSet;
import java.util.Objects;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

//package HashSetExample;


class student{
    int rno;
    String name;

    student( int rno,String name){
        this.rno=rno;
        this.name=name;
    }

    public int getRollNo(){ // getter
        return rno;
    }

    public void setRollNo(int rno){ //setter
        this.rno=rno;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    // hashcode and equels helps to remove dublicates

   
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        student customer = (student) o;
        return rno == customer.rno;
    }

    
    public int hashCode() {
        return Objects.hash(rno);
    }

    public String toString(){

        return "{"+

        "Name: "+name+ ", Roll No: "+rno

        +'}';
    }
}
public class userDefinedObjectSet {
    public static void main(String[] args) {
     HashSet<student> stu=new HashSet<>();
     stu.add(new student(194, "suhas"));
     stu.add(new student(167,"aksh"));
     stu.add(new student(123, "dip"));
     stu.add(new student(194,"om"));
     stu.add(new student(194, "suhas"));
     System.out.println("After Removing dublicates ");
     System.out.println(stu);

    }
}
