public class stringbuffer {
    public static void main(String[] args) {
      StringBuffer sb=new  StringBuffer("virat");
        sb.append("kohli");//append = method of concatenation in stringbuilder
        System.out.println(sb); //here changes are possible because in the same object changes are made

        sb =new StringBuffer("sachin");//here error is comming because we aretrying to assign a new string to the str variable that is not possible if final keyword is used
       


    }
    
}
