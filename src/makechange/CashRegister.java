package makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		double itemCost = 0;
		double moneyReceived = 0;
		double changeOwedAfterPurchase = 0;
		double customerAmountOwed = 0;
		double numberOfTwenties = 0;
		double numberOfTens = 0;
		double numberOfFives = 0;
		double numberOfOnes = 0;
		double numberOfQuarters = 1;
		double numberOfDimes = 1;
		double numberOfNickels = 1;
		double numberOfPennies = 1;
		
		System.out.println("What is the price of the item?");
		itemCost = kb.nextDouble();
		
		System.out.println("How much money has the customer given you?");
		moneyReceived = kb.nextDouble();
		
		changeOwedAfterPurchase = itemCost - moneyReceived;
		 
		if (itemCost == moneyReceived) {
			
			System.out.println("The customer provided the exact amount, no change needed!");
		}
			
		if(itemCost > moneyReceived) {
			customerAmountOwed = itemCost - moneyReceived;
			System.out.println("Error!");
			customerAmountOwed = 0;
			
		}
		
		if(moneyReceived > itemCost) {
			changeOwedAfterPurchase = moneyReceived - itemCost;
			System.out.println("The customer is owed $" + changeOwedAfterPurchase);
			numberOfTwenties = (int)changeOwedAfterPurchase / 20;
			System.out.println("The customer is owed " + (int)numberOfTwenties + " $20 dollar bill(s)");
			
	
			
		
		if(changeOwedAfterPurchase % 20 > 0) {
			changeOwedAfterPurchase = changeOwedAfterPurchase - (numberOfTwenties * 20);
			numberOfTens = (int)changeOwedAfterPurchase / 10;
			System.out.println("The customer is owed " + (int)numberOfTens + " $10 dollar bill(s)");
		}
			
			
		if(changeOwedAfterPurchase % 10 > 0) {
			changeOwedAfterPurchase = changeOwedAfterPurchase - (numberOfTens * 10);
			numberOfFives = (int)changeOwedAfterPurchase / 5;
			System.out.println("The customer is owed " + (int)numberOfFives + " $5 dollar bill(s)");
		}
		
		if(changeOwedAfterPurchase % 5 > 0) {
			changeOwedAfterPurchase = changeOwedAfterPurchase - (numberOfFives * 5);
			numberOfOnes = (int)changeOwedAfterPurchase / 1;
			System.out.println("The customer is owed " + (int)numberOfOnes + " $1 dollar bill(s)");
		}
		
		if(changeOwedAfterPurchase % 1 > 0) {
			changeOwedAfterPurchase = changeOwedAfterPurchase - (numberOfOnes * 1);
			changeOwedAfterPurchase += 0.005;
			changeOwedAfterPurchase = (int)(changeOwedAfterPurchase * 100);
			numberOfQuarters = changeOwedAfterPurchase / 25;
			
			System.out.println("The customer is owed " + (int)numberOfQuarters + " quarters");
		}
		if(changeOwedAfterPurchase % 25 > 0) {
			changeOwedAfterPurchase = changeOwedAfterPurchase - ((int)numberOfQuarters * 25);
			numberOfDimes = changeOwedAfterPurchase / 10;
			System.out.println("The customer is owed " + (int)numberOfDimes + " dimes");
		}
		
		if(changeOwedAfterPurchase % 10 > 0) {
			changeOwedAfterPurchase = changeOwedAfterPurchase - ((int)numberOfDimes * 10);
			numberOfNickels = changeOwedAfterPurchase / 5;
			System.out.println("The customer is owed " + (int)numberOfNickels + " nickels");
		}
		if(changeOwedAfterPurchase % 5 > 0) {
			changeOwedAfterPurchase = changeOwedAfterPurchase - ((int)numberOfNickels * 5);
			numberOfPennies = changeOwedAfterPurchase / 1;
			System.out.println("The customer is owed " + (int)numberOfPennies + " pennies");
		}
			
		}
	}
		
}
		
		
		
		
	
	


/*
 * User Story #1 The user is prompted asking for the price of the item..
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