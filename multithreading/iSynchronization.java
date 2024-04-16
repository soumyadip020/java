/*multiple threads executes   one single resource
 * is shared  my multiple threads at the  same time
 * 
 * it is also called as the race around problem
 * 
 * by using synchronised keyword  many threads are using the same resource
 * oe by one the threads are executed first of all one thread is executed completely 
 * then the next thread is executed
 */
class car implements Runnable{
  synchronized  public void run(){//method level synchronisation
        try{
            System.out.println(Thread.currentThread().getName()+"has enteredthe parkinglot");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+"got  the car to drive");
 Thread.sleep(2000);
 System.out.println(Thread.currentThread().getName()+"get into the car to drive");
 Thread.sleep(3000);
 System.out.println(Thread.currentThread().getName()+"cameback and parked the car");
        }
        catch(Exception e){
            System.out.println("some prolem");
        }
    }
}


public class iSynchronization {
    public static void main(String[] args) {
        car c=new car();
        Thread  t=new Thread(c);
             Thread  q=new Thread(c);
                  Thread  i=new Thread(c);
                  t.setName("son-1");
                  q.setName("son-2");
                  i.setName("son-3");
     t.start();
     q.start();
     i.start();

    }
    
}
