package basicJava;
import java.util.Scanner;

public class JavaMethodsCoinProgram {
	
	public int calculateChange(int amount)
	{
		int[]  availableCoins={1,3,5};
		int r=amount;
		int numberOfCoins=0;
		for(int i=2;i>=0;i--)
		{
			
				if(r>=availableCoins[i]){
				numberOfCoins+=r/availableCoins[i];
	         	r=r%availableCoins[i];
				}
		
			if (r<=0){
				break;
			}
		}
		
		return numberOfCoins;
		
	}
public static void main(String [] args)
{
	JavaMethodsCoinProgram x=new JavaMethodsCoinProgram();
	System.out.println("Enter the INR coin you have(For which you need take chiller in exchange)");
	Scanner c=new Scanner(System.in);
	int inr=c.nextInt();
	int totalChiller=x.calculateChange(inr);
	System.out.println("Number of chillers: "+totalChiller);
}

}
