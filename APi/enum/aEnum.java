/*when we have set of constants that we donot want to change then we go with the 
 * concept of enum
 * 
 * enum is  used behind the scene in  annonation
 */
enum week{
    mon,tue,wed,thu,fri,sat,sun;//upper case lower case not mandatory
}
public  class aEnum{
    enum result{
        pass,fail,nr;
    }
    public static void main(String[] args) {
        //we cannot make a object of  enum
        week w=week.mon;
    System.out.println(w);

    result r= result.pass;
    System.out.println(r);
    //indx
    int index=week.mon.ordinal();
System.out.println(index);
week []wr=week.values();
for(week i:wr){
    System.out.println(i+" :"+i.ordinal());
}
    }
}