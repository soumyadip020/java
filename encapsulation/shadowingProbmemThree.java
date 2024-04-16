class student{
private int age;// here age is a instance variable means variable of the object
private String name;

public void setdata1(int age){//here age is a local variable
    age=age;//compiler always gives preference to local variable 
    // in here the compiler interprts both the age variable  as local variable
    //this problem is known as  shadowing problem 
}
public void setdata2(){
    name ="rahul";

}

public void  show(){
    System.out.println(name+" "+age);
}

}
public class shadowingProbmemThree {
    public static void main(String[] args) {
        student obj= new student();
           student obj1= new student();
           obj.setdata1(12);//we are passing  12 to the local variable
           obj.show();
           obj1.setdata1(23);
           obj.show();

    }
    
}
