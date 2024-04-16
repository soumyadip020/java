import java.io.*;
public class dEnteringDataIntoFile {
    public static void main(String[] args) throws IOException
    {
        File dir=new File("satya");
        dir.mkdir();
        File file= new File(dir,"israel.txt");
        //it will make a file israel inside the  dir directory
        file.createNewFile();
        //we want to perform task on  israel.txt
        FileWriter fw= new FileWriter(file,true);//because of the true  the existing  data will not be overidden in any way
        //but the  new data can  be added  next to it
        //but the existing data set will not be changed
        fw.write("juicy");//it will be stored as ascii value here
        fw.write(23);//it will be stored as ascii value here
        char ch[]={'j','f','v','a'};
        //we can store array also
        fw.write(ch);//by default .write() has overriding 
        //we have to close the file or it will enter into buffer
        fw.close();
// we can also use the flush method
//the advantage over the close method is that we can also add  data in the future


        System.out.println("open satya to see");
 //yhe data will be stored inside  satya
    }
    //if we are not closing the file  the data will not be transferred from the  ide to the file
    
}
