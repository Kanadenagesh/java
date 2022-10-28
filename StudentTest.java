import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class student{

    int id;
    String name;

    student(int id,String name){
        this.id=id;
        this.name=name;
    }
}

class NameCompare implements Comparator<student>{

    @Override
    public int compare(student s1,student s2){
   
   return s1.name.compareTo(s2.name);

    }
}

class StudentTest{

    public static void main(String args[]){

    ArrayList<student> a1 = new ArrayList();
    a1.add(new student(10,"z"));
    a1.add(new student(9,"x"));
    a1.add(new student(8,"y"));
    a1.add(new student(7,"s"));
    a1.add(new student(5,"r"));

    NameCompare NameBased = new NameCompare();


    System.out.println("Before Sorting");

    for(student s1:a1){

        System.out.println("Id: "+s1.id+" "+"Name:"+s1.name);
    }

    Collections.sort(a1,NameBased);

        System.out.println("After Sorting");

    for(student s1:a1){

        System.out.println("Id: "+s1.id+" "+"Name:"+s1.name);
    }

    }
}