package demo;

public class palindrome1
{
	public static void palindrome(String s)
	{
		int i=0;
		int j=s.length()-1;
		//while(j<i)
		//{
		if(s.charAt(i)!=s.charAt(j))
		{
		System.out.println("Palindrome");
		}
		else
		{
		System.out.println("Not Palindrome");
		}
		
		i++;
		j--;
	    
	}
//	}
	


	public static void main(String[] args)
	{
		palindrome("1221");
	}

}
//https://www.mygreatlearning.com/blog/palindrome-in-java-2/

