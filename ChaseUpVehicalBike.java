import java.util.*;
public class ChaseUpVehicalBike extends ChaseUpVehicleType
{
	private String type;

    	public ChaseUpVehicalBike(){}
    	public ChaseUpVehicalBike(String noPlate, int bookigId,ArrayList<ChaseUpReception> cstmr,String type)
    	{
    	    	super(noPlate, bookigId, cstmr);
		this.type=type;
    	}

   	public String getType()
    	{
    	    	return type;
    	}

    	public void setType(String type)
    	{
    	    	this.type = type;
    	}

	
    	public String toString() 
	{
    	    	return "Customer vehical type is "+type+"\n"+type+""+super.toString();
    	}

}			
