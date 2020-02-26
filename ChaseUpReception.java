import java.util.*;
public class ChaseUpReception
{
	private int customerId;
	private double finalBill;

    	public ChaseUpReception(){}
    	public ChaseUpReception(int customerId,double finalBill)
	{
        	this.customerId=customerId;
		this.finalBill=finalBill;
	}

    	public int getCustomerId()
	{
        	return customerId;
    	}
    
	public void setCustomerId(int customerId)
	{
		this.customerId=customerId;
    	}

	public double getFinalBill()
	{
	        return finalBill;
    	}

	public void setFinalBill(double finalBill)
	{
	        this.finalBill=finalBill;
    	}

	public void terms()
	{
		System.out.println("\n\n   ==>  Terms and condition  <==" );
		System.out.println("\nNo exchange and No return.");
		System.out.println("Leave your counter before count your change");
		System.out.println("Operator: Chander Kumar.");
		System.out.println("\n\nSoftware developed by The Rocking Programmers.");
		System.out.println("ph:+923403215000");
		System.out.println("email: cqrajput@gmail.com");
	}
    

}
