import java.util.List;
import java.util.function.Predicate;
import java.util.stream.*;
import java.util.Arrays;
public class gStreamapi {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,3,4,5,6);
        Stream<Integer> streamdata= list.stream();
        Stream<Integer> fildata=streamdata.filter(n->n%2==0);
    //  Stream<Integer> sortedstream=streamdata.sorted();
    //since streamdata has been  used once
    //hence we cannot use 
    Stream<Integer> sortedstream=fildata.sorted();
     Stream<Integer>mapstream=sortedstream.map(n->n*2);//the interface inside sortedmethod is implemented using null
  mapstream.forEach(n->System.out.println(n));  
    //  sortedstream.forEach(n->System.out.println(n));
        
        
    }
    
}
