

import java.util.*;

class student implements Comparable<student>{
    private String name;
    private int rno;

   public student(String name, int rno){
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

    //  public int compareTo(student studentanother){
    //     return this.getRno()-studentanother.getRno();
    //  }
    //  public boolean equals(Object o){
    //     if(this==o) return true;
    //     if(o==null || getClass() !=o.getClass()) return false;
    //     student s=(student) o;
    //     return rno==s.rno;

    //  }

    //  public int hashCode(){
    //     return Objects.hash(rno);
    //  }

      // more consise way to compare

      public int compareTo(student anoStudent ){ //either we can use this way compareTo
        if(this.rno<anoStudent.rno){
            return -1;
        }
        else if(this.rno>anoStudent.rno){
            return 1;

        }
        else{
            return 0;
        }
      }


    public String toString(){
        return 
        "{"+
            "Name: "+name+" RollNo "+rno
        +'}';
    }

}

class ComparableExa{
    public static void main(String[] args) {
        // now use arraylist for implementation of comparabl
      List<student> ss=new ArrayList<>();
      ss.add(new student("suhas", 194));
      ss.add(new student("akash",167));
      ss.add(new student("dip",90));
      ss.add(new student("aksh", 894));

      System.out.println("Before sorting the according to their roll No "+ss);

    Collections.sort(ss);
    //Arrays.sort(ss);

    System.out.println("After sorting RollNo : "+ss);

    // using comaparable interface that sort according to thier rollNo

    Comparator<student> newstudent=new Comparator<student>() {
        public int compare(student s1,student s2){
            return s1.getName().compareTo(s2.getName());
        }
    };

     

    


    Collections.sort(ss,newstudent); // Note* we cannot use sort methods for objects type if we have
                                         // single type like integer we can directly used collections.sort(list)
                                          // but here we have name and their roll no we need to first compare and find their hashcode also
                                          // then we able know their order and then we can use sort
    System.out.println("Sorted According to their Names "+ss);

    }
}