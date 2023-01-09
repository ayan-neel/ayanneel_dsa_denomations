package com.gl.dsa;

import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		int size;
		int amount;
		int []currencyDenominations;
		System.out.println("Enter size of currency denomations");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		currencyDenominations = new int[size];
		System.out.println("Enter the currency denominations value:  ");
		for(int i=0;i<size;i++)
		{
			currencyDenominations[i]=sc.nextInt();
		}
		System.out.println("Enter the amount you want to pay: ");
		amount = sc.nextInt();
		DenominationCalc dc = new DenominationCalc(currencyDenominations,amount);
		dc.denomination();

	}

}
