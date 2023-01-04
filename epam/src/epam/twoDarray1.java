package epam;
import java.util.*;
public class twoDarray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
	
		int numbers[][]=new int [2][2];
		
		
		System.out.println("Ener the elements: ");
		for(int i=0;i<numbers.length;i++)
		{
			
			for(int j=0;j<numbers.length;j++)
		{
			 numbers[i][j]=sc.nextInt();
		}
		}
		
		
		
		for(int i=0;i<numbers.length;i++)
		{
			for(int j=0;j<numbers.length;j++) {
			System.out.print(+numbers[i][j]+" ");
		}
			System.out.println();
		
		}
		
		
		for(int i=numbers.length-1;i>=0;i--)
		{
			for(int j=numbers.length-1;j>=0;j--) {
			System.out.print(+numbers[i][j]+" ");
		}
			System.out.println();
		
		}

		
		
	}
}
		