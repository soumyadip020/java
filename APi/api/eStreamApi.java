import java.util.List;
import java.util.function.Predicate;
import java.util.stream.*;
import java.util.Arrays;
public class eStreamApi {
public static void main(String[] args) {
    List<Integer> list= Arrays.asList(2,3,4,5,6);
    Stream<Integer> streamdata= list.stream();
    long count = streamdata.count();
    System.out.println(count);//after doing one operation we cannot perform another operation in stream

    streamdata.forEach(n->System.out.println(n));
} 
 }
