package basicJava;


interface bank{
	public void withDraw();
	public void Deposite();
	public void accidentalInsurance();
	
}

abstract public class SBIServiceProvider implements bank {
	
	// We can override an method from an interface with weaker access privileges; was public
	/*void withDraw()
	{
		
	}*/
	
	public void withDraw()
	{
		System.out.println("SBI with draw amount 5000/day");
	}
	
	public void Deposite()
	{
		System.out.println("SBI with deposite amount 5000/day");
	}
	

	//Interface contain three methods withDraw(),Deposite() and accidentalInsurance() .But service provider only
	//override one method that will create error so to avoid it 
	//Either we make this class as abstract or override Deposite and accidentalInsurance methods 
	
}
