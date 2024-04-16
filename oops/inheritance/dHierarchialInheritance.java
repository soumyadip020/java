


//hierarchical inheritance= oneparent class and multiple child class of the one parent class
//if we donot specify the parent class then by default  it extends to the object class
//if we donot write extends with any class then by default the compiler extends that class  with object class
//object class is the parent of all class in java
class animal // extends object
{
    void sleep(){
        System.out.println("animal needs a good sleep");
    }
}
class tiger extends animal{

}
class moneky extends animal{

}
class deer extends animal{

}


public class dHierarchialInheritance {
    public static void main(String[] args) {
        deer t= new deer();
        t.sleep();
        animal d=new animal();
       // d.  all the methods belong to the object class
    }
    
}
