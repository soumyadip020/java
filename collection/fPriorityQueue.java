import java.util.PriorityQueue;
public class fPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue  p = new PriorityQueue();
        p.add(100);
        p.add(123);
        p.add(150);
        p.add(32);
        p.add(123);
        p.add(23);
        System.out.println(p);//order of insertion is not preserved
        //priority queue follows  min  heap data structure
        p.add(23);
        System.out.println(p);
      //  p.add("pw"); mixed type data is not allowed in  priority queue
    }
}
