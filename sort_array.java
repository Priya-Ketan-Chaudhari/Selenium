package demo;

import java.util.Arrays;

public class sort_array
{

	public static void main(String[] args)
	{
		{   
			//defining an array of integer type   
			int [] arr = new int [] {90, 23, 5, 109, 12, 22, 67, 34};

			for (int i = 0; i < arr.length; i++)   
			{  
				for (int j = i + 1; j < arr.length; j++)   
				{  
					int temp = 0;  
					if (arr[i] > arr[j])   //use less than for descending
					{  
						temp = arr[i];  
						arr[i] = arr[j];  
						arr[j] = temp; 
					}
				 }
				System.out.println(arr[i]);
			}
		}
	}
}
	
/* OR
 Arrays.sort(arr)
 for(i<arr.lenght; i>=0;i++)
 {
 System.out.println(arr[i]);
 }
 
 */





















