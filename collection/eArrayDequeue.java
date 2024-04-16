import java.util.*;
public class eArrayDequeue {
    public static void main(String[] args) {
        ArrayDeque d=new ArrayDeque();//index based operation is not allowed in arrray deque
        d.add(100);
        d.add(200);
        d.add(200);//duplicate elements are allowed in array dequeue
        System.out.println(d);

        //array deque internally follows  double ended queue
        //just like queue we cannot  enter anything at the middle 
        //we can enter a data only at the begining or at the end 
        //just like double ended queue
        d.addFirst(23);
        d.addLast(89);
        System.out.println(d); 
        d.add("pw");//homogenouys and heterogenous data type are allowed
        System.out.println(d);
        d.offer(500);
        d.offerLast(80);//functions  just like first and last
        d.offerFirst(789);
        //if we use offer method then it is not sure whether whether the element will 
        //be added or not but if we use first or lastthen the elemnet will definitely be added
        

    }
    
}
