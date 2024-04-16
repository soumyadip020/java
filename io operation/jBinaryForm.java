//when ever we want  to read  or write   a data in binary form
/*
say for we want to read a data from a  file that contains image
in that case we are  goingto read it in binary form
input stream
output stream
*/
import java.io.*;
//serializable is a marker interaface
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
public class jBinaryForm{
    public static void main(String []args) throws Exception{
 cricketer c= new cricketer("sachin",23,43);
/*
 * if we are creating a object then its  memory will be deallocated
 * once it is used
 * but if we want to keep it persistent then we have to store it inside a file
 * and  if we have to  transfer it over another system
 * then we have to do  networking
 *  even there is a possibility of hacking
 * so we cannot store a data  in any method 
 * that is where the concept of serialisation comes in
 * even if the hacker got the object,with the object the hacker cant do anything
 * with the object
 * 
 * serialisation means we are converting the 
 * object into a sequence of bytes which is not human readable
 * and that data is stored  in the file
 */
 
/* the class needs to implement  serializable interface
 * serializable is  marker interface
 * means there are no  abstract method
 * we have to use object output stream
 * then we have to use file output stream
 * the crushed object can be used  by deconstructing
 * we have to use file input stream
 * 
 * to again  get the object from the seriliased  object
 * we have to write the class of the sereliased object as it is same to same
 * and then we have to  implement it to serialisable 
 * then we can  use the object
 * 
 * 
 */
FileOutputStream fos= new FileOutputStream("soch");
ObjectOutputStream oos= new ObjectOutputStream(fos);// the adress of the object that will carry  object that is to be broken into bytes
oos.writeObject(c);//the main object reference is given here
oos.close();

    }
}