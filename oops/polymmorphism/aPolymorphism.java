class aeroplane {
    public void  takeoff(){
        System.out.println("aeroplane is taking off");
    }
    public void fly(){
        System.out.println("aeroplane is flying");
    }
}
class cargoplane1 extends aeroplane{
public void takeoff(){//overriding method
    System.out.println("cargoplane requires longer runway");
}
public void fly(){
    System.out.println("cargo flies at lower height");
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
public class aPolymorphism {
   public static void main(String[] args) {
    cargoplane1  cp= new cargoplane1();
    cp.fly();
    passengerplane1 pp= new passengerplane1();
    pp.takeoff();
    pp.fly();
// polymorphism =  we will call the takeoff method and fly method once but it will be executed multiple times i.e. it will execute this method for every class in which the method is present
// while creating a object 
//syntax obj type = class type
//  for example cp  is of cargoplane1 type  and the class cargoplane1 is of cargoplane1 type
//but this rule can change if there is a parent class
// pp=cp(donot hold because  pp is of  type passenger plane and  cp is of type cargoplane)
// but  there is a exception   we can replace  the type with the parent class
aeroplane ref;//ref is of type  aeroplane which is the parent of cargoplane
ref=cp;
//parent class reference has the capacity to hold  child class object reference
System.out.println("-----------------------------------------------------------");
ref.takeoff();
ref.fly();
ref=pp;//parent class reference has the capacity to hold  child class object reference
ref.fly();



   }

    
}
