package demo;

import java.util.Scanner;

public class vowels
{

	public static void main(String[] args)
	{
		String s1;
		int vowel =0, consonent=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string here:");
		s1=sc.nextLine();
		
		s1=s1.toLowerCase();     // or use toUppearCase()
		
		for(int i=0; i<s1.length(); i++)
		{
			if(s1.charAt(i)=='a'|| s1.charAt(i)=='e'||  s1.charAt(i)=='i'|| s1.charAt(i)=='o'||  s1.charAt(i)=='u' ) //use caps vowels
			{
				vowel++;
			}
			else
			{
				if(s1.charAt(i)!=' ')
				{
			      consonent++;
			    }
			}
		}
		
		System.out.println("Total no of vowels are = "+vowel);
		System.out.println("Total no of consonent are = "+consonent);
	}

}
