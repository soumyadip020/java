interface car{
    void drive();
}
// class waganor implements car{
//     public void drive(){
//         System.out.println("driving");
//     }
// }//here waganor is implentating the interface


public class fAnonymousinnerclass {
    public static void main(String[] args) {
         car obj = new car()
         {// no object of interference is made
            //anonymous class(can be used only once)
            public void drive(){
                System.out.println("driving");
            }
         };
        //  obj.drive()
    }
    
}
