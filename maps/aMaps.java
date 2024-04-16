import java.util.*;

// key value using hash map
public class aMaps {
    public static void main(String[] args) {
        HashMap h=new HashMap();
        Hashtable t= new Hashtable();
        LinkedHashMap i= new LinkedHashMap();
       //h.put(key,value)
        h.put(01,"soumyadip");
        h.put(02,"deb");
        h.put(03,"rohit");
        //we can also use null value
        h.put(null,"dock ");
        //we can also put value and  key as null
        h.put(null,"null");
        //value can also be repeated not the  key
        h.put(04,"rohit");
        // h.put(04,"rohit");
        //same key will give error
        System.out.println(h);
        //hashmap doesnot promises whether order of insertion will be preserved each time

        HashMap p = new HashMap();
        p.put("virat","kohli");
        //the key and value can  of of anytye
        //it may be a integer or may be a string
        p.put("Rohit","rohan");
        //order of insertion is not  preserved
        System.out.println(p);
        

        //if we wnat that the order of insertion is preserved then we have to use inked hashmap
        LinkedHashMap o=new LinkedHashMap();
        o.put("hamba","humba");
        o.put("rumba","rumba");
        o.put("tumba","tumba");
        //behind the scene both key and value will be stored as a object
        //and here we are only printing he object we are not acessing the object like that of the iterator

        //hash map  is non synchronised
        System.out.println(o);

    }
    
}
