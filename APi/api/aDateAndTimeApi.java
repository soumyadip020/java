/*date api is present inside  util package as well as inside sql package */
// import java.util.Date;

public class aDateAndTimeApi{
    public static void main(String[] args) {
        java.util.Date d= new  java.util.Date();// empty parameter  constructoris present
        System.out.println(d);
        // java.util.ArrayList a= new java.util.ArrayList<>();
       long time=d.getTime();
        java.sql.Date t= new java.sql.Date(time);//empt parameter constructir is  not  present
   System.out.println(t);
   //hence ther is a dependency  util package  object must be made first then the sql

   //from java 8  joda type date ad time api is used
   
    }
}