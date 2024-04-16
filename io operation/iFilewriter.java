import java.io.*;
public class iFilewriter{
    public static void main(String []args) throws IOException{
        File dir= new File("soch");
        File file= new File(dir,"israel.txt");
/*
while using the buffered writer 
we cannot store   multiple datatype
we can store character
we cannot store boolean or  long
we can use  filewriter to store  different datatypes of data
*/
FileWriter fw =  new FileWriter(file);
PrintWriter pw = new PrintWriter(fw);
pw.write(97);//the correspinding ascii value of 97 will be stored
pw.write("\n");

pw.println("java");
pw.println(100);//here 100 will be stored as a integer value
pw.println('a');//not th eascii value
pw.println(50.23);
//no restriction is there to fill the data
pw.close();
















    }
}