//shortcut for using getter and setter 
//rightclick 
//source action
//getters and setters



class student{
private int age;// here age is a instance variable means variable of the object
private String name;
//setdata 1 and set data 2 are not in structured  way we donot know what is it storing 
//so for our convinience we are  changing the name of the methods

public void setAge(int age){
    this.age=age;
 // the first word will be set the next word will be the variabe

}
public int getAge(){// get is fetching the value of age
    return age;

}
public void setName(String name){
    this.name=name ;

}
public String getName(){
    return name;

}



}


public class setters {
    public static void main(String[] args) {
        student obj= new student();
        student obj1= new student();
        obj.setAge(12);//we are passing  12 to the local variable
        obj.setName("soumya");
     
        obj1.setAge(23);
        obj1.setName("sujata");
        // obj1.show();
        //here the show method is only printing the value it is not fetching it
        //so to fetch the values we will be using get
int stud=obj.getAge();
System.out.println(stud);
    }
    
}
