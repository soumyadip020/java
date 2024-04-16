import java.util.List;
import java.util.function.Predicate;
import java.util.stream.*;
import java.util.Arrays;
public class hstreamMap {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,3,4,5,6);
        Stream<Integer> streamdata= list.stream();
      
        Stream<Integer> finalStream=streamdata.filter(n->n%2==0).sorted().map(n->n*2);
   //since sorted map has the same return type
   //we are calling all the methods simultaneously  
   //unlike calling each of them seperately  by creatinga  new stream
finalStream.forEach(n->System.out.println(n));







    }
}
