//ducking = mai  exception nahi handle karunga jisne
//mujhe call kiya hai woh exception handle karega

class demo{
    public void a()throws Exception{//exception of a is carried out by the method who has called it 
b(); 
    }
    public void b() throws Exception//the excerption of a will be  looked after by the method who has called it
    {
        int n=8;
        int m=0;
        //to manage the exception
    // try{
    //      int r=n/m;
    //     System.out.println(r);
    // }   
    // catch(Exception e){
    //     System.out.println("error"+e.getMessage());
    // }
    int r=n/m;
    System.out.println(r);
    }
}

public class eHandlingvsDuckling {
    public static void main(String[] args) {
        demo j=new demo();
        try {
            j.a();
        }
        catch(Exception e){
            System.out.println("throws a error");
        }
        //it is not adviced to  write throws exception  in the main 
        // because it will go to jvm and jvm will not handle the exception
    }
    
}
