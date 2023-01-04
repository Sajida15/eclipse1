package epam;
import java.util.*;

public class watch {
	

	public static void main(String args[])
	
	{
		Scanner sc=new Scanner(System.in);
		
	long ss=sc.nextLong();
	long h=ss/3600%24;
	ss=ss%3600;
	long mm=ss/60;
	ss= ss%60;
	
	System.out.printf("%d:%0,2d:%0,2d ",h,mm,ss);
	}
}
	
	
		

	
	
	
	


