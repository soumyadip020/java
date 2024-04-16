/* uptill java 8 we cannot define a mothod in interface
 * but from  java 8 we can define  a interface
 * 
 * remember  if we make  a method in interface or abstract class
 * then we have to declare it mandatorily
 */
interface A{
    //we can define the method in interface by using default  keyword
    void show();
    default void config(){// to call this we need  a object reference
        System.out.println("in cnfig");
    }
    static void abc(){// to call this we donot need a object reference 
        System.out.println("in abc");
    }
}
class b implements A{
    public void show(){
        System.out.println("in show");
    }
}
public class dInterface {
    public static void main(String[] args) {
        A.abc();
    }
    
}
