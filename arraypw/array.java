public class array {
    public static void main(String[] args) {
        // int num[]={5,4,3,2,1};
        // int a=8;
        // System.out.println(num);// the value which gets printed is not the adress of num
        

//if we dont have the value  which should be stored in arrray the we have to use new keyword as the data is stored inside heap
int nums []= new int[4];
nums[0] =5;
nums [1]=2;
nums [2]=3;
nums [3]=4;

System.out.println(nums[3]);



    }
    
}
