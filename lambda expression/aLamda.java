@FunctionalInterface
interface car{
    void drive(int avg,int ts);
}
// Lambda expression works for interface with only  one method

public class aLamda {
    public static void main(String[] args) {
    /*lamda  expression consists of three components
     * (parameter - list)->{body}
     * argument list :it can be empty or non empty
     * arrow token  links argument list and body  of expression
     * body: contains expressiona and statement of lambda expression
     * 
     * no parameter syntax ()->{
     * body  of no parameter lambda};
     * one parameter syntax
     * p1->{
     * body  of no parameter lambda
     * };
     * two parameter syntax
     * (p1,p2){
     * body of lambda};
     */
    // car obj=(avg,ts)->{
    //     System.out.println("driving");
    // };//for single method we can implement without  {} like that of if else
    car obj=(avg,ts)->System.out.println("driving"+avg+ts);
    obj.drive(16,140);
    
}
}
