class student{
private int age;// here age is a instance variable means variable of the object
private String name;

public void setdata1(int age){
    this.age=age;// now in here the first age has become a instance variable
    // this is a keyword which refers  to the current object(object that is calling this method)
    // and makes the jvm  know
    //which is the  instance variable
    //when obj calls the  setdata1 (this) refers to the  obj object
    //when obj1 calls the setdata1 (this) refers to the obj1 object
}
public void setdata2(String name){
    this.name=name ;

}

public void  show(){
    System.out.println(name+" "+age);
}

}




public class shadowingSoluionFour {
    public static void main(String[] args) {
        student obj= new student();
        student obj1= new student();
        obj.setdata1(12);//we are passing  12 to the local variable
        obj.setdata2("soumya");
        obj.show();
        obj1.setdata1(23);
        obj1.setdata2("sujata");
        obj1.show();
    }
    
}
