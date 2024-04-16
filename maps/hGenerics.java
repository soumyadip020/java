import java.util.*;

class gen<T> // because of this T we are able to pass reference and it denotes the type
{// T represents we want to achieve type safety(object is of type T)
 // T is of type integer
    T obj;

    public gen(T obj) {
        this.obj = obj;
    }

    // because of this<T> we are able to pass the type as integer or stringf
    void disp() {
        System.out.println("the type of data is " + obj.getClass().getName());// name of the object
    }

    public T getobj() {// here obj is of type T
        return obj;
    }

}

public class hGenerics {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        List<String> b = new ArrayList<String>();
        Collection<Integer> c = new ArrayList<Integer>();
        // List<Object> d= new Arraylist<String>();

        // we cannot make parent of a generic type
        /*
         * one side contains string and another side contain object
         * within the bracket<> we have to write the same thing as written on the other
         * side
         * if there is string on the lhs then there will be string on the rhs
         */

        // List<int> d= new Arraylist<int>();/*

        /*
         * here only the object type is alllowed
         * between the <>
         * if we use any kind of primitive data type like int float then it will give a
         * error
         * 
         */
        gen<Integer> g = new gen<Integer>(10);// the generic becomes o type integer
        ArrayList<gen> u = new ArrayList<gen>();
        g.disp();
        System.out.println(g.getobj());
        System.out.println("********************************************************");
        gen<String> g1 = new gen<String>("soch");// now the generic is becomming of type strig
        g1.disp();
        System.out.println(g1.getobj());

    }

}
