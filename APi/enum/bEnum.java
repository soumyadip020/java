enum result{
    pass,fail,nr;//number of constants in enum = no of times the constructor will be called 
    //behind the scene a  result class is created wihich extends to the inner class of lang package
    //public static final result pass= new result();
    // public static final result fail= new result();
    // public static final result nr= new result();//constructor is called  
    int marks;
    result(){
        System.out.println("constructor in enum");
    }
    void setmarks(int marks){
        this.marks= marks;
    }
    int getmarks(){
        return marks;
    }
}
public class bEnum {
    public static void main(String[] args) {
        result.pass.setmarks(60);
        int m=result.pass.getmarks();
    System.out.println(m);
    int n=result.fail.getmarks();

    System.out.println(n);//since we are not  setting the value hence we will get the default  value
    
    }
    
}
