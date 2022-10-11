package com.gl.lab2.traveller;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Denominations denominations = new Denominations();
		Scanner sc = new Scanner(System.in);
		
		int noOfDenominations;
		System.out.println("enter the size of curreny denominations");
		noOfDenominations = sc.nextInt();
		
		System.out.println("enter the currency denominations value");
		int[] array = new int[noOfDenominations];
		for (int i = 0; i < noOfDenominations; i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.println("enter the amount you want to pay");
		int amount = sc.nextInt();
		denominations.bubbleSort(array);
		denominations.noOfNotes(array, amount);
		sc.close();
	}

}
