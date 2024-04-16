class Human{// super class // parent class
    int age;
    void sleep(){
        age=12;
        System.out.println("human needs a good sleep");
        System.out.println(age);

    }
}
// class student{

// }
class student extends Human{//child class //derived class//sub class
    // here we are linking student class with  human class
//after the extend keyword the class which we are writing its properties and methods will be  copied in the class
//which is written before the class which is written before  extend keyword
//in short one class aquiring  behavior and properties of another class
}



public class aInheritance {
    public static void main(String[] args) {
        student st=new student();
        //st.sleep(); there is no sleep method inside the class student so the  compiler is giving an error
st.sleep(); 
    }
    
}
