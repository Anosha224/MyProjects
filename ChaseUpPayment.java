import java.util.*;
public class ChaseUpPayment
{
	private double cash;

	public ChaseUpPayment(){}
	public ChaseUpPayment(double cash)
	{
		this.cash=cash;
	}
	
	public double getCash()
	{
		return cash;
	}

	public void setCash(double cash)
	{
		this.cash=cash;
	}

	public void paymentOption()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("\nHow do you want to pay your bill");
		System.out.println("\nSelect from the options");
		System.out.println("1. Cash\n2. ATM Card");
		int pType=scan.nextInt();
		
		if(pType!=1 && pType!=2)
		{
			System.out.println("Please select the correct option.");
			System.out.println("\nSelect from the options");
			System.out.println("1. Cash\n2. ATM Card");
			pType=scan.nextInt();	
		}
		
		if(pType==1)
		{
			System.out.println("\nPlease give "+cash+" Rs to the Cash counter.");

			double payment=scan.nextDouble();

			if(payment>=cash)
			{
				payment=payment-cash;

				if(payment!=0)
				System.out.println("\nHere is your change "+payment);

				pChanges(payment);
				System.out.println("\nYour payment process is succesfully done.");
			} 
			else
			{
				System.out.println("\n\nYour cash is less than total bill.");
				System.out.println("Do you wants to continue your shoping or wants to cancel it");
				System.out.println("Press 1 for continue \nPress 2 for cancel");
				int want=scan.nextInt();

				if(want==1)
				{
					System.out.println("Please give "+(cash-payment)+" more cash to complete your orders");

					double mCash=scan.nextInt();
					if(mCash>=(cash-payment))
					{
						mCash=mCash-(cash-payment);

						if(mCash!=0)
						System.out.println("\nHere is your change "+mCash);

						pChanges(mCash);
						System.out.println("\nYour payment process is succesfully done.");
						System.out.println("\nYour shoping is succesfully done.");						
					}
					else
					{
						System.out.println("Your order is cancel.");
						System.exit(0);
					}
				}
				else
				{
					System.out.println("Your order is cancelled.");
					System.out.println("Thanks for choosing ChaseUp.");
					System.exit(0);
				}
			}	
		}
		else
		if(pType==2)
		{
			System.out.println("\nPlease give your ATM card");
			System.out.println("Enter ATM's Pin");

			int pin=scan.nextInt();

			System.out.println("\nEnter the price to withdraw the bill payment from the ATM\n");

			double atm=scan.nextDouble();

			if(atm>=cash)
			{
				System.out.println(atm+ " Rs is succesfully withdraw from your atm");
				atm=atm-cash;

				if(atm!=0)
				System.out.println("\nHere is your change "+atm);

				pChanges(atm);
				System.out.println("\nYour payment process is succesfully done.");
				System.out.println("\nYour shoping is succesfully done.");
			} 
			else
			{
				System.out.println("\n\nYour withdraw payment is less than total bill.");
				System.out.println("Do you wants to continue your shoping or wants to cancel it");
				System.out.println("Press 1 for continue \nPress 2 for cancel");

				int want=scan.nextInt();

				if(want==1)
				{
					System.out.println("Please give "+(cash-atm)+" more cash to complete your orders");

					double mCash=scan.nextInt();
					if(mCash>=(cash-atm))
					{
						mCash=mCash-(cash-atm);

						if(mCash!=0)
						System.out.println("\nHere is your change "+mCash);
						
						pChanges(mCash);
						System.out.println("\nYour payment process is succesfully done.");
						System.out.println("\nYour shoping is succesfully done.");						
					}
					else
					{
						System.out.println("Your order is cancel.");
						System.exit(0);
					}
				}
				else
				{
					System.out.println("Your order is cancelled.");
					System.out.println("Thanks for choosing ChaseUp.");
					System.exit(0);
				}
			}								
		}
		else
		{
			System.out.println("You select incorrect optiom.\nYour Order is cancelled.");
			System.exit(0);	
		}
	}

	public void pChanges(double payment)
	{
		int a=(int)payment/5000;
		int b=(int)payment%5000;
		int c=b/1000;
	    	b=b%1000;
		int d=b/500;
	    	b=b%500;
		int e=b/100;
	    	b=b%100;
		int f=b/50;
	    	b=b%50;
		int g=b/20;
	    	b=b%20;
		int h=b/10;
	    	b=b%10;
		int i=b/5;
		b=b%5;
		int l=b/2;
		b=b%2;
		int m=b/1;	

		if(a!=0)
		System.out.println("notes of 5000 = "+a);
		if(c!=0)
		System.out.println(" notes of 1000 = "+c);
		if(d!=0)
		System.out.println(" notes of 500 = "+d);
		if(e!=0)
		System.out.println(" notes of 100 = "+e);
		if(f!=0)
		System.out.println(" notes of 50 = "+f);
		if(g!=0)
		System.out.println(" notes of 20 = "+g);
		if(h!=0)
		System.out.println(" notes of 10 = "+h);
		if(i!=0)
		System.out.println(" coins of 5 = "+i);
		if(l!=0)
		System.out.println(" coins of 2 = "+l);
		if(m!=0)
		System.out.println(" coins of 1 = "+m);

	}
}
