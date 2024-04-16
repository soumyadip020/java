import java.util.Scanner;
class hi{
    int pa;
    float td,si;

    static float ri;
    static{
        ri =6.5f;
    }
    void input(){
        Scanner scan = new Scanner(System.in);
System.out.println("please mention the amt reqd");
     pa = scan.nextInt();
     System.out.println("mention time duration ");
     td= scan.nextFloat();
     
    }
    void compute(){
        si=(pa*ri*td)/1000;
    }
    void disp(){
           System.out.println("si is "+si);
       

    }// it is recommended  not to use static because each object has different value
//the problem that is created is that memory is only allocated only once
}








public class floatt {
    public static void main(String[] args) {
        hi f1= new hi();
        f1.input();
        f1.compute();
        f1.disp();
        hi f2= new hi();
 f2.input();
 f2.compute();
 f2.disp();
    }
    
}
