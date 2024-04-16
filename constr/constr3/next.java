
 class student1{
private int age;
private String name;
public student1(){
    System.out.println("default constructor is called");
name="rohan";
age =13;
}
public student1(String name){
this.name=name;
age=15;
}

public student1(String name,int age){
    this.name=name;
    this.age=age;

}
public void disp(){
    System.out.println(name);
    System.out.println(age);
}
}
public class next {
    public static void main(String[] args) {
        student1 s1=new student1();
        s1.disp();
student1 s2=new student1("shyam");
        s2.disp();
        student1 s3=new student1("ram",25);
        s3.disp();
    }
    
}
