class student{
private int age;
private String name;
// because of the private keyword we cannot acess or modify the data from outside the class
//data modification or acess can be done only inside the class

//setting the  values of name and age
public void data(){
    name ="rahul";
    age=12;
}

public void  show(){
    System.out.println(name+" "+age);
}

}
// show method has no existence outside the class 
//so to call it we have to use object referenc

public class first {
    public static void main(String[] args) {
        student obj = new student();
        // obj.age=10;
        // obj.name="rahul";
        obj.data();
        obj.show();
        


    }
    
}

