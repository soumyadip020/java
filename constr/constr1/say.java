
class student2{
    private String name;
    private int age;
    public student2(){
        this("rohit",13);
    System.out.println("default constructor is called");
    }
    public student2(String name){
        this();// it is calling the constructor with null parameter i.e. the first one
        this.name=name;
        age=19;

    }
    public student2(String name,int age){
        this.name=name;
        this.age=age;


    }
public void disp(){
    System.out.println(name);
    System.out.println(age);
}
}
public class say {
    public static void main(String[] args) {
        student2 s1=new student2();
        s1.disp();
        student2 s2=new student2("rahul");
        s2.disp();
    }
    
}