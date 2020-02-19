

import java.util.*;

public class Fcfs {
	public static void main(String[] args) {
		int n;
		int[] at = new int[10], bt = new int[10], ct = new int[10];

		System.out.print("enter The total number of Process\t");
		n = STDIN_SCANNER.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.print("enter arrival and burst time:\t");
			at[i] = STDIN_SCANNER.nextInt();
			bt[i] = STDIN_SCANNER.nextInt();
		}
		ct[0] = bt[0];
		for(int i = 1; i < n; i++) {
			ct[i] = ct[i - 1] + bt[i];
		}

		System.out.println("Process:AT:\tBT\tCT");
		for(int i = 0; i < n; i++) {
			System.out.println((i + 1) + "\t" + at[i] + "\t" + bt[i] + "\t" + ct[i]);
		}
	}

	public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}