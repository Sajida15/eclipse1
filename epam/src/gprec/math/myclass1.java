package gprec.math;

public class myclass1 {
	public int power(int a,int b)
	{
		int res=1;
		for(int i=1;i<=b;i++)
		
			res=res*b;
			return res;
		
		
	}
	public int reverse(int c)
	{
		int rev=0;
		while(c>0)
		{
			rev=rev*10+c%10;
			c=c/10;
		}
		return rev;
	}

}
