import java.io.*;
class cricketer implements Serializable{
     String name;
//we want that the age donot take part in serialization 
//so we would write  age with  transient keyword
   transient int age;
     int  runs;
    public cricketer(String name,int age,int runs){
        this.name= name;
        this.age= age;
        this.runs= runs;

    }
    public void disp(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(runs);
    }

}
public class mSelectiveSerialization {
    public static void main(String[] args) throws Exception {
        // cricketer c= new  cricketer("sachin",23,45);
        // c.disp();
    //     FileOutputStream fos= new FileOutputStream("tits.txt");
    //     //tells wher we have to store the data after serialisation
    //     BufferedOutputStream bos = new BufferedOutputStream(fos);
    //    //object is crushed to bytes  in the next line 
    //     ObjectOutputStream oos=new ObjectOutputStream(bos);
    //     oos.writeObject(c);
    //     oos.flush();
    //     oos.close();
        
    //deserialisation
    FileInputStream fis= new FileInputStream("tits.txt");
        BufferedInputStream bis= new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);
        cricketer cr=(cricketer)ois.readObject();
        cr.disp();
        fis.close();

    }
    
}
