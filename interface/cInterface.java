interface a{ 
    public  void show();

}
/*a interface can extend another  interface
 * 
 */
interface c extends  a{
void abc();
}
// multiple inheritance is not allowed in   case of inheritance
//  c class cannot extend to a  and b class simultaneously
class b implements a,c{
public void show(){
    System.out.println("in show");
}
public void abc(){
    System.out.println("in abc");
}
}


public class cInterface {
    public static void main(String[] args) {
        //  a obj= new b();
        /*since  we are extending two  interfaces 
         * making the object of one interface type will not
         * allow to call the method of other interface
         */
        b obj= new b();
obj.show();
obj.abc();
    }
}
