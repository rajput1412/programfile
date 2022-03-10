package sebone2;
import java.util.*;
public class anagram {
	
	public static void main(String [] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your First String");
		String s1= sc.next();
		System.out.println("Enter Your Second String");
		String s2= sc.next();
		boolean flage=false;
		if(s1.length()==s2.length())
		{
			s1=s1.toLowerCase();
			s2=s2.toLowerCase();
			char []c=s1.toCharArray();
			char [] c1=s2.toCharArray();
			Arrays.sort(c);
			Arrays.sort(c1);
			if(Arrays.equals(c, c1)) 
			{
				flage=true;
				//System.out.println("Anagram");
			}
			
			
			
		}
		if(flage)
		{
			
			System.out.println("Anagram");
		}
		else
		{
			
			System.out.println("Not Anagram");
		}
	}

}
