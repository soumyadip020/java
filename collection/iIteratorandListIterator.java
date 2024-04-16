import java.util.*;

public class iIteratorandListIterator {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        System.out.println(l);
        // here we are printing the collection
        // we are not fetching the values in the collection
        Iterator itr = l.iterator();
        while (itr.hasNext()) {// checks whether anything is present next to it
            // Integer i=(Integer)itr.next();
            System.out.println(itr.next());// goes to the next position
            // iterator concept is available in all the collection
        }
        ListIterator litr = l.listIterator(l.size());// we want to fetch from the reverse
        // the advantage over the iterator is that we can pass index
        while (litr.hasPrevious()) {
            System.out.println(litr.previous());
            // iterator is only available in the arraylist and linkedlist
        }
    }

}
