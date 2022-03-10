package hello;
import java.util.*;
public class palindrome {
	
	
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c,r=0;
		c=n;
		while(n!=0)
		{
			
			r=r*10+n%10;
			n=n/10;
			
			
		}
		if(r==c)
		{
			System.out.println("No is Palindrome");
		}
		else
		{
			
			System.out.println("No is not Palindrome");
		}
		
	}

}
