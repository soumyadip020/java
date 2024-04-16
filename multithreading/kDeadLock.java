/*multiple threads stuck in the lock state permanently
 * deu to the mutual  dependancy of resources
 */


class Library implements Runnable
{
    String res1=new String("JAVA");
    String res2=new String("SQL");
    String res3=new String("DSA");
   //if a thread is in running state and it is not getting  the required  resource then it goes to blocked state
    public void run()
    {
        String name=Thread.currentThread().getName();
        if(name.equals("STUDENT1"))
        {
            try
            {
                Thread.sleep(1000);//student1 is finding the book in the library
                synchronized(res1)
                //because of the synchronisedkeyword other  threads cannot acess it
                {
                    System.out.println("Student 1 has acc "+ res1);
                    Thread.sleep(1000);
                    synchronized(res2)
                    {
                        System.out.println("Student 1 has acc "+ res2);
                        Thread.sleep(1000);
                        synchronized(res3)
                        {
                            System.out.println("Student 1 haS acc " + res3);
                            Thread.sleep(1000);
                        }
                    }
                }
            }
           catch(Exception e)
           {
            System.out.println("Some problem");
           }
        }
        else
        {
            try
            {
                Thread.sleep(1000);
                synchronized(res3)
                {
                    System.out.println("Student 2 has acc "+ res3);
                    Thread.sleep(1000);
                    synchronized(res2)
                    {
                        System.out.println("Student 2 has acc "+ res2);
                        Thread.sleep(1000);
                        synchronized(res1)
                        {
                            System.out.println("Student 2 haS acc " + res1);
                            Thread.sleep(1000);
                        }
                    }
                }
            }
           catch(Exception e)
           {
            System.out.println("Some problem");
           }


        }
       
                

    }
}

public class kDeadLock 
{
    public static void main(String[] args) 
    {
         Library lib=new Library();

         Thread t1=new Thread(lib);
         Thread t2=new Thread(lib);

         t1.setName("STUDENT1");
         t2.setName("STUDENT2");

         t1.start();
         t2.start();

         
         
        
    }
    
}

