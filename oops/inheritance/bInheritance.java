class human2{
    private String name;
int age;
human2(){// super() method put by the  compiler by default  gets a (o) parameterised constructr in the parent class
    //hence  control is taken to human2 constructor
    System.out.println("human2 constructor is called");
}
void sleep(){
    age=13;
    System.out.println("human needs a good sleep");
}
}
class student2 extends human2{

    // student2(){
//super()
    // }
void disp(){
    System.out.println("the age is"+age);
   // System.out.println("the name is"+name);//here a error is present because  private members of a class is not inherited
//constructor donot participate in inheritance
//but here constructor is  executed  because  copmiler will put a default constructor(behind the scene) in the  student2 class
// and  in the default constructor  super() is present  in the first line which calls the  constructor of parent class
//hence control is given to the constructor .otherwise  constructor donot partcipate in inheritance 
}
}


public class bInheritance {
    public static void main(String[] args) {
        student2 st= new student2();
        st.sleep();
        st.disp();

    }
    
}
