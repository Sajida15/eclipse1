package epam;

import java.util.Scanner;
public class exception1 {
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int result;
	try
	{
		result=a/b;
	}
	catch(ArithmeticException e1)
	{
		System.out.println("Exception caught"+e1);
	}
	
	catch(Exception e2)
	{
		System.out.println("there are exceptions"+e2);
	}
	finally
	{
		System.out.println("exception caught");
	}
	
}
}
