package pack2;
import pack1.sameclass;
public class subclass extends sameclass
{
	subclass()
	{
		sameclass ob=new sameclass();
		//System.out.println("default is " +d );
		//System.out.println("private  is " +p );
		System.out.println("protected is " +prot );
		System.out.println("public is " +pub );
	}


}
