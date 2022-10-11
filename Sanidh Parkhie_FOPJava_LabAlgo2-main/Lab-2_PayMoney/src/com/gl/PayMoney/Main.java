package com.gl.PayMoney;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Transactions transactions = new Transactions();
		Scanner sc = new Scanner(System.in);

		int sizeOfArray;
		System.out.println("enter the size of transaction array");
		sizeOfArray = sc.nextInt();

		System.out.println("enter the values of array");
		int[] array = new int[sizeOfArray];
		for (int i = 0; i < sizeOfArray; i++) {
			array[i] = sc.nextInt();
		}

		System.out.println("enter the total no of targets that needs to be achieved");
		int target = sc.nextInt();
		for (int i = 0; i < target; i++) {
			System.out.println("enter the value of target");
			int value = sc.nextInt();
			transactions.isTargetAchievable(value, array);
			sc.close();
		}
	}
}
