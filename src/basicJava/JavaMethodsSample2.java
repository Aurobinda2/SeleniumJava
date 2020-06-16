package basicJava;

import java.util.Scanner;

public class JavaMethodsSample2 {
	//Sample2 class method(internal method)
	public String greetings(String name)
	{
		return "Hello" +name +"!";
	}
public static void main(String [] args)
{
	Scanner input=new Scanner(System.in);
	System.out.println("Enter your name gentleman!");
	String name=input.nextLine();
	JavaMethodsSample2 s2=new JavaMethodsSample2();
	JavaMethodsSample1 s1=new JavaMethodsSample1();
	String message=s2.greetings(name);
	System.out.println(message);
	int result=s1.add(10,20);
	System.out.println(result);
	input.close();
	
}

}
