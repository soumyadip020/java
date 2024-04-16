// need of inteference
//as a developer we are only concerned with computer 
//it may be computer or laptop//so for computer we have to rewrite the code
//for laptop we have to   rewrite a parent class
//instead create a parent class computer



// abstract class computer{
//     public abstract void compilecode();
// }
//or
interface computer{
    void compilecode();
}
class laptop implements computer 
{
    public void compilecode(){
        System.out.println("you got 5 errors");
    }
}
class desktop implements computer{
   public void compilecode(){
        System.out.println("you got 5 errors faster");
    } 
}
class developer{
    // laptop obj=new laptop();//if we write this here the object of the laptop will be created only once

 public void buildapp(computer d)//laptop obj is the type of the obj
//because of this computer d in future we can pass any object 
 {
    System.out.println("building app");
    //  laptop obj=new laptop()// creating multiple object  of the class will create multiple object of the laptop class

    d.compilecode();
 }
}
public class binterface {
    public static void main(String[] args) {
            //  laptop obj=new laptop();
             computer d= new desktop();
        developer  dev =new developer();
        dev.buildapp(d);

    }
    
}
/* use of interface 
 * 1: to create a flow jaha pe dependencies kam ho sake
 * 
 * 2:we crate a design
 * 
 * ex a car has 4 wheels engine 
 * it is the design of the car 
 * the companies implement the design
 * 
 * car design =interface
 * design implementation =  class
 * 
 */
