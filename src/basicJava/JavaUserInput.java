package basicJava;
import java.util.Scanner;

public class JavaUserInput {
	public static void main(String []args)
	{
	  Scanner new_obj=new Scanner(System.in);
	  System.out.print("Enter a name:");
	  String username=new_obj.nextLine();
	  System.out.print("Enter Age :");
	  int age=new_obj.nextInt();
	  System.out.print("Enter Weight :");
	  float weight=new_obj.nextFloat();
	  System.out.print("Enter a salary:");
	  double salary=new_obj.nextDouble();
	  System.out.print("Enter Marrital status(true/false) :");
	  Boolean status=new_obj.nextBoolean();
	  System.out.println("*********************");
	  System.out.println("Hello "+username+"!");
	  System.out.println("Your Age is: "+age);
	  System.out.println("Your Weight: "+weight);
	  System.out.println("Your salary: "+salary);
	  String married=status==true?"Married":"Single";
	  System.out.println("You are : "+married);
	  System.out.println("**********************");
	  
	  
	  new_obj.close();
	}

}
