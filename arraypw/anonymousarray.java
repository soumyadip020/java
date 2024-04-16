class Calc
{
 	public int add(int nums[])
	{
		int result=0;
		for(int n:nums)
		{
			result=result+n;
		}
		return result;
	}
}
//array without name is called anonymous arrray
public class anonymousarray{
	public static void main(String[] args){

	Calc obj= new Calc();
	int result=obj.add(new int[]{5,2,3,7,8,2});// in this line we are only passing values so we are writing it in this form
	//by normal method int[][]  it would not occur 
	//obj.add  represents object reference
	System.out.println(result);
	}
}