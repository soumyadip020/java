import java.util.Scanner;
class calc implements Runnable {
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
public class dThreadRunnableInterface {
    public static void main(String[] args) {
        System.out.println("main thread has started");
        calc c=new calc();
        message m= new message();
        //since both the classes are not extending to the thread class hence we have to make  a thread object for each class seperately
        
        Thread t1=new Thread(c);
        Thread t2=new Thread(m);        
    t1.start();
    t2.start();
    }
    
}
