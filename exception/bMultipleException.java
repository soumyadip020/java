

public class bMultipleException {
    public static void main(String[] args) {
        int n=5;
        int m=1;
        int r=0;
        int value[]={4,5,6,7};
        String name=null;
        try{
            r=n/m;
            System.out.println("everthing is ok");
System.out.println(value[7]);  
//except this two exception there can exist other type of exception
r=n/name.length();
//to keep on the safe side always create a extra  catch()
//so that if any exception comes it will save the program
        }
   catch(ArithmeticException e){
    System.out.println(e);
   }
//for one try block we can have multiple  catch block
catch(ArrayIndexOutOfBoundsException e){
   System.out.println(value[value.length-1]);
    System.out.println("stay in your  limits");
}
catch(Exception e){
    System.out.println("something is wrong");
}

System.out.println(r);
System.out.println("bye");

    }
}
