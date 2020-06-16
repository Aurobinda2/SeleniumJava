package basicJava;

public class JavaIfElse {
	 public static void main(String [] args )
	 {
		 int x=8;
		 if (x>7)
		 {
			 System.out.println(x+" is greater than 7");
		 }
		 int year=1969;
		 if (year%400==0 || year %4 ==0)
		 {
			 System.out.println(year+" is a leap year");
		 }else
		 {
			 System.out.println(year+" is not a leap year");
		 }
		 int a=33,b=6,c=1;
		 if (a>b)
		 {
			 if (a>c)
			 {
				 System.out.println(a+" is largest number");
				 
			 }else
			 {
				 System.out.println(c+" is largest number");
			 }
			 
				 
		 }
		 else
		 {
			 if (b>c)
			 {
				 System.out.println(b+" is largest number");
				 
			 }else
			 {
				 System.out.println(c+" is largest number");
			 }
			 
				 
		 }
		 String colour="Black";
		 if (colour=="Yellow")
		 {
			 System.out.println("Ohh! I got,Fruit on the plate is:Banana");
		 }
		 else if(colour=="Orange")
		 {
			 System.out.println("Ohh! I got,Fruit on the plate is:Orange"); 
		 }
		 else if(colour=="Red")
		 {
			 System.out.println("Ohh! I got,Fruit on the plate is:Strubery"); 
			 
		 }
		 else
		 {
			System.out.println("No Idea! May be some new fruits came to market!!") ;
		 }
	 }

	
}
