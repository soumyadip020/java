

public class tire {
    public static void main(String[] args) {
     store.disp1();   
     store d= new store();// if static keyword is used then  we donot need to create a  object  because 
     //static  is independant of the object
     d.disp2();
    //  store.disp2();
    }
    
}

class store {
    static void disp1(){
        System.out.println("hello");
    }
    void disp2(){
        System.out.println("hi");
    }
}