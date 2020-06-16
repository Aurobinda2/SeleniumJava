package basicJava;

public class Java1dArray {
	public static void main(String [] args)
	{
		//int array
		int a[]=new int[3];
		a[0]=12;
		a[1]=13;
		a[2]=14;
		System.out.println("Element of Integer Array : ");
		for(int i:a)
		{
			System.out.println(i);
		}
		//Double array
				double b[]=new double[3];
				b[0]=1.2;
				b[1]=5.7;
				b[2]=9.7;
				System.out.println("Element of Double Array : ");
				for(int i=0;i<3;i++)
				{
					System.out.println(b[i]);
				}
		//Character array
				
				char c[]=new char[3];
				c[0]='A';
				c[1]='B';
				c[2]='C';
				System.out.println("Element of Character Array : ");
				for(int i=0;i<3;i++)
				{
					System.out.println(c[i]);
				}
       //String array
				
				String s[]=new String[3];
				s[0]="Aurobinda";
				s[1]="Braja";
				s[2]="Chuni";
				System.out.println("Element of String Array : ");
				for(int i=0;i<3;i++)
				{
					System.out.println(s[i]);
				}
      //Object array
				
				Object o[]=new Object[3];
				o[0]="Aurobinda";
				o[1]=1.34;
				o[2]=12;
				System.out.println("Element of Object Array : ");
				for(int i=0;i<3;i++)
				{
					System.out.println(o[i]);
				}
		
		
	}

}
