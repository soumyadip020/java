
import java.util.*;
import java.util.Map.*;

class Student {
    private String name;
    private int age;
    private String city;

    public Student(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public String toString()// before writing the toString adress was returned
    // after overwriting tostring
    {
        return name + " " + age + " " + city;
    }
    /* everytime we call the object the two string method is called */
}

public class cHashMap {
    public static void main(String[] args) {

        Student st1 = new Student("Rohan", 18, "Bengaluru");
        Student st2 = new Student("Rohit", 19, "Delhi");
        Student st3 = new Student("Ramesh", 22, "Mysuru");

        Map map = new HashMap();
        map.put(1, st1);
        map.put(2, st2);// here it is adding the values as object
        map.put(3, st3);
        /*
         * if adress comes then tostrinngmethod is not overridden
         * if value comes then tostring method is overidden
         * 
         */
        System.out.println(map);
        // acessing both the key and value
        Set set = map.entrySet();
        Iterator itr = set.iterator();// iterator is actually a cursor
        // keyset gives the value of all the keys
        while (itr.hasNext()) {
            // System.out.println(itr.next());
            Map.Entry data = (Entry) itr.next();// storing the data just like a entry
            System.out.println(data.getKey() + " : " + data.getValue());

        }

    }

}
