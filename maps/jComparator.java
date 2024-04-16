import java.util.*;
class student{
   int marks;
        int age;
        String name;
        public student(int marks,int age,String name){
            this.marks= marks;
            this.age=age;
            this.name= name;
            
        }
        public int getMarks() {
            return marks;
        }
        public int getAge() {
            return age;
        }
        public String getName() {
            return name;
        }
        public String toString(){
            return " "+marks+"-"+age+"-"+name;
        }

}
class alpha implements Comparator<student>//inside comparatoe there is only one abstract method 
//hence it is called functional interface
{
    public int compare(student a ,student b){
        if(a.age>b.age){
            return 1;
        }
        else {
            return -1;
        }
    }
}
public class jComparator {
    public static void main(String[] args) {
      student s= new student(4,15,"rohan");
      student t= new student(12,45,"soch");
      student u= new student(14,90,"satya");

    //     List<Integer> list= new  ArrayList();
    //   list.add(4);
    //   list.add(2);
    //     list.add(6);
    //     list.add(5);
    List<student> list= new  ArrayList<student>();
      list.add(s);
      list.add(t);
        list.add(u);
        //here we have to define  we have to sort based on what  basis 

alpha a = new alpha();
Collections.sort(list,a);//kiski basis pe sort karna hai
System.out.println(list);
    }
    
}
