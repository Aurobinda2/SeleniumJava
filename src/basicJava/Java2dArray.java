package basicJava;

public class Java2dArray {
	public static void main(String [] args )
	{
		
	
	int a[][]=new int[3][3];
	
	a[0][0]=12;
	a[0][1]=13;
	a[0][2]=14;
	
	a[1][0]=15;
	a[1][1]=16;
	a[1][2]=17;
	
	a[2][0]=18;
	a[2][1]=19;
	a[2][2]=20;
	
	System.out.println("Element of matrix a :");
	for (int i =0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			System.out.print(a[i][j]);
			System.out.print(" ");
			
		}
		System.out.println(" ");
	}
	
	
	
	}

}
