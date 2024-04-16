//functional interface
//so if we write another method the compiler will not help us
// but
@FunctionalInterface
// compiler will help us  
//so that the interface cannot have more than one  abstract method
interface demo{
 void disp();
}
@Deprecated
class plane{
public void planeflies(){
    System.out.println("plane is flying");
}
}
class cargoplane extends plane{
//overridden method
@Override
public void planeflies(){
    System.out.println("cargoplane flies low");
}
}
public class dAnnonation {
    public static void main(String[] args) {
        //object of child class
        plane c= new cargoplane();
c.planeflies();
//we are expecting that the answer  that cargoplane flies low is the answer
//if we are writing  something  after  describing it in comment out
//then the code after it doesnot go to the compiler 
//it  is limited to the  user only
//then we have to use  annotation
    }
    
}
