package epam;

public class shape {
	void area(double r)
	{
		

	System.out.println("Area of circle"+3.14*r*r);
	}

	void area(int length,int breadth)
	{
		System.out.println("Area of rectangle"+(length*breadth));
	}
	void square(int side)
	{
		System.out.println("Area of square"+(side*side));
	}
	void area(double length,double height)
	{
		System.out.println("Area of triangle"+(0.5*length*height));
	}
	


}
