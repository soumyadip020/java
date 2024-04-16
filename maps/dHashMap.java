import java.util.*;

public class dHashMap {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put(1, "rohit");
        ht.put(2, "gaor");
        ht.put(3, "kalo");
        System.out.println(ht);
        /*
         * whn 75 % of the bucket is filled behind the scene the storage
         * space is doubled
         * load factor is 75
         * hasttable is synchromised
         * hash map is not synchronised
         * at a time only one thread works
         * hence hashtable is thread safe
         * 
         * we cannot add null value here
         * order of insertion is not preserved
         */
        ht.putIfAbsent(2, "tahroe");// if kwey 2 and value tahroe is not present then only the
        // this will be added

        TreeMap t = new TreeMap();
        Integer i = new Integer(5);
        t.put(i, "rohit");// also we can write using an object
        // it is not mandatory to represent the key only using a number or a string we
        // can use a object as well
        // it stores the keys and values as object
        t.put(i, "ramesh");
        t.put(4, "tree");
        t.put(3, "reat");
        System.out.println(t);// it gives output in sorted order
        // gives the output in ascending order

    }
}
