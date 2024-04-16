//for thread application  runnable interface is a better option
//because we can implement and extend for a class at the same time
//it is a method for using  multiple  inheritance which is not allowed in java
import java.util.Scanner;
class demo{

}//we cannot extend  2 class at the same time
class calc extends  demo implements Runnable {
    public void run(){
        System.out.println("calculation has started");
        Scanner s=new Scanner(System.in);
        System.out.println("enter first  number");
        int num1=s.nextInt();
        System.out.println("enter  second number");
        int num2=s.nextInt();
        int r=num1+num2;
        System.out.println(r);
        System.out.println("calculator task has ended");

       
    }
}//there is no relationship  between the two class as one is referring to thread and another  is not
class message extends Thread{
    public  void run(){
      try{
          System.out.println("focus is important to master skills");
        Thread.sleep(2000);//delay

      }
      catch(Exception e){
        System.out.println(e);
      }
    }
}
public class eExtendsVsImplements {
    public static void main(String[] args) {
    
}
    
}
