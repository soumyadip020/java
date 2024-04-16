import java.io.*;
public class fFileReader {
    public static void main(String[] args) throws Exception {
        File dir= new File("satya");//in place of satya we can aso 
        //give the adress of a file
        File  file= new  File(dir,"israel.txt");
    FileReader fd= new FileReader(file);
//so using .read() with string array solves the problem but we have to pass a string
char ch[]= new char[(int)file.length()];


//if there are 10 characters then  we have to invoke  .read method() 10 times
//it affects the overall performance
// so the solution is 
fd.read(ch);//.read() reads all the file  and put it in the ch[]  character array


for(char data:ch){
    System.out.println(data);
}

    }
}