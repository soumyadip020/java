import java.util.*;
public class hHashesSetandLinkedSet {
    public static void main(String[] args) {
       HashSet h= new HashSet();
       //index based axessing is not allowed
       h.add(100); 
              h.add(20); 
                     h.add(30); 
                            h.add(40); 
                             System.out.println(h);//order insertion is not preserved
                             //hashing follows hash data
                             //duplicate values are not allowed
                             //stores data in bucket
                             //if 75 percent of the buckets are filled then dynamically the size will get doubled


                             //if we want to retain the order of the data in which it is inserted
                        LinkedHashSet q= new LinkedHashSet(); 
                                q.add(100); 
              q.add(20); 
                     q.add(30); 
                            q.add(40);    
    }
    
}
