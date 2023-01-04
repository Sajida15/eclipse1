package epam;

import java.util.Arrays;
import java.util.Scanner;

public class Array52 {

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
			 Arrays.sort(numbers);
			for(int i=0;i<numbers.length;i++)
			{
				System.out.println(+numbers[i]);
			}
				int maximum=numbers[numbers.length-1];
				int minimum=numbers[0];
				System.out.println("maximum number is"+maximum);
				System.out.println("Minimum number is"+minimum);
				
			

	}

}
