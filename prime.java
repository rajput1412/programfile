package sebone2;
import java.util.*;

public class prime {
	public  static void main(String[] args) 
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int i,j;
		boolean flag;
		for(i=1;i<=n;i++) {
			flag=true;
			for(j=2;j<i/2;j++)
			{
				if(i%j==0)
				{
					
					flag=false;
					break;
				}
				
			}
			if(flag)
			{
				System.out.println(i);
			}
			
		}
		
		
	}

}
