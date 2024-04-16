
import java.util.InputMismatchException;
import java.util.Scanner;

//we can close without finally by  try with resource method


public class cFinallyException {
    public static void main(String[] args) {
     int num=0;//write a name in the input
        Scanner s=new Scanner(System.in); /*if we are takinga input from database or console then it is acting as a resource
        here we are creating a resource */
        try {
        num=s.nextInt(); //here we are using the resource
     //if we are creating a resource then we must also  close it
    //  s.close();
     //this line will work if there is no exception and if there is exception then the rsource will not be closed 
        }
        catch( InputMismatchException e){
            System.out.println("enter a number");
            //if we close the resource here then it will only ge closed if there is a exception
            //if no exception then it will not close
            //but we want to close the exception even if there is a exception or not
            // s.close();
        }
        //THERE  is a solution 
finally{
    //the things that must be executed even there is exception or not is written here
    s.close();

}

        System.out.println(num);
        //DRY DONOT  REPEAT YOURSELF

    }
    
}
