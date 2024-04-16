import java.util.Scanner;
import java.util.*;

public class aArrayList {
    public static void main(String[] args) {
        ArrayList a1= new ArrayList();
        a1.add(100);
        //in any collection if we are storing anything then it is stored as  object 
        //here 100 is stored as a object
        //in arraylist we can store as much data as we want 
        //and necessarily it need not  to be a homogenous one
        //it can be   heterogenous to
        //example we can store a  string in the same arraylist with a integer
        //stores data in the form of object
        a1.add(200);
  a1.add(300);
  System.out.println(a1);
  ArrayList a2=new ArrayList();
  a2.add(400);
  a2.add("j");
  a2.add(1.1);
  System.out.println(a2);
  a2.add(456.256);//hence the size is not fixed  it is dynamic
  //not that like of an array which has a fixed size
  System.out.println(a2);
 ArrayList a3=new ArrayList();
 a3.add(900);
 a3.add(1200);
 System.out.println((a3));
 System.out.println("after adding collection");
 //anything that is stored is stored as a object
 a3.addAll(a2);
 a3.add(1,"pw");//replacing the first index of a3 with pw
System.out.println(a3);
//array list shifting is not recommended because  it will make the other elements to shift
//if we wnat to insert anything at the middle  then  use linklist   
}
    
}
