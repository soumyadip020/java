class demo1 extends Object {
    //every parent class is a   child of Object class
int a,b;

public demo1(){
    System.out.println("parent class constructor is called");
}
public demo1(int x,int y){
    x=a;
    y=b;
    System.out.println("parameterisd parent constructor is called");
}
}
class demo2 extends demo1{
    int m,n;
public demo2(){
    //super() by defaultr it is called
    super(10,20);
     System.out.println("child class constructor is called");
}
public demo2(int x,int y){

    //due to object creation super method is called by default
    //supermethod() calls the constructor of the  parent class that matches with the parameter
    //if nothing is written in the constructor super or this 
    //then the compiler will put a super()  by  default in the first line of consructor 
    m=x;
    n=y;
    System.out.println("parameterisd child  constructor is called");
}
}


public class inherit {
    public static void main(String[] args) {
    demo2 d= new demo2();// withod even caling parent constructor is called because of super method due to object creation

// demo2 d2 = new demo2(10,20);
}
    
}
