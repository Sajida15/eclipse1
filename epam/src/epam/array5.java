package epam;
import java.util.*;
public class array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		//System.out.println("Enter size ");
		//int size=sc.nextInt();
		int numbers[]=new int[2];
		System.out.println("Ener the elements: ");
		for(int i=0;i<numbers.length;i++)
		{
			numbers[i]=sc.nextInt();
		}
			int sum;
			sum=numbers[0]+numbers[1];
			System.out.println("Sum is "+sum);
			int average;
			average=sum/2;
			System.out.println( "avarage is "+average);
		
			
		
		
		
			
		
		

	}

}
