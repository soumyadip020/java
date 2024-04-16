public class automaticmethodoverloadin {
    public static void main(String[] args) {
      calc obj =new calc();  
      obj.show(2);//calling of method
      byte b=2;
      obj.show(b);
    }
}
class calc{
    public void show(byte n){
        System.out.println("byte"+n);
    }
    public void show(short n){
        System.out.println("short"+n);
    }
    public void show(char n){
        System.out.println("char"+n);
    }
    public void show(int n){
        System.out.println("int"+n);
    }
    
}// int is printed because by default any number in java is treated as int