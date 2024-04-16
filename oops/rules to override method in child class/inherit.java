class animal{
    private void eat(){
        System.out.println("animal eats everyday");
    }
    public void age(){
        System.out.println("age is");
    }
    public void num(int n){

    }
}
class tiger extends animal{
    public void eat(){//we cannot decrease  the visibility of the inherited  method in  child class
        //suppose the method is private in the parent class
        //when  it is inherited in child class we can increase the visibility  by changing the method to public
        //  but the reverse is not possible
        System.out.println("tiger hunts and eats");
    }
    public int age(){// we cannot change the return type of the inherited method  in child class
        return 1;
    }
    public void num(){//specialised method
//if there is a parameterised  method in parent class and inherited in the child class
//if we are not passing any parameter  then that method in child class becomes specialised method
//and this method is not overridden from parent class
    }
}
// class animal{
//    public void eat(){
//         System.out.println("animal eats everyday");
//     }
// }
// class tiger extends animal{
//     private void eat(){
//         System.out.println("tiger hunts and eats");
//     }
// }

public class inherit {
      public static void main(String[] args) {
      tiger  t= new tiger();
      t.eat();

    }
}
