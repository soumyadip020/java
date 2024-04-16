import java.util.*;
public class gTreeSet {
   public static void main(String[] args) {
    TreeSet t= new TreeSet();
    t.add(100);
    t.add(560);
    t.add(53);
    t.add(895);
t.add(785);
t.add(12);
t.add(59);
t.add(78);
System.out.println(t);//order of insertion is not allowed
//data is stored in sorted order
//tree set follows binary search tree
t.add(100);
System.out.println(t);
//duplicates are not allowed in  tree set
System.out.println(t.higher(200));//only the values above 200 will be printed
System.out.println(t.lower(400));//only the values below 400 will be printed
System.out.println(t.ceiling(600));  //if 600 is in the collection then it will give 600 otherwise it  will give the value which is greater and nearest to 600
System.out.println(t.floor(300));//if 300 is present as a oject then it will provide 300 as the floor and 
//if 300 is not preset as a object then it will
//give the values which are  which is the lowest nearing of  300 
} 
}
