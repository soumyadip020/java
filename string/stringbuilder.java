public class stringbuilder {
    public static void main(String[] args) {
        //  StringBuilder sb=new StringBuilder();
        // System.out.println(sb.capacity());
        // sb.append("abcdefghijklmnop");
        // System.out.println(sb.capacity());
        // sb.append("s");
        // System.out.println(sb.capacity());//how many character you can add
        // System.out.println(sb.length());//how mancy character r present





// replacing an element of the string with another element

    //     StringBuffer sb2=new StringBuffer("Sachin");
    //     System.out.println(sb2);
    //     System.out.println(sb2.capacity());
    //     System.out.println(sb2.charAt(1));
    //    sb2.setCharAt(1,'A'); //SAachin or SAchin
    //    System.out.println(sb2);
    




    StringBuilder sb=new StringBuilder(150);// if we pass number at the time of object creation then it becomes its capacity
    System.out.println(sb.capacity());
    sb.append("java");
    System.out.println(sb);
    sb.trimToSize();//capacity ko kam karke jitne characters honge utne ki kardegi
    System.out.println(sb.capacity());

    // StringBuilder sb=new StringBuilder("pwjava");
    // System.out.println(sb);
    // System.out.println(sb.reverse());





}







    
}
