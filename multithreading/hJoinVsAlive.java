class demo implements Runnable{
    public void run(){
        System.out.println("child thread executing");
        try{
            Thread.sleep(3000);//after sleeping for 3 sec it is going back to the runnable state
        }
        catch(Exception e){//again comming fromm the runnable state  it is doing the task
            System.out.println("some problems");
        }
        System.out.println("child thread task compleed");
    }

}

public class hJoinVsAlive {
    public static void main(String[] args) throws Exception
     {
        System.out.println("main thread has started");
demo d= new demo();
Thread t=new Thread(d);
System.out.println(t.isAlive());//false   b
t.start();//thread gets its life when  start method is called not while its object is created
System.out.println(t.isAlive());//true because  thread is given a life




/*main thread is created by default
main thread has started first 
 * and it is the main thread whose task is ended first 
 * then the task of the other threads is completed
 */
t.join();//join method makes the t.start()to complete before the main thread is completely executed
/*normally the main thread is executed first then the other thread is executed 
 * but using join method after starting from the main thread if there is any other 
 * thread then that is executed  then the programm continues to the main method
  */

        System.out.println("main thread task has ended");
    }
    
}
