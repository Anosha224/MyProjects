import java.util.*;
public class ChaseUpFood extends ChaseUpArea
{


    	public ChaseUpFood(){}
    	public ChaseUpFood(double totalPrice,double discount)
	{
    		super(totalPrice,discount);

    	}

    	public void order()
    	{
		Scanner scan= new Scanner(System.in);

	    	System.out.println("\nHere is our list of Food items and there prices :--\n");
		System.out.println("0. Milk                  1KG pack             -->             300.Rs\n1. Eggs                  1 dozen pack         -->             300.Rs\n2. Bread                 12 pieces pack       -->             300.Rs\n3. Apple                 1Kg pack             -->             250.Rs\n4. Fish                  1Kg pack             -->             500.Rs\n5. IceCream              1 liter pack         -->             500.Rs\n6. Cheese                500 Gram pack        -->             200.Rs\n7. Peenuts               1Kg pack             -->             1000.Rs\n8. DairyMilk Chocalate   90 gram pack         -->             300.Rs\n9. Oil Cane              15 liter Cane        -->             3000.Rs\n10. Cake                 2 pounds             -->             900.Rs");

		String[] itemType = new String[]{"Milk packs","Eggs packs","Bread packs", "Apple packs", "Fish packs" ,"IceCream packs","Cheese packs","Peenuts packs", "DairyMilk Chocalate packs","Oil cane packs","Cake packs"};
		int[] itemPrice = new int[]{300,300,300,250,500,500,200,1000,300,3000,900};

        	System.out.println("\nHow many items do you want to buy.");
        	int itemNo= scan.nextInt();

		if(itemNo>0 && itemNo<=11)
		{
	        	System.out.println("\nPlease select "+itemNo +" items from the list numbers that you want to buy.");
			int[] selectItem= new int[20];
			int[] quantity=new int[100];

	 	        for(int i=0;i<itemNo;i++)
	        	{
				System.out.println("\nEnter the item "+(i+1));
	            		selectItem[i]= scan.nextInt();

				if(selectItem[i]>=0 && selectItem[i]<=10)
				{
					System.out.println("\nEnter the quantity of "+itemType[selectItem [i]]);
					quantity[i]=scan.nextInt();
							
		            		setTotalPrice(getTotalPrice()+(itemPrice[selectItem [i]]*quantity[i]));
				}
				else
				{
					System.out.println("\nPlease enter the Item number between 0 to 10.\n");
					System.out.println("\nEnter the item "+(i+1));
		            		selectItem[i]= scan.nextInt();				

					System.out.println("\nEnter the quantity of "+itemType[selectItem [i]]);
					quantity[i]=scan.nextInt();
							
		            		setTotalPrice(getTotalPrice()+(itemPrice[selectItem [i]]*quantity[i]));
				}			
	        	}
	
	        	for(int i=0;i<itemNo;i++)
	        	{
				if(quantity[i]!=0)
	            		System.out.println("You select "+quantity[i]+(" ")+itemType[selectItem [i]]+"      "+(itemPrice[selectItem [i]]*quantity[i])+" Rs.");
	        	}
		}
		else
		{ 
			System.out.println("\n\nplease enter the number between 0 to 11\n\n");

        		System.out.println("\nHow many items do you want to buy.");
	        	itemNo= scan.nextInt();

	        	System.out.println("\nPlease select "+itemNo +" items from the list numbers that you want to buy.");
			int[] selectItem= new int[20];
			int[] quantity=new int[100];

	 	        for(int i=0;i<itemNo;i++)
	        	{
				System.out.println("\nEnter the item "+(i+1));
	            		selectItem[i]= scan.nextInt();

				if(selectItem[i]>=0 && selectItem[i]<=10)
				{
					System.out.println("\nEnter the quantity of "+itemType[selectItem [i]]);
					quantity[i]=scan.nextInt();
							
		            		setTotalPrice(getTotalPrice()+(itemPrice[selectItem [i]]*quantity[i]));
				}
				else
				{
					System.out.println("Please enter the Item number between 0 to 10.");
					System.out.println("\nEnter the item "+(i+1));
		            		selectItem[i]= scan.nextInt();				

					System.out.println("\nEnter the quantity of "+itemType[selectItem [i]]);
					quantity[i]=scan.nextInt();
							
		            		setTotalPrice(getTotalPrice()+(itemPrice[selectItem [i]]*quantity[i]));
				}			
	        	}
	
	        	for(int i=0;i<itemNo;i++)
	        	{
				if(quantity[i]!=0)
	            		System.out.println("You select "+quantity[i]+(" ")+itemType[selectItem [i]]+"      "+(itemPrice[selectItem [i]]*quantity[i])+"Rs.");
	        	}

		}
    	}

	public void discount(double totalPrice)
	{
		if(totalPrice>=700 && totalPrice<=1500)
		{
			 setDiscount(totalPrice*3/100);
		}
		else if(totalPrice>1500 && totalPrice<=3000)
		{
			 setDiscount(totalPrice*6/100);
		}
		else if(totalPrice>3000 && totalPrice<=5000)
		{
			 setDiscount(totalPrice*9/100);
		}
		else if(totalPrice>5000)
		{
			 setDiscount(totalPrice*12/100);
		}
		else
		{ 
			 setDiscount(0);
		}
	}
}
