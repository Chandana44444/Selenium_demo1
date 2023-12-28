package Array_1D;

public class Sum_Of_Even_No 
{
	public static void main(String[] args)
	{
		int[] arr1={1,2,3,4,5};
		
		int even_Sum=0;
		int odd_Sum=0;
		
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]%2==0)
			{
				even_Sum+=arr1[i];
			}
			else
				odd_Sum+=arr1[i];
		}
		
		System.out.println(even_Sum);//2+4=6
		System.out.println(odd_Sum);//1+3+5=9
		
		
	}

}
