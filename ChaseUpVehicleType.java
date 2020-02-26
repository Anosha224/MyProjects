import java.util.*;
public class ChaseUpVehicleType
{
    	private String noPlate;
    	private int bookigId;
	private ArrayList<ChaseUpReception> cstmr;

    	public ChaseUpVehicleType(){}
    	public ChaseUpVehicleType(String noPlate,int bookigId,ArrayList<ChaseUpReception> cstmr)
    	{
    	    	this.noPlate=noPlate;
    	    	this.bookigId=bookigId;
    	    	this.cstmr=cstmr;
    	}

 
    	public String getNoPlate()
    	{
    	    	return noPlate;
    	}

    	public void setNoPlate(String noPlate)
    	{
    	    	this.noPlate = noPlate;
    	}

    	public int getBookigId()
    	{
    	    	return bookigId;
    	}

    	public void setBookigId(int bookigId)
    	{
    	    	this.bookigId = bookigId;
    	}

	public ArrayList<ChaseUpReception> getCstmr()
	{
		return cstmr;
	}
	public void setCstmr(ArrayList<ChaseUpReception> cstmr)
	{
		this.cstmr=cstmr;
	}

    	public String toString()
    	{
    	    	return " plate number is "+noPlate+"\nCustomer Booking id is "+bookigId+"\nCustomer parking number is "+bookigId;
    	}

	
}
