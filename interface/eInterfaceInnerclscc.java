//inner - member static and anonymous

class A{//static keyword will not work in outer class it can only work in inner class
    public void show(){
        System.out.println("in show");
    }
    class B{//A$B means b is the inner class of A
public void display(){
    System.out.println("in display");
}


    }
}
public class eInterfaceInnerclscc {
    public static void main(String[] args) {
        A obj = new A();
   //for making a object of B we definitely need a object of A
   A.B t=obj. new B();
// syntax to  make a object of inner class




t.display();
        obj.show();
        //though B is the inner class of A but  we cannot call
        //the methods of B by using object reference  of A
    }
}
//adress inner class to a person parent class