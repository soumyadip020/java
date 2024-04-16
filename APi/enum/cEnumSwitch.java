enum result{
    pass,fail,nr;
}
public class cEnumSwitch {
    public static void main(String[] args) {
        result t= result.pass;
        switch(t){
            case pass:System.out.println("passed");
            break;
            case fail:System.out.println("failed");
            break;
            case nr:System.out.println("no result ");
            break;
        }
    }
    
}
