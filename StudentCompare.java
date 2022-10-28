import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{

    int id;
    String name;
    int age;

Student(int id,String name){
   
   this.id=id;
   this.name=name;
}

}

class StudentComparator implements Comparator<Student>{

@Override
public int compare(Student s1,Student s2){


 return s1.name.compareTo(s2.name);

}

}
class StudentCompare{

  public static void main(String arga[]){

    ArrayList<Student> a1 = new ArrayList();
    a1.add(new Student(1,"s"));
    a1.add(new Student(7,"v"));
    a1.add(new Student(5,"k"));
    a1.add(new Student(10,"p"));
    a1.add(new Student(14,"pa"));


    System.out.println("Before Sorting");

    for(Student s:a1){
           System.out.println("Id: "+s.id+" "+"Name: "+s.name);

    }


    StudentComparator NameComparator = new StudentComparator();
   Collections.sort(a1,NameComparator);

   System.out.println("After Sorting");

   for(Student s:a1){

     System.out.println("Id: "+s.id+" "+"Name: "+s.name);
   }


    
}
}