import java.io.*;
public class eFileReader {
    public static void main(String[] args) throws Exception {
        File dir= new File("satya");//in place of satya we can aso 
        //give the adress of a file
        File  file= new  File(dir,"israel.txt");
    FileReader fd= new FileReader(file);
    int i=fd.read();//.read returns a  corresponding decimal value of the 
    System.out.println((char)i);//we are able to read only one character

while(i!=-1){//this loop  reads all the  data inside the file
    //-1 means the data is empty
    System.out.println(i+"--->");//here the decimal value of i is  printed
    System.out.println((char)i);
   i= fd.read();//ek cahracter ko read kar liya uske baad dusre character me jaa
//then updating i
}

    }
}
