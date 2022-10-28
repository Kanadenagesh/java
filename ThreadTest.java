import java.lang.Thread;
class A extends Thread{

    public void run(){

        for(int i=1;i<=10;i++){
            System.out.println("thread A: "+i);
            System.out.println("Exit from A");
        }
    }
}

class B extends Thread{
        public void run(){

        for(int j=1;j<=10;j++){
            System.out.println("thread B: "+j);
             System.out.println("Exit from B");

        }
    }
}

class C extends Thread{

        public void run(){

        for(int k=1;k<=10;k++){
            System.out.println("thread C: "+k);
             System.out.println("Exit from C");

        }
    }
}

class ThreadTest{

    public static void main(String[] args){

        A aobj = new A();
        B bobj = new B();
        C cobj = new C();
        aobj.start();
        bobj.start();
        cobj.start();
    }

}