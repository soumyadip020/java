
//whenever we write a  class in java if we donot write extends keyword with it then by default  it extends to the object class
//just like super()is put by default in first line of  the constructor
//object is the parent of all class in java
class parent1  //extends object
{
    int age=12;

}
class parent2//extends object
{
    int age=23;
}
class child extends parent1, parent2{
//multiple inheritance means one chid inherits properties and behavior of more than one parent it is not allowed in java
//one child can inherit only one parent ata time
// compiler gets ambiguous = it will get confused\


// it is also callled as diamondshape problem
}




public class eMultipleInheritance {
    public static void main(String[] args) {
        
    }
    
}
