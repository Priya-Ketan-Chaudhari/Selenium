package demo;

public class smallest_number
{

	public static void main(String[] args)
	{
		int []arr=new int[] {25,10,6,457};
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]< min)
				min =arr[i];
		}
		System.out.println("smallest no in array is = "+min);
	}

}
