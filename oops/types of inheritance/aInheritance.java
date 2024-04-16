class aeroplane{
    public void takeoff(){
        System.out.println("aeroplane is taking off");
    }
    public void fly(){//overridden method
        System.out.println("aeroplane is flying");
    }
}
class cargoplane extends aeroplane{
// fly method from  the aeroplane class is inherited here 
//but we want to override it
public void fly(){//overriding method
    System.out.println("cargoplane flies at a lower height");
    //we are just modifying the method that we have inherited from  aeroplane class
}
public void carrygoods(){//specialised methods
    System.out.println("carry passengers");
}
}
class passengerplane extends aeroplane{
public void fly(){//overriding method
    System.out.println("passenger plane flies at medium heoght");
}
public void carrypassengers(){//specialised methods
    System.out.println("carry passengers");
}
}
//such methods which are not present in the parent class but is present only in the child class such methods are known as 
//specialised methods


public class aInheritance {
    public static void main(String[] args) {
        cargoplane cp =new cargoplane();
        cp.takeoff();
        cp.fly();
        passengerplane pp= new passengerplane();
        pp.takeoff();
        pp.fly();
    }
}
