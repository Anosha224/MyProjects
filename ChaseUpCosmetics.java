import java.util.*;
public class ChaseUpCosmetics extends ChaseUpArea
{

    	public ChaseUpCosmetics(){}
    	public ChaseUpCosmetics(double totalPrice,double discount)
	{
		super(totalPrice,discount);
    	}
 
    	public void order()
    	{
		Scanner scan= new Scanner(System.in);

        	System.out.println("\nHere is our list of Cosmetics items and prices :--\n");
	        System.out.println("0. Makeup  kit        -->             300.Rs\n1. Mascara  kit       -->             300.Rs\n2. Foundation  kit    -->             500.Rs\n3. Lip Gloss  kit     -->             250.Rs\n4. Eye Shadow  kit    -->             500.Rs\n5. Eye Liner  kit     -->             500.Rs\n6. Lip Balm           -->             499.Rs\n7. Shine Control      -->             1000.Rs\n8. Primer             -->             300.Rs\n9. Facewash           -->             499.Rs\n10. Hair Shiner       -->             900.Rs");

	        String[] itemType = new String[]{"Makeup kits","Mascara kits","Foundation kits", "Lip Gloss kits", "Eyeshadow kits" ,"Eyeliner kits","Lip Balm","Shine Control", "Primer","Facewash","Hair Shiner"};
	        int[] itemPrice = new int[]{300,300,500,250,500,500,499,1000,300,490,900};

	        System.out.println("\nHow many items do you want to buy.");
	        int itemNo= scan.nextInt();

		if(itemNo>0 && itemNo<=11)
		{
		        System.out.println("\nPlease select "+itemNo +" items from the list numbers that you want to buy");
		        int[] selectItem= new int[20];
			int[] quantity=new int[100];
			double price=0;

		        for(int i=0;i<itemNo;i++)
		        {
				System.out.println("\nEnter the item "+(i+1));
		        	selectItem [i]= scan.nextInt();

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
		        		selectItem [i]= scan.nextInt();

					System.out.println("\nEnter the quantity of "+itemType[selectItem [i]]);
					quantity[i]=scan.nextInt();
				
		            		setTotalPrice(getTotalPrice()+(itemPrice[selectItem [i]]*quantity[i]));
				}
			}
			System.out.println("\n\n");

        		for(int i=0;i<itemNo;i++)
        		{
				if(quantity[i]!=0)
        	    		System.out.println("You select "+quantity[i]+(" ")+itemType[selectItem [i]]+"      "+(itemPrice[selectItem [i]]*quantity[i])+"Rs.");
        		}
		}
		else
		{
			System.out.println("\n\nplease enter the number between 0 to 11\n\n");

		        System.out.println("\nHow many items do you want to buy.");
		        itemNo= scan.nextInt();

			System.out.println("Please select "+itemNo +" items from the list numbers that you want to buy");

		        int[] selectItem= new int[20];
			int[] quantity=new int[100];
			double price=0;

		        for(int i=0;i<itemNo;i++)
		        {
				System.out.println("\nEnter the item "+(i+1));
		        	selectItem [i]= scan.nextInt();

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
		        		selectItem [i]= scan.nextInt();

					System.out.println("\nEnter the quantity of "+itemType[selectItem [i]]);
					quantity[i]=scan.nextInt();
				
		            		setTotalPrice(getTotalPrice()+(itemPrice[selectItem [i]]*quantity[i]));				}
			}

			System.out.println("\n\n");

        		for(int i=0;i<itemNo;i++)
	        		{
					if(quantity[i]!=0)
	        	    		System.out.println("You select "+quantity[i]+(" ")+itemType[selectItem [i]]+"      "+(itemPrice[selectItem [i]]*quantity[i])+" Rs.");
	        		}			
		}    	
	}

	public void discount(double totalPrice)
	{
		if(totalPrice>=500 && totalPrice<=1500)
		{
			 setDiscount(totalPrice*3/100);
		}
		else if(totalPrice>1500 && totalPrice<=3000)
		{
			 setDiscount(totalPrice*6/100);
		}
		else if(totalPrice>3000 && totalPrice<=6000)
		{
			 setDiscount(totalPrice*9/100);
		}
		else if(totalPrice>6000)
		{
			 setDiscount(totalPrice*12/100);
		}
		else
		{ 
			 setDiscount(0);
		}
	}
}
