import java.io.*;
public class gBufferWriter
{ 
    public static void main(String []args) throws Exception
    {
     /*
     using a .read() for a string of 10 character  .read will  run for  10 times
     
     that is not  beneficial foe the code 
     but using Stringbuffer  once the code is written it will read all the code  */
     File  dir= new File("satya");
     File file=new File(dir,"israel.txt");
     FileWriter fw = new FileWriter(file);
     BufferedWriter bw= new BufferedWriter(fw);
     //for using buffered writer it is mandatory   that the filewriter is present

     bw.write("java");
     bw.newLine();
     bw.write(65);//here the corresponding character will be stored
     bw.newLine();
     char ch[]={'p','w','e'};
     bw.write(ch);
     bw.close();//internally it will close the file writer also

    }
}