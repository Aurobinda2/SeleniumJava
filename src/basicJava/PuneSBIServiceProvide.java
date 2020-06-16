package basicJava;

public class PuneSBIServiceProvide extends SBIServiceProvider {
	
	public void accidentalInsurance()
	{
		System.out.println("Pune SBI branch provide an accidental insurance of 10000000");
	}
	
	public static void main(String [] args )
	{
       PuneSBIServiceProvide p1=new PuneSBIServiceProvide();
       p1.withDraw();
       p1.Deposite();
       p1.accidentalInsurance();
		
	}

}
