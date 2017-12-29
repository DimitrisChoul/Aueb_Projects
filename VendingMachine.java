import acm.program.*;

public class VendingMachine extends Program {
	public void run () {
		double sum=0;
		println("Ticket price=" + PRICE);
		println("Please insert money");
		println("To exit press " + SENTINEL);
		while(true) {
			double x=readDouble("Give 10, 20, 50 cents or 1,2,5 euros: ");
		if (x==SENTINEL) {
			break;
		} else if (x!=0.1 && x!=0.2 && x!=0.5 && x!=1 && x!=2 && x!=5) {
			println("Wrong insert, please give money again.");
		} else {
			sum+=x;
		}
		}
		if (sum==PRICE) {
			println ("Here is your ticket.");
		}
		if (sum>PRICE || sum<PRICE) {
			int change;
			int int_price=(int)(PRICE*10); // conversion from double to int
			int int_sum=(int)(sum*10);		
			if (sum>PRICE) {
				println ("Here is your ticket.");
				change=int_sum-int_price;
			} else {
				println ("Not enough money to buy the ticket.");
				change=int_sum;
			}		
			int euros=change/10;
			int cents=change%10;
			int t;
			int i;
			t=euros/5;
			for (i=t;i>0;i--) {
					println("You have change: 5 euros.");
					euros-=5;
					
				}		
			t=euros/2;
			for (i=t;i>0;i--) {
					println("You have change: 2 euros.");
					euros-=2;
				}		
			t=euros/1;
			for (i=t;i>0;i--) {
					println("You have change: 1 euro.");
					euros-=1;
				}		
			t=cents/5;
			for (i=t;i>0;i--) {
					println("You have change: 50 cents.");
					cents-=5;
				}		
			t=cents/2;
			for (i=t;i>0;i--) {
					println("You have change: 20 cents.");
					cents-=2;
				}		
			t=cents/1;
			for (i=t;i>0;i--) {
				println("You have change: 10 cents.");
					cents-=1;
				}
		}
	}

	
	
	
	
private static final double PRICE=1.4;	
private static final int SENTINEL=0;





}