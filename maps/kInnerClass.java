/* inner class is generally used where agar ek class ho toh
 * dusra class bhi hona chaihe 
 * agar  car ka class ho toh 
 * uske andar   engine ka bhi class hona chahiye
 * we can make the object of  engine if there  is a 
 * object of the  car
 */

public class kInnerClass {
   class engine{//inner class
   void disp(){
    System.out.println("inner class disp");
   }
   }
    public static void main(String[] args) {
        System.out.println("main method outer class main method");
        kInnerClass o= new kInnerClass();
        kInnerClass.engine e =o.new engine();
      
    }
    
}
/* anonymous object
 * ppublic static void main(String args[]){
 * Demo d= new Demo();
 * new Demo().disp();
 * }
 */