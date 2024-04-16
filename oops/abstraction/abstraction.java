abstract class aeroplane {
    //if there is a method in java  which has no body or defination then we have to write  abstract in front of it or it will give error
   abstract public void  takeoff();
    // if we have to make a method  as abstract then  it is mandatory to  write abstract in front of the class as well
   abstract  public void fly();// this line is called as signature
   //if in a class contains all abstract  method  then we can say 100 percent abstraction is done 
   // the advantage of abstraction is that there will be no implementation 
   public void landing(){
    System.out.println("plane is landing");////if there is a non abstract method  then we cannot achieve 100 percent abstraction
   }
}
class cargoplane1 extends aeroplane{
public void takeoff(){//overriding method
    System.out.println("cargoplane requires longer runway");
}
public void fly(){
    System.out.println("cargo flies at lower height");
}
//specialised method:- a method that is present only in the child class but not in the parent class
public void alert(){
    System.out.println("alert....");
}
}
class passengerplane1 extends aeroplane{
    public void takeoff(){ //overriding method
        System.out.println("passenger plane requres  medium size runway");
    }
    public void fly(){
        System.out.println("passenger plane flies at medium height");
    }
}

class fighterplane extends aeroplane{
    public  void takeoff(){
        System.out.println("fighter jet  takesoff at higher speed");
    }
    public void fly(){
        System.out.println("fighter jets fly at higher speed");
    }
}
public class abstraction {
    public static void main(String[] args) {
        aeroplane cp=new cargoplane1();
cp.fly();
cp.takeoff();
//cp.alert()
//here it is givin a error because using a oblect of type parent class we can call inherited method or  overridden method
//but we cannot call specialised method
//this can be solved if we make a object of child class type or by downcasting
((cargoplane1) cp).alert();//type of type casting
//temporarily we are changing the type of object from  parent type to child type


// we cannnot make a object of a abstract class in javaor we cannot initiate it
//abstract class= incomplete class
    }
    
}
