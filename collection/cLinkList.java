import java.util.*;
public class cLinkList {
    public static void main(String[] args) {
        LinkedList l= new LinkedList();
        l.add(100);
          l.add(200);
              l.add(300);
              System.out.println(l);
              LinkedList t= new LinkedList();
              t.add("soumyadip ");
              t.add(123);
              t.add(123.23);
              System.out.println(t);
              //here the linklist follows  doubly linked list ds
              LinkedList y= new LinkedList();
              y.add(121);
              y.add(234.235);
              y.add("pawan");
              y.add(78);
y.addFirst("pyq");
y.addLast(12);
System.out.println(y);
y.add(2,"hut");//replacement
    System.out.println(y);
    System.out.println(y.peek());//returns the first object of the collection
    System.out.println(y.poll());//returns the first object of the collection and then removes it
    }
    
}
