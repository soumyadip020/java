class Calc{// here calc is a method just like main method
    public int  add(int n1 ,int n2){//it will accept 2 values
        int result = n1 + n2 ;
        return result;
    }
    public int  add(int n1 ,int n2,int n3){// it will accept 3 values
        int result = n1 + n2+n3 ;
        return result;
    }
}




public class demo {
    public static void main(String[] args) {
        Calc obj =new Calc();
        
       
        int result = obj.add(4,3);// only write the values  it will automatically give the variable:|| both method have the 
        //same name decision of which method will be called  is based on the   no of parameters passed
        System.out.println(result);
     int result1 =obj.add(2,4,6);//same for here only write the value
     System.out.println(result1);

    }
    
}
// method overloading:
//if we have two method of same name  then we can add or substract those 
//the only condition is that their parameters must have to be  different