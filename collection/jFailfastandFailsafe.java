import java.util.*;
import java.util.concurrent.*;

public class jFailfastandFailsafe {
    public static void main(String[] args) {
        // ih collection acessing data using loops can be dangerous
        ArrayList a = new ArrayList();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        // for(int i=0;i<a.size();i++){
        // System.out.println(a.get(i));
        // a.add(12);//while fetching the collection if we are adding data in the
        // collection then it will turn into a infinite loop
        // }
        // while acessing we are adding
        // failfast, concurrent exception
        Iterator i = a.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
            // a.add(100);
        }
        // such that runtime exception donot come
        // use failsafe
        CopyOnWriteArrayList l = new CopyOnWriteArrayList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        System.out.println(l);
        Iterator q = l.iterator();
        while (q.hasNext()) {
            System.out.println(q.next());
            a.add(100);
            // here concat modification is failing and is not runnung by any chance
            // that is a good signal and it is occuring without any exception
            // it is the difference between fail fast and failsafe
            /*
             * in failfast adding elements while fetching creates exception
             * in failsafe concat modification sucessfully fails
             * while running
             */

        }

    }

}
