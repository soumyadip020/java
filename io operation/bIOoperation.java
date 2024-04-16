import java.io.*;
public class bIOoperation {
    public static void main(String[] args)throws IOException 
    {
        File t= new File("triumph.txt");// if there is a  triumph file in the directory 
        // then t will refer to that file
        //  if the file donot exist then a new file will not be created rather
        // t will refer to the java  object
        System.out.println(t.exists());//checks whether 
        // if we want that a file will be created   that of a name
        t.createNewFile();
        System.out.println(t.exists());

        //if we  want to make a directory
        File dir= new File("tyre");
        System.out.println(dir.exists());
        //we want that the directory  to be created
        dir.mkdir();
        System.out.println(dir.exists());
    }
    
}
