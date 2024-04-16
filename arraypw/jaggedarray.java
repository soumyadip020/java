

public class jaggedarray {
    public static void main(String[] args) {
        //in 2d array all the rows are identical
        //say if we habe 3 rows and 2 cloumns
        //then in each row all  will have 2 columns
        // but  if we need that in first row 3 columns are 
        //required in second row   2 columns are required
        //then we have to use jagged array
        // no of rows are fixed no of columns are not fixed

    //  int num[][]={
    //      {3,2,5,6},
    //      {8,3},
    //      {8,7,5}
    //  };
    //manual declaration of array
    int num[][]=new int[2][];
    num[0]=new int[4];//we are telling manually that which row contains how many columns
    num[1]= new int[2];
    num[0][0]=1;
     for(int i=0;i<2;i++){//rows
        for(int j=0;j<num[i].length;j++){//num[i].length this finds  the  leength of row or no of columns in each row
        System.out.print(num[i][j]+" ");
        }
        System.out.println();
    }



    }
    
}
