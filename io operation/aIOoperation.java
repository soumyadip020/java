class student{
    private String name;
    private int age;
    private String city;
    public student(String name,int age,String city){
        this.name= name;
        this.age= age;
        this.city= city;
        
    }
    public  String  toString(){//by using the two string method we are making changes such that the 
        //objects that are being printed donot return hashcode 
        //or the  adress
        return "name"+name+"age"+age+"city"+city;
    }
}
public class aIOoperation{
    public static void main(String[] args) {
        student st= new student("virat",12,"dehli");
        System.out.println(st);
        student t= new student("sachin",23,"mumbai");
        System.out.println(t);
        /*here the actual dqta will ot be printed
         * but the  hash code or the adress of the object will be printed
         * so we have to overwrite tostring method
         */
    }
}