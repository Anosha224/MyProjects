import java.util.*;
public class FCFS
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many number of process do u want: ");
		int NoOfProcess = scan.nextInt();
		int pid[] = new int[NoOfProcess];   // process ids
		int ArrivalTime[] = new int[NoOfProcess];     // arrival times
		int BurstTime[] = new int[NoOfProcess];     // burst or execution times
		int CompleteAtPoint[] = new int[NoOfProcess];     // completion times
		int temp;
		
 
		for(int i = 0; i < NoOfProcess; i++)
		{
			System.out.println("enter process " + (i+1) + " arrival time: ");
			ArrivalTime[i] = scan.nextInt();
			System.out.println("enter process " + (i+1) + " brust time: ");
			BurstTime[i] = scan.nextInt();
			pid[i] = i+1;
		}
 
		//Arrival times
		for(int i = 0 ; i <NoOfProcess; i++)
		{
			for(int  j=0;  j < NoOfProcess-(i+1) ; j++)
			{
				if( ArrivalTime[j] > ArrivalTime[j+1] )
				{
					temp = ArrivalTime[j];
					ArrivalTime[j] = ArrivalTime[j+1];
					ArrivalTime[j+1] = temp;
					temp = BurstTime[j];
					BurstTime[j] = BurstTime[j+1];
					BurstTime[j+1] = temp;
					temp = pid[j];
					pid[j] = pid[j+1];
					pid[j+1] = temp;
				}
			}
		}
		
		//CompleteAtPoint
		for(int  i = 0 ; i < NoOfProcess; i++)
		{
			if( i == 0)
			{	
				CompleteAtPoint[i] = ArrivalTime[i] + BurstTime[i];
			}
			else
			{
				if( ArrivalTime[i] > CompleteAtPoint[i-1])
				{
					CompleteAtPoint[i] = ArrivalTime[i] + BurstTime[i];
				}
				else
					CompleteAtPoint[i] = CompleteAtPoint[i-1] + BurstTime[i];
			}
			        
		}
		
		System.out.println("\npid  Arrival/Starting  BurstTime  EndTime");
		for(int  i = 0 ; i< NoOfProcess;  i++)
		{
			System.out.println(pid[i] + "  \t " + ArrivalTime[i] + "\t\t" + BurstTime[i] + "\t\t" + CompleteAtPoint[i]) ;
		}
	
	
	
	}
}
