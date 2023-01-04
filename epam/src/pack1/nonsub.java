package pack1;

public class nonsub {

	nonsub()
	{
		sameclass ob=new sameclass();
		System.out.println("default is " +ob.d );
		//System.out.println("private  is " +ob.p );
		System.out.println("protected is " +ob.prot );
		System.out.println("public is " +ob.pub );
	}
}
