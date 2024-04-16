class student{
private int age;
private String name;

public void setdata(){
    name ="rahul";
    age=12;
}

public void  show(){
    System.out.println(name+" "+age);
}

}
public class second {
 public static void main(String[] args) {
    student obj= new student();
      student obj1= new student();
      obj.setdata();
      obj.show();
//similarly for  the second object we have to
//call the setdata method 
//otherwise it will give  the default value
// obj.setdata();
obj1.show();

 }   
}
