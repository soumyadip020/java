public class arrayconstruction {
    public static void main(String[] args) {
        // int num[][]= new int [3][2];
        // num[0][0]=5;
        // num[0][1]=3;
        // num[1][1]=3;
        int num[][] ={
                   {5,2},
                   {3,8},
                   {9,7}
 



        };
        
        for(int i=0;i<=2;i++){//rows
            for(int j=0;j<=1;j++){//columns
            System.out.print(num[i][j]);
            }
            System.out.println();
        }

    }
    
}
