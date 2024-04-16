import java.io.*;

public class cFiledirectory {
    public static void main(String[] args) throws Exception
     {
        File dir = new File("pw");
        // System.out.println(dir.isDirectory());//returns a boolean value
        dir.mkdir();
        System.out.println("dir is referring to  directory pw"+ " "+dir.isDirectory());
        
        File t= new File(dir,"soch");//this  line checks whether soch file is present in the dir directory
        t.createNewFile();
        System.out.println("file is reffering to soch"+t.isFile());


        int count = 0;
        File f= new File ("soch");//if soch is present there then  f will refer to it
      String str[]=  f.list();//returns strings of arrays
    //   .list returns all the files in a directory
    // in the form of  array  of strings

    //only the name of the files in the directory will be printed
      for(String name: str){
        System.out.println(name);
    count++;  
    }
    System.out.println("no of  files"+count);

    }
    
}
