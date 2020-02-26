import java.*;
public abstract class ChaseUpArea
{

	private double totalPrice;
	private double discount;

	public ChaseUpArea(){}
	public ChaseUpArea(double totalPrice,double discount)
	{
		this.totalPrice=totalPrice;
		this.discount=discount;
	}

	public double getTotalPrice()
	{
    		return totalPrice;
    	}

	public void setTotalPrice(double totalPrice)
	{
        	this.totalPrice=totalPrice;
    	}

	public double getDiscount()
	{
    		return discount;
    	}

	public void setDiscount(double discount)
	{
		this.discount=discount;
	}

	public abstract void order();
	public abstract void discount(double totalPrice);

}
