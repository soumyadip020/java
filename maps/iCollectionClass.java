import java.util.*;
public class iCollectionClass {
    public static void main(String[] args) {
        ArrayList a= new ArrayList();
        a.add(120);
        a.add(450);
        a.add(140);
        a.add(12);
        a.add(40);
        System.out.println(a);
        // if i want to sort it then
        Collections.sort(a);
        System.out.println(a);

         ArrayList <String>b= new ArrayList<String>();
        b.add("sobha");
        b.add("sanya");
        b.add("surya");
        b.add("satya");
        b.add("soch");
        Collections.sort(b);
        System.out.println(b);
        // if i  want to search anything in the arraylist
        int index = Collections.binarySearch(b,"sobha");
        //binary search willl return a integer value
        System.out.println(index); 
        //binary search can only be applied if the data is in sorted order
        
        //rotating the index
        Collections.rotate(b,3);
        System.out.println(b);
        //rotate matlab jis index ko denote kar rahe hai wahi se hi suru hoga
        Collections.shuffle(b);
        System.out.println(b);
        System.out.println(Collections.frequency(b,"sanya"));//tells how many times sanya is present
    }
}
