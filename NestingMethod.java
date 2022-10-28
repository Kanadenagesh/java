class NestingMethod {

int m,n;
NestingMethod(int x,int y){
 m=x;
 n=y;
}

 int Largest(){
    if (m>n){
        return(m);
    }
    else{
        return(n);
    }
}
void display(){
    int large = Largest();
    System.out.println("Largest number: "+large);
}



    public static void main(String []args){

        NestingMethod n = new NestingMethod(40,80);
        n.display();

    }
}