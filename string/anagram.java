import java.util.Arrays;

public class anagram 
{
    public static void main(String[] args) 
    {
        String str1="School Master";
        String str2="The Classroom ";
        // String str1="keep";
        // String str2="peek";

        str1=str1.replace(" ", "");
        str2=str2.replace(" ", "");

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        char []ar1=str1.toCharArray();
        char []ar2=str2.toCharArray();

        Arrays.sort(ar1);// alphabets are put according to their  asci value

        Arrays.sort(ar2);//elements are put according to their ascii value

        if(Arrays.equals(ar1, ar2))
        {
            System.out.println("It's an Anagram");
        }
        else 
        {
            System.out.println("Its not an Anagram");
        }
    }
    
}