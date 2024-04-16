public class aMultithreading {
    //whenever  we write a code a  default  thread is made
    public static void main(String[] args) {
        System.out.println("main thred");

        System.out.println("before changing");
        String name=Thread.currentThread().getName();
        System.out.println("the name of the  main thread\t"+name);
        System.out.println("the priority of the main thread\t"   +Thread.currentThread().getName());

   System.out.println("after changing\n");
   Thread t= Thread.currentThread();
   t.setName("soumyadip");
   t.setPriority(1);
   String name1=Thread.currentThread().getName();
   System.out.println("the name of the current thread"    +name1);
   System.out.println("the priority of the main thread is "  +Thread.currentThread().getPriority());
    
    
    
    
    }// we can change the priority  and the name of the mainthread
}
