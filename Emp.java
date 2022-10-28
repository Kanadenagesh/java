import java.util.ArrayList;
import java.util.Collections;

class Emp implements Comparable<Emp>{
    int id;
    String name;

    Emp(int id,String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public int compareTo(Emp o){
        return this.name.compareTo(o.name);
    }

 


    public static void main(String args[]){

        ArrayList<Emp> emps = new ArrayList();

        emps.add(new Emp(45,"nagesh"));
        emps.add(new Emp(34,"Pallavi"));
        emps.add( new Emp(78,"Mrinal"));
        emps.add(new Emp(22,"Meena"));
        emps.add(new Emp(85,"Anjana"));
        emps.add(new Emp(24,"komal"));

        Collections.sort(emps);

            for(Emp e1:emps){
                System.out.println("Id: "+e1.id+" "+"name: "+e1.name);
            }
          
    }
}