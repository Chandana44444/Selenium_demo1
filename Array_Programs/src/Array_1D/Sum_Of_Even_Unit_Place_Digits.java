package Array_1D;

public class Sum_Of_Even_Unit_Place_Digits 
{
	public static void main(String[] args)
	{
        int[] arr1={11,12,31,45,95};
		
		int even_Sum=0;
		int odd_Sum=0;
		int esum=0;
		int osum=0;
		
		for(int i=0;i<arr1.length;i++)
		{
			int rem=arr1[i]%10;
			if(rem%2==0)
			{
				even_Sum+=arr1[i];
				esum+=rem;
			}
			else
			{
				odd_Sum+=arr1[i];
				osum+=rem;
			}
		}
		
		System.out.println(even_Sum);//12
		System.out.println(odd_Sum);//11+31+45+95=182
		
		System.out.println();
		
		System.out.println(esum);//2
		System.out.println(osum);//12
		
		
	}

}
