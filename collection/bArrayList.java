import java.util.*;



public class bArrayList {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add(100);
        a.add(200);
        a.add(300);
        //checks whether the  arraylist contains the given element
    System.out.println(a.contains(200));
    int t=a.indexOf(300);
    System.out.println(t);
    System.out.println(a.size());
    a.ensureCapacity(10);//it will make sure that 10 locations are reserved  in the collection where we can store data
    //ecven if we  use more  capacity than that of  the declared  then no problem will occur
    //suppose we have  declared 20 capacity and we are using 40 capacity then also there will be no problem
    a.trimToSize();//deletes the empty index
    System.out.println(a.size());
    a.clear();// all elements are deletd in the collection
    List b=new ArrayList();
    b.add(20);
    System.out.println(b);
    }
    
}
