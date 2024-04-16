
/*we can interupt a thread only when it is in the 
blocked or waiting state
we cannot interupt a  thread when it is in the runnung state
we have to use join()or sleep()
 */
class tam implements Runnable{

 public void run(){
    for(int i=0;i<3;i++){
    System.out.println("focus is important");
        try {
             System.out.println("focus is important");
            Thread.sleep(3000);
        } 
        catch (InterruptedException e) {
            System.out.println("thread is interrupted");
        }

}

 }

}
public class iInteruppedMethod {
    public static void main(String[] args) {
tam t=new tam();
Thread y= new Thread(t);
y.start();
y.interrupt();//no 
    }
    
}
