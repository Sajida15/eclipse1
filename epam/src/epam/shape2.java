package epam;

public interface shape2 {
	
	 public void area(double d);
	
}
	 class circle1 implements shape2
	{

		@Override
		public void area(double d) {
			// TODO Auto-generated method stub
			System.out.println("Area of square"+(3.14*d*d));
			
		}
		 	
	 class square1 implements shape2
		{
			public void area(double d)
			{
				System.out.println("Area of square"+(d*d));
			}
		}
	}
	 
	 
		


