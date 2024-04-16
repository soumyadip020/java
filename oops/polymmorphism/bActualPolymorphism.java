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
class airport{
    public void poly(aeroplane ref){
        ref.takeoff();//polymorphism   polymorphism it will execute takeoff()  method for all child classes
        ref.fly();//polymorphism it will execute fly() method for all child classes
  System.out.println("----------------------------------------------");  }
}
class fighterplane extends aeroplane{
    public  void takeoff(){
        System.out.println("fighter jet  takesoff at higher speed");
    }
    public void fly(){
        System.out.println("fighter jets fly at higher speed");
    }
}
public class bActualPolymorphism {
    public static void main(String[] args) {
        cargoplane1 a= new cargoplane1();
              passengerplane1 b= new passengerplane1();
                    fighterplane c = new fighterplane();
                  airport ar = new airport();
                  ar.poly(a);//a contains adress of the class cargoplane
                  ar.poly(b);// b contains adress of the class passengerplane
                 ar.poly(c);
//ref is recieving  the address of    cargoplane fighter plane and passengerplane


   // if we do polymorphism here the we have to write  fly method  once and it will be executed for  all the  child classes containing this method                  
    }
}
