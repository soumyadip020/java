//now we have to create a custom annonation
//we have to give the target for custom annonation

import java.lang.annotation.*;

@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})//field = variable
@Retention(RetentionPolicy.RUNTIME)//we are telling the compiler how long it will have the power

@interface cricketplayer{//custom annonation
    //there the cricketplayer annonation is only available to class
    // String country();
    String country()default"India";
    int age() default 24;
//

}
// @cricketplayer(country="india")
// or we can just do
@cricketplayer
class virat{
    
    private int innings;
    private int runs;

    public  int getinnings(){
        return innings;

    }
    public void setinnings(int innings){
        this.innings=innings;
    }
    public  int getruns(){
        return runs;

    }
    public void setruns(int runs){
        this.runs= runs;
    }
}
public class eCustomannonation {
    public static void main(String[] args) {
        virat v= new virat();
        v.setinnings(300);
        v.setruns(20000);
        System.out.println(v.getinnings());
        System.out.println(v.getruns());
        Class c=v.getClass();
        Annotation a=c.getAnnotation(cricketplayer.class);//in a all the content is stored as object
        // when we are retrieving a data  from the  annotation we are  retrieving the data as object
        cricketplayer  cp=(cricketplayer)a;//hence if we want to retrieve it as string or int then we have to downcast it
        String country=cp.country();
        System.out.println(country);
    }
}
