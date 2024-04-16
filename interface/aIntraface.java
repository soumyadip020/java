interface A{
    int num=6;//we have to provide value because by default it will be final
    void meth();

}
public class aIntraface {
    public static void main(String[] args) {
        A a=new A() {
            public void meth(){
                System.out.println("hello");
            }
        };
        a.meth();
    }
    
}
