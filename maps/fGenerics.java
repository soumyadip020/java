
//generics was introduced in java  from java 5
import java.util.*;

public class fGenerics {
    public static void main(String[] args) {
        String ar[] = new String[10];
        /*
         * string promotes type safety means it ensures whether
         * we are ensuring which tupe of data to be stored from the very begining and
         * then
         * we cannot change the data type
         * 
         */
        ar[0] = "hyder";
        ar[1] = "pw";
        // ar[2]=18;
        String name10 = ar[0];
        String name20 = ar[1];

        // ArrayList al= new ArrayList();
        /* type safety achieved using geneics */
        ArrayList<String> al = new ArrayList<String>();
        al.add("soumyadip");
        al.add("pw");
        // al.add(12);//error is comming because of generics
        // here typr safety is not preserved
        String n1 = (String) al.get(0);// here we are downcasting
        System.out.println(n1);
        // or typecasting
        /*
         * we will get the strings as objects
         * so we are downcasting that objects to string
         */

        // String n2=(String)al.get(1);
        // String n3=(String)al.get(2);
        /*
         * because of generics we donot have to downcast as only String type of data
         * is present there
         */

        /* at runtime it is giving a error */
        /*
         * to solve this problem we will use
         * generics
         * where we define which type of data will be stored in the collection
         */
        String name1 = al.get(0);
        String name2 = al.get(1);

        /*
         * geerics is used to ensure only one type of data is stored inside
         * the arraylist
         */

    }
}
