import java.util.Scanner;
public class dTrywithresource {
    public static void main(String[] args) {
       int num=0;
   
    try( Scanner s= new Scanner(System.in) ){//try with resource
        //here the motive is the resource is meant to be closed evenif there is 
        //exception or not
num=s.nextInt();

    }//after this  block the resource will be closed

    System.out.println(num);
    }
    
}






