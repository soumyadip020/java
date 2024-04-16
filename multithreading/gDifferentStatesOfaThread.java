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



public class gDifferentStatesOfaThread {
    public static void main(String[] args) {
        System.out.println("main thread started");
        demo d=new demo();
        Thread t=new Thread(d);//new state
        t.start();//runnable state(we can assingn a task)
        
    }
    
}
