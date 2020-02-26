import java.util.Date;
import java.util.*;
public class ChaseUp
{
	private String name;
    	private String address;
    	private long cellNo;
    	private String emailAddress;
    	private int noOfVehicalVacancy;
    	private int noOfVehicalLeftToPark;
	private Date date;


	public ChaseUp(){}
    
	public ChaseUp(String name, String address,long cellNo,String emailAddress,int noOfVehicalVacancy,int noOfVehicalLeftToPark,Date date)
	{
		this.name=name;
        	this.address=address;
        	this.cellNo=cellNo;
        	this.emailAddress=emailAddress;
		this.noOfVehicalVacancy=noOfVehicalVacancy;
		this.noOfVehicalLeftToPark=noOfVehicalLeftToPark;
		this.date=date;

    	}
   
	public String getName()
	{
        	return name;
    	}
    	
	public void setName()
	{
		Scanner scan=new Scanner(System.in);
		this.name=scan.nextLine();
	}

	public Date getDate()
	{
		return date;
	}
	public void setDate(Date date)
	{
		this.date=date;
	}

    	public String getAddress()
	{
        	return address;
    	}
    
	public void setAddress()
	{
		Scanner scan=new Scanner(System.in);
		this.address=scan.nextLine();
    	}

    	public long getCellNo()
	{
        	return cellNo;
    	}
    
	public void setCellNo()
	{
		Scanner scan=new Scanner(System.in);
		this.cellNo=scan.nextLong();
	}

    	public String getEmailAddress()
	{
        	return emailAddress;
    	}

	public void setEmailAddress()
	{
		Scanner scan=new Scanner(System.in);
		this.emailAddress=scan.nextLine();
    	}

    	public int getNoOfVehicalVacancy()
    	{
    	    	return noOfVehicalVacancy;
    	}
    	public void setNoOfVehicalVacancy(int noOfVehicalVacancy)
    	{
		this.noOfVehicalVacancy=noOfVehicalVacancy;
    	}

	public int getNoOfVehicalLeftToPark()
	{
		return noOfVehicalLeftToPark;
	}	
	public void setNoOfVehicalLeftToPark(int noOfVehicalLeftToPark)
	{
		this.noOfVehicalLeftToPark=noOfVehicalLeftToPark;	
	}
	
    	public void vehicalIn()
    	{
    	    	noOfVehicalVacancy-=1;
    	}
	
    	public void vehicalOut()
    	{
    	    	noOfVehicalVacancy+=1;
    	}


    	public String toString()
	{
        	return "\n"+name+"\nThe address is: "+address+"\nThe contact no: "+cellNo+"\nThe email address: "+emailAddress+"\nDate of purchase: "+date;
    	}

} 
