import java.util.*;

public class dLinkedList {
    public static void main(String[] args) {
     //if parent class is used in making object then the specialised method cannot be acessed
          LinkedList l =new LinkedList();

        l.add(100);
        l.add(200);
        l.add(300);
        System.out.println(l.get(2));
        System.out.println(l.indexOf(100));
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
        l.push(144);
        System.out.println(l);
       System.out.println( l.pop());//the last element inserted will be popped
    }
    }
    

