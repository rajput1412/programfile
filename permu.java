package sebone2;

public class permu {
	public  void perm(char[] input,int start,int end){
		if(start>=end)
			{System.out.println(input);
		return;
			}
		for(int i=start;i<end;i++) {
			
			swap(input,i,start);
			perm(input,start+1,end);
			swap(input,i,start);
		}
		
		
	}
	public void swap(char[] input,int i,int j) {
		
		char c=input[i];
		input[i]=input[j];
		input[j]=c;
	}
	public static void main(String [] args) {
		
		
		permu p=new permu();
		char [] a=new char[] {'a','b','c'};
	p.perm(a, 0, a.length);
				
	}

}
