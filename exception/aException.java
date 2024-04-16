//exception is nothing but runtime error
/*
 * statement are of two types
 * 1 normal statement ex int n=6,int m =0
 * 2 critical statement r=n/m
 * critical statement= the statement where a  error can possibly come 
 * 
 * 
 * 
 * exception is a class in java
 */
public class aException {
    public static void main(String[] args) {
        int n=5;
        int m=0;
        int r=0;
        try{//in try block we put the lines where there is a possibility of exception to come 
                 r=n/m;//if a exception comes thern it will throw a  exception object 
                 System.out.println("everthing is ok");//if a exception comes then the lines below the exception line will not be executed
        }
        catch(ArithmeticException e)//  to catch the exception object we are having the catch()
        //here the object of arthimetic exception is thrown
        //so no error



        //exception is a super class of arithmetic exception  so we can write exception in place of it


   {//if exception comes then the things that we want to execute  will be written here
System.out.println("something went wrong");
   }
   //if exception comes then  then the line which is written after the catch block will be executed
   System.out.println(r);
   System.out.println("bye");
    }
    
}
