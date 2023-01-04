package epam;

public class shape1 {
	 void area()
	 {
		 System.out.println("Area of rectangle and square");
	 }
public class rectangle extends shape1
{
	void area(int l,int b)
	{
		System.out.println("Area of rectangle"+(l*b));
	}
}
public class square extends shape1
{
	void area(double s)
	{
		System.out.println("Area of square"+(s*s));
	}
}
}
	 


