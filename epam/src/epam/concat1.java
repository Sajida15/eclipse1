package epam;
import java.util.*;
public class concat1 {

	public static void main(String[] args) {
		
		String s1,s2;
		Scanner sc= new Scanner(System.in);
		s1=sc.nextLine();
		s2=sc.nextLine();
		
		if(s1.charAt(s1.length()-1)==(s2.charAt(0))) {
	System.out.println(s1.concat(s2.substring(1)).toLowerCase());
		}
	else
		System.out.println(s1.concat(s2).toLowerCase());
		
		
	}

}
