import java.util.Scanner;
public class badminton {
	Scanner s = new Scanner(System.in);

	void printBadmintonScanner() {
		
		System.out.println("Enter Brand, Colour, Price, Weight : ");
		String b = s.nextLine();
		String c =s.nextLine();
		int p = s.nextInt();
		String w = s.next();
		
		System.out.println("Brand : " + b);
		System.out.println("Colour : " + c);
		System.out.println("Price : " + "RM" + p );
		System.out.println("Weight : " + w + "gm");
	}
	
	void calcPriceScanner(){
		
		System.out.println("Enter Price and Quantity: ");
		int p = s.nextInt(); 
		int q = s.nextInt();
		
		int T = p*q;
		System.out.println("Total Price = RM" + T);
	}
	
	void printBuySet() {
		System.out.println("Do you want buy a set [racket/shuttle/bag] ?");
		System.out.println("You just only add RM50 [1:accept | 2:reject]");
		System.out.println();
		
		int ans = s.nextInt();
		
		switch (ans) {
		case 1:
			System.out.println("You have Accepted the Offer !!");
		case 2:
			System.out.println("You have Rejected the Offer");
		}
		
	}
	
	void printChooseGrip() {
System.out.println("Choose the grip you want to use :\n 1.Rubber Grip \n 2.Towel Grip \n 3.Over Grip");
		
		int grip = s.nextInt();
		
		switch (grip) {
		
		case 1:
			System.out.println("You are using 'Rubber Grip'");
			System.out.println("Rubber badminton grips are great if:");
			System.out.println("   1. You don’t have sweaty palms ");
			System.out.println("   2. You don’t want your grip to smell ");
			System.out.println("   3. You like squishy things ");
			break;
		case 2: 
			System.out.println("You are using 'Towel Grip'");
			System.out.println("Towel badminton grips are great if:");
			System.out.println("   1. You like furry stuff ");
			System.out.println("   2. You have a leaking palm ");
			break;
		case 3: 
			System.out.println("You are using 'Over Grip'");
			System.out.println("Over badminton grips are great if:");
			System.out.println("   1. You are great at tying grips yourself ");
			System.out.println("   2. You like a customizable option. ");
			break;
			
	}//end switch
		
	}
	
}
