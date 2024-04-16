import java.util.Arrays;
import java.util.function.Consumer;
import java.util.*;
public class cForeachMethod {
    public static void main(String[] args) {
    //  List<Integer> list1= new ArrayList<Integer>();   
    //  list1.add(2);
    //  list1.add(3);
    //  list1.add(4);
    //  list1.add(5);
    //  list1.add(6);
    //  list1.add(4);

        List<Integer> list2 = Arrays.asList(2,3,4,5,6,7);
System.out.println(list2);
            for(Integer i:list2){//since we have defined i as integer hence we donot have to typecast
                //other wise  the contents o  list2 will be stored as object
                //and then we will have to downcast to  integer
                  System.out.println(i);

            }
            Consumer<Integer> cons= new Consumer<Integer>(){//here we are not cerating any object we are using anonymous innerclass
               @Override
               //we have to define the accept method definitely
                public void accept(Integer i){
                        System.out.println(i);
                        //jitne objects hai utni baar  accept method call hoge internally
                }
                
            };
            list2.forEach(cons);//if we want to acess the  objects without creating any loop
            //then we have to define the body of consumer
//here we are  using a consumer  interface  which is indeed a   functionl interface
//also we can do it by using   lamda expression
list2.forEach(i->System.out.println(i));//only we have to give the implementation of  consumer
    }
}
