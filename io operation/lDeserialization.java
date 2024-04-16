import java.io.*;
class cricketer implements Serializable{
    private String name;
    private int age;
    private int  runs;
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
public class lDeserialization {
    public static void main(String[] args) throws Exception{
        // cricketer c= new cricketer("sachin",23,32);
        // c.disp();
        /*
         * here we are not creating a object to call the disp()
         * instead  while calling the serializable  object 
         * the seriliazable  object bytes is  reconstructed and 
         * the desired    method can be called
         */
        FileInputStream fis= new FileInputStream("soch");//tells the file name
        BufferedInputStream bos = new BufferedInputStream(fis);
        ObjectInputStream ois= new ObjectInputStream(bos);//file kaha hai
       //after the file has come  it also reconstructs it
      cricketer cr= (cricketer)ois.readObject();//downcasting
      cr.disp();
      fis.close();

    }
}
