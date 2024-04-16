import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        boolean flag= true;
 String c= new String("the quick brown fox jumps over a lazy dog");
 c=c.replace(" ","");

 char []w=c.toCharArray();
 
 int []t=new int[26];
 for(int i=0;i<w.length;i++){
    t[w[i]-65]++;
 }
 for(int j=0;j<t.length;j++){
    if(t[j]==0)
    System.out.println("true");
 }

    }
}
