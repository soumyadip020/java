import java.util.List;
import java.util.function.Predicate;
import java.util.stream.*;
import java.util.Arrays;
public class fStreamapi {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,3,4,5,6);
    Stream<Integer> streamdata= list.stream();
    Stream<Integer> sorteddata=streamdata.sorted();
    sorteddata.forEach(n->System.out.println(n));//we are iterating over the newly made stream
    
    }
    
}
