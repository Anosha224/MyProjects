import java.util.Date;
import java.util.*;
public class ChaseUpTest
{
	public static void main(String[] args)
	{
        	Scanner scan=new Scanner(System.in);
		int id=0;

		Date date=new Date();
        	ChaseUp ch1=new ChaseUp("The New ChaseUp Parking Shoping centre","Karachi",03403215000,"chaseup@gmail.com",100,0,date);
        	ChaseUpFood f1=new ChaseUpFood();
        	ChaseUpCosmetics c1=new ChaseUpCosmetics();
        	ChaseUpReception r1= new ChaseUpReception();
		ChaseUpPayment p1= new ChaseUpPayment();
		ChaseUpcustomer csmr =new ChaseUpcustomer();
		ChaseUpVehicleType parkType = new ChaseUpVehicleType();
		ChaseUpVehicalCar vehicalCar = new ChaseUpVehicalCar();
		ChaseUpVehicalBike vehicalBike = new ChaseUpVehicalBike();		

	        ArrayList<ChaseUpVehicleType> vehical1 = new ArrayList<ChaseUpVehicleType>();
		ArrayList<ChaseUpReception> customerList = new ArrayList<ChaseUpReception>();
		ArrayList<ChaseUpVehicalBike> bikeList = new ArrayList<ChaseUpVehicalBike>();
		ArrayList<ChaseUpVehicalCar> carList = new ArrayList<ChaseUpVehicalCar>();


        	System.out.println("\n\n                    ====>      Wellcome to the New ChaseUp Parking Shoping centre      <====");

		System.out.println("\n\nEnter customer's name:");
		csmr.setName(scan.nextLine());

		System.out.println("Enter customer's address:");
		csmr.setAddress(scan.nextLine());

		System.out.println("Enter customer's emailaddress:");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
		csmr.setEmail(scan.nextLine());

		System.out.println("enter customer's cellNo:");
		csmr.setCellNo(scan.nextLong());


		System.out.println("\n\n             Hello "+csmr.getName());

		            	System.out.println("\n\nSelect the vehical Type: \n");

		            	System.out.println("1. Car.\n2. Bike.");
		            	int type = scan.nextInt();

				if(type!=1 && type!=2)
				{
					System.out.println("Please select the correct input.");
		            		System.out.println("\n\nSelect the vehical Type: \n");
		            		System.out.println("1. Car.\n2. Bike.");
		            		type = scan.nextInt();			
				}

            			switch (type)
            			{
                			case 1:
                    			{
		    				vehicalCar.setType("car");
                    				System.out.println("Enter the car plate number:");
                    				vehicalCar.setNoPlate(scan.next());
						vehicalCar.setBookigId(id+=1);
						ch1.vehicalIn();
        			            	customerList.add(r1);
					    	carList.add(vehicalCar);
						csmr.setCstmrCar(carList);
						System.out.println("\n"+csmr.car());
						System.out.println("\nPlease go to parking no "+vehicalCar.getBookigId());

        			            	break;
        			  	}
                			case 2:
                    			{
		    				vehicalBike.setType("bike");
                    				System.out.println("Enter the bike plate number:");
                    				vehicalBike.setNoPlate(scan.next());						                    	
		    				vehicalBike.setBookigId(id+=1);
						ch1.vehicalIn();
						customerList.add(r1);
		    				bikeList.add(vehicalBike);
						csmr.setCstmrBike(bikeList);

						System.out.println("\n"+csmr.bike());
						System.out.println("\nPlease go to parking no "+vehicalBike.getBookigId()+" for Shoping.");

                    				break;
                    			}
                			default:
                    			{
                    				System.out.println("Please enter the write input");
						System.exit(0);
                    			}
			
            			}

		System.out.println("\n\nSelect the area Type \n");

        	System.out.println("1. Food Area\n2. Cosmetics Area");
        	int area=scan.nextInt();

		if(area!=1 && area!=2)
		{
			System.out.println("Please select the correct input.");
			System.out.println("\n\nSelect the area Type \n");
	        	System.out.println("1. Food Area\n2. Cosmetics Area");
	        	area=scan.nextInt();
		}

	
        	if(area==1)
		{
			System.out.println("\n\n       ===>   Welcome to the Food Market   <===\n");

        		f1.order();
			f1.discount(f1.getTotalPrice());
 	
	
        		System.out.println("\nYour total bill of Food item is "+f1.getTotalPrice());
			System.out.println("\nOn the Food shoping of "+f1.getTotalPrice()+" you get the discount of "+f1.getDiscount());

			f1.setTotalPrice((f1.getTotalPrice()-f1.getDiscount()));
        		System.out.println("\nYour total bill after discount is "+f1.getTotalPrice());
	
			System.out.println("\n\ndo you want to go to cosmetic area.\nIf yes then press Y else N: ");
			String nextArea=scan.next();
	
			if(nextArea.equals("y") || nextArea.equals("Y"))
			{
				System.out.println("\n\n       ===>   Welcome to the Cosmetic Market   <===\n");
	
		        	c1.order();
	    			c1.discount(c1.getTotalPrice());

			        System.out.println("\nYour total bill of cosmetics item is "+c1.getTotalPrice());
			 	System.out.println("\nOn the cosmetics shoping of "+c1.getTotalPrice()+" you get the discount of "+c1.getDiscount());

				c1.setTotalPrice((c1.getTotalPrice()-c1.getDiscount()));
			        System.out.println("\nYour total bill of cosmetics item after discount is "+c1.getTotalPrice());
			}			
		}
		else if(area==2)
		{
			System.out.println("\n\n       ===>   Welcome to the Cosmetic Market   <===\n");

		        c1.order();
			c1.discount(c1.getTotalPrice());
	
		        System.out.println("\nYour total bill of Cosmetics item is "+c1.getTotalPrice());
 			System.out.println("\nOn the cosmetic shoping of "+c1.getTotalPrice()+" you get the discount of "+c1.getDiscount());

			c1.setTotalPrice((c1.getTotalPrice()-c1.getDiscount()));
 		        System.out.println("\nYour total bill after discount is "+c1.getTotalPrice());

			System.out.println("\n\ndo you want to go to Food area.\nIf yes then press Y else press N:	");
			String nextArea=scan.next();
	
			if(nextArea.equals("y") || nextArea.equals("Y"))
			{
				System.out.println("\n\n       ===>   Welcome to the Food Market    <===\n");

        			f1.order();
				f1.discount(f1.getTotalPrice());
 	
				System.out.println("\nYour total bill of Food item is "+f1.getTotalPrice());
				System.out.println("\nOn the Food shoping of "+f1.getTotalPrice()+" you get the discount of "+f1.getDiscount());

				f1.setTotalPrice((f1.getTotalPrice()-f1.getDiscount()));
			        System.out.println("\nYour total bill after discount is "+f1.getTotalPrice());
			}


		}
		else
		{
			System.out.println("Please enter the correct option");
			System.exit(0);
		}

		r1.setFinalBill((f1.getTotalPrice()+c1.getTotalPrice()));
		p1.setCash(r1.getFinalBill());
		

			System.out.println("\n\nyour final bill is "+r1.getFinalBill());
			p1.paymentOption();			

			System.out.println("\n\n	===>  Here is your recept.  <===");
			System.out.println(ch1.toString());						
			System.out.println(csmr.toString());
			System.out.println("Customer bill is "+r1.getFinalBill());
			r1.terms();

			System.out.println("\n\nPlease collect your bags from exit gate by showing this recipt.");


			System.out.println("\n\n                   ===>   Thanks for choosing ChaseUp Shoping centre   <===");

	}
}
