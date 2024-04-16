
import java.util.*;

class Employee {
    private String name;
    private int empId;

    public Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    // if nothing is described then by default it extends to object class
    public String toString()// overriding tostring method
    {
        return empId + "";
    }

    @Override
    public void finalize() {
        System.out.println("clean up work  by GC before de allocating memoery from heap");

    }

}

public class eHashmapVsWeakHashmap {
    public static void main(String[] args) {

        Employee e = new Employee("Hyder", 171);

        // HashMap h=new HashMap();
        // h.put(e, "Hyder");
        // System.out.println(h);
        /*
         * even though e contains null but garbage collector is unable to collect it
         * because hashmap dominates over garbage collector
         * 
         * SO WE ARE USING WEAKHASHMAP
         * weakhashmap is not dominationg over garbage collector
         */
        WeakHashMap hm = new WeakHashMap();
        hm.put(e, "Hyder");
        System.out.println(hm);

        e = null;// eligible for garbage collection as it is referining to none

        System.gc(); // invocking garbage collector
        // whenever we call garbage collector the finalize method is called by default
        System.out.println(hm);
        // internally garbage collector calls the finalize method to clean everything
        System.out.println("Last line");

    }

}
