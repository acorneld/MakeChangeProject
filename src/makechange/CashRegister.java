package makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		double itemCost = 0;
		double moneyReceived = 0;
		double changeOwedAfterPurchase = 0;
		double customerAmountOwed = 0;
		System.out.println("What is the price of the item?");
		itemCost = kb.nextDouble();
		
		System.out.println("How much money has the customer given you?");
		moneyReceived = kb.nextDouble();
		
		changeOwedAfterPurchase = itemCost - moneyReceived;
		 
		if (itemCost == moneyReceived) {
			
			System.out.println("The customer provided the exact amount, no change needed!");
		}
			
		else if(itemCost > moneyReceived) {
			
			customerAmountOwed = itemCost - moneyReceived;
			System.out.println("The customer still owes " + customerAmountOwed);
			
			
			}
	
	
	}
	

}

/*
 * User Story #1 The user is prompted asking for the price of the item.
 * 
 * User Story #2 The user is then prompted asking how much money was tendered by
 * the customer.
 * 
 * User Story #3 Display an appropriate message if the customer provided too
 * little money or the exact amount.
 * 
 * User Story #4 If the amount tendered is more than the cost of the item,
 * display the number of bills and coins that should be given to the customer.
 */