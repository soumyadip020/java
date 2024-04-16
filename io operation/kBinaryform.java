/*to  make th ecode more efficient we are using buffered   */
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

}
public class kBinaryform {
    public static void main(String[] args) throws Exception {
        cricketer ch= new cricketer("sachin",23,43);

        FileOutputStream fos= new FileOutputStream("israel.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos= new ObjectOutputStream(bos);
        oos.writeObject(ch);
        oos.close();
        




    
}
}