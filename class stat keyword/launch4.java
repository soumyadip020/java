class demo{
static int a;
static int b;//1

int m;//3
int n;

static{
    a=10;//2
    b=20;
    System.out.println("control in static block");

}
{
    m=100;//4
    n=200;
    System.out.println("control in non static  block");// when object is made this block is executed

}
 static void  disp1(){
    System.out.println(" val of static variable"+a);//5
  System.out.println(" val of static variable"+b);
 }

 void disp2(){
    System.out.println("value of instance var"+m);//6
 System.out.println("value of instance var"+n);

}
}




public class launch4 {
    public static void main(String[] args) {
        demo d=new demo();
        demo.disp1();
        d.disp2();

    }
}
