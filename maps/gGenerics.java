import java.util.*;
class student{
    private String  name;
    private int  id;

}
class Employee{
   private String  name;
    private int  id; 
}
public class gGenerics {
    public static void main(String[] args) {
        student s=new student();
        student t= new student();

        Employee e= new Employee();
// so define which type of data to be used for operation
        ArrayList <student> al= new ArrayList<student>();
       //we are entitled to store all the student kind of  object
        al.add(t);
        al.add(s);
        // we are also storing  employee object
        // and no error is comming



        // al.add(e);//error is comming
        //while typecasting to student type object 
        // employee obj will not convert into  into student while downcasting
// class  class exception will  come
    }
    
}
