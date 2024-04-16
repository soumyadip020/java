import java.util.*;
import java.util.Arrays;
import java.util.stream.*;
public class dStreamApi {
    public static void main(String[] args) {
        List<Integer> list =Arrays.asList(2,4,5,6,7);
        // we will create a stream for our  operations 
        Stream<Integer> streamdata=list.stream();
        streamdata.forEach(n->System.out.println(n));
        /*stream  api is generally used when  we want to perform a  operation
         * on a data set but we want that the original dataset remains   unchanged
         *we just create a seperate path and  do operations in that 
         *
         */

    }
}
