import java.util.Scanner;
class calc extends Thread{
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
}
class message extends Thread{
    public  void run(){
      try{
          System.out.println("focus is important to master skills");
        Thread.sleep(2000);//delay
        //if there is a  delay in the thread the thread scheduler will mive the thread line to the other 
        //thread
        //if in that thread there is a delay the  the thread scheduler will move the control back to the first thread
      }
      catch(Exception e){
        System.out.println(e);
      }
    }
}
public class cMultithreading {
    public static void main(String[] args) {
        System.out.println("main thread started");
        calc q= new calc();//as we are making a object of calc and it extends to thread so we are also creating a object of thread also 

        message m=new message();
q.start();//start method is inherited from the thread class
m.start();//with the start method we are passing the threas to the thread scheduler
    }
    
}
