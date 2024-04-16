
class car implements Runnable{
    public void run(){//method level synchronisation
        try{
            System.out.println(Thread.currentThread().getName()+"has enteredthe parkinglot");
            Thread.sleep(2000);
           synchronized(this)
            {
                 System.out.println(Thread.currentThread().getName()+"got  the car to drive");
 Thread.sleep(2000);
 System.out.println(Thread.currentThread().getName()+"get into the car to drive");
 Thread.sleep(3000);
 System.out.println(Thread.currentThread().getName()+"cameback and parked the car");
            }

        }
        catch(Exception e){
            System.out.println("some prolem");
        }
    }

private void synchronised(car car) {
}
}

public class jBlockSynchronization {
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
