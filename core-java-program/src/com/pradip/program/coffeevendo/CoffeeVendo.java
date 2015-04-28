package com.pradip.program.coffeevendo;

import java.util.Scanner;

/**
 * @author Pradip
 *
 */
public class CoffeeVendo {

	public static void main(String[] args) {
		double money = 0.0;
		money = acceptMoney();
		if (isMoneyEnough(money)) {
			dispenceCoffee();
		} else {
			notifyMessage("Money is not enough");
		}
		if(money>10)
		{
			System.out.println("your change is :"+issueChange(money)+"Rs");
		}
	}

	public static double acceptMoney() {
		double payAmount = 0.0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Money:");
		payAmount = input.nextDouble();
		input.close();
		return payAmount;
	}

	public static boolean isMoneyEnough(Double myMoney) {
		if (myMoney >= 10) // coffee price is 10
			return true;
		else
			return false;
	}

	public static void dispenceCoffee() {
		System.out.println("Coffee is served");
	}

	public static void notifyMessage(String message) {
		System.out.println(message);
	}
	
	public static double issueChange(Double money) {
		Double change=0.0;
		change=money-10;
		return change;
	}


}
