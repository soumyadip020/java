class demo1{
    void disp(){
        System.out.println("disp written is demo1 class");
    }
}
class demo2 extends demo1 {
// all the properites of demo1 is inherited in demo2
}
class demo3 extends demo2{
//all the properites of demo2 is inherited in demo3
}






public class cMultilevelInheritance {
    public static void main(String[] args) {
        demo3 d=new demo3();
        d.disp();
    }
    
}
