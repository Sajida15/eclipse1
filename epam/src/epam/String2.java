package epam;

public class String2 {
	public static void main(String args[]) 
	{
		String s5= new String("CST").intern();
		String s1="CST";
		String s2="CST";
		String s3 =new String("CST").intern();
		String s4=new String("CST").intern();
		System.out.println(s1+" "+s2+" "+s3+" "+s4);
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println(s2.equals(s4));
		System.out.println(s1==s2);
		System.out.println(s3==s2);
		System.out.println(s4==s2);
		System.out.println(s5.toUpperCase());
		//s1.intern(); 
		//s2.intern();
		//s3.intern();
		//s4.intern();
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println(s2.equals(s4));
		
		System.out.println(s1.equals(s5));
		System.out.println(s1.equalsIgnoreCase(s5));
		System.out.println("length is "+s5.length());
		System.out.println("Charecter at index 2 is: " +s1.charAt(2));
		String name="GPREC";
		System.out.println("substring is "+name.substring(0,3));
		String Fname="Pinjari ";
		String lastName="Sajida";
		System.out.println(Fname.concat(lastName));
		StringBuffer sb=new StringBuffer("doraemon");
		System.out.println("reverse name is "+sb.reverse());
		StringBuffer sb1=new StringBuffer("madam");
		
		
		System.out.println("reverse name is "+sb.equals(sb1));
		
		
		
		
		
	}
	

}
