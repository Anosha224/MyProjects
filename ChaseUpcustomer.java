import java.util.*;
public class ChaseUpcustomer
{
    	private String name;
    	private String address;
    	private long cellNo;
    	private String email;
	private ArrayList<ChaseUpVehicalCar> cstmrCar;
	private ArrayList<ChaseUpVehicalBike> cstmrBike;

	
    	public ChaseUpcustomer(){}
    	public ChaseUpcustomer(String name,String address,long cellNo,String email,ArrayList<ChaseUpVehicalCar> cstmrCar,ArrayList<ChaseUpVehicalBike> cstmrBike)
    	{	
    	    	this.name = name;
    	    	this.address=address;
    	    	this.cellNo=cellNo;
    	    	this.email=email;
		this.cstmrCar=cstmrCar;
		this.cstmrBike=cstmrBike;
    	}
	
    	public String getName()
    	{
    	    	return name;
    	}
	
    	public void setName(String name)
    	{
    	    	this.name = name;
    	}

    	public long getCellNo()
    	{
    	    	return cellNo;
    	}
	
    	public void setCellNo(long cellNo)
    	{
    	    	this.cellNo = cellNo;
    	}
	
    	public String getAddress()
    	{
    	    	return address;
    	}
	
    	public void setAddress(String address)
    	{
    	    	this.address = address;
    	}
	
    	public String getEmail()
    	{
    	    	return email;
    	}

    	public void setEmail(String email)
    	{
    	    	this.email = email;
    	}

	public ArrayList<ChaseUpVehicalCar> getCstmrCar()
	{
		return cstmrCar;
	}
	public void setCstmrCar(ArrayList<ChaseUpVehicalCar> cstmrCar)
	{
		this.cstmrCar=cstmrCar;
	}

	public ArrayList<ChaseUpVehicalBike> getCstmrBike()
	{
		return cstmrBike;
	}
	public void setCstmrBike(ArrayList<ChaseUpVehicalBike> cstmrBike)
	{
		this.cstmrBike=cstmrBike;
	}

    	public String car()
    	{
    	    	return "Customer Name is "+name+"\nCustomer address is "+address+"\nCustomer cell number is "+cellNo+"\nCustomer email is "+email+"\n"+cstmrCar;
    	}

    	public String bike()
    	{
    	    	return "Customer Name is "+name+"\nCustomer address is "+address+"\nCustomer cell number is "+cellNo+"\nCustomer email is "+email+"\n"+cstmrBike;
    	}

	
    	public String toString()
	{
    		return "\n\nCustomer name is "+name+"\nCustomer cell no is "+cellNo+"\nCustomer address is "+address+"\nCustomer email address is "+email;
    	}


	
}
