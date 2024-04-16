import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class gCheckedUncheckedException {
    public static void main(String[] args) {

        //unchecked exception
        int r=7/8;// the  compiler may throw a error but it is checked at  runtime




        //the compiler will not stop it atleast the code will run
        //thats a different thing that it will stop at the middle
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));//works like  that of  scanner
        // String str=br.readLine();
        //the compiler  is forcibly telling to  handle the exception
        //because  it is being checked at compile time
        //this can be solved by try catch
          
          try{
            //checked exception
String str=br.readLine();
          }
             catch(IOException e){
        e.printStackTrace();
    }
    }
 
}
