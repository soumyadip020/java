import java.io.*;
public class hBufferReader{
    public static void main(String []args) throws Exception
    {
        File dir= new File("satya");
        File file= new File(dir,"israel.txt");

        FileReader fr= new FileReader(file);
        BufferedReader br=new BufferedReader(fr);
        String line=br.readLine();//we can read the data line by line
// .readLine() returns string

//we are trying to read all the lines  at once
while(line!= null){
    System.out.println(line);
    line= br.readLine();//after reading a line  it will move to the next line
    //here we are  reading line by line 
    //not character  by character
}
    }
}