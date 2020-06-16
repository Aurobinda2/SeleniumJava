package basicJava;

public class JavaSwitchCase {  
public static void main(String[] args) {  
    //Declaring a variable for switch expression  
    int number=10;  
    //Switch expression  
    switch(number){  
    //Case statements  
    case 10: System.out.println("10");    
    case 20: System.out.println("20");    
    case 30: System.out.println("30");    
    //Default case statement  
    default:System.out.println("Not in 10, 20 or 30");  
    } 
   System.out.println("Out from switch statement");
}  
}  