
public class main {
	public static void main(String[] args) {
		
		badminton yonex = new badminton(); //create first new object Badminton
		yonex.printBadmintonScanner();
		yonex.calcPriceScanner();
		yonex.printBuySet();
		yonex.printChooseGrip();
		
		System.out.println();
		
		badminton lining = new badminton(); //create second new object Badminton
		lining.printBadmintonScanner();
		lining.calcPriceScanner();
		lining.printBuySet();
		lining.printChooseGrip();

	}

}
