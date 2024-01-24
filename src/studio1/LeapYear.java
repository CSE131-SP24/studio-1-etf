package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter value 1 here:");
		int x = in.nextInt();
		
		boolean name = ((x%4) == 0) && ((x%100) != 0) && (x != 400);
				
		System.out.println(x + " is a leap year: " + name);
}
}
