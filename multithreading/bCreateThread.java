public class bCreateThread {
    /*whenever we want to do differnt tasks simultaneously 
    then we need to do multi threading
    for this we have to create  a thread of our own

two ways to create multiple threads
1:by extending thread class
2:by implementing runnable interface

     */
    public static void main(String[] args) {
    Mythread t=new Mythread();
    t.start();
    /*
     * jo bhi task execute hona hota hai woh humko  run method ke andar  define karna hot hai
     * and we cannot call  run method if we do then the program will act like a  single threaded  program
     
inside the start   method  the  run method is called
THREAD SCHEDULER SCHEDULES WHICH THREAD WOULD BE CALLED FIRST AND WHICH ONE WILL BE CALLED LAST 

WHENEVER WE MAKE A THREAD BY OURSELF WE HAVE TO REGISTER THAT THREAD TO THE  THREADSCHEDULER
 IT CAN BE DONE BY BY CALLING THE START METHOD
     */
}
    
}
class Mythread extends Thread{
    public void run(){
        System.out.println("child thread");
    }
}