package epam;

public class jaggedarray {
	public static void main(String args[])
	{
		int array[][]=new int[3][];
		array[0]=new int[] {1,2,3};
		array[1]=new int[] {1,2,3,4,5};
		for(int i=0;i<array[i].length;i++)
			for(int j=0;j<array[i].length;j++)
		{
			System.out.println(+array[i][j] +" ");
		}
		System.out.println();
	}

}
