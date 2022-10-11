package com.gl.PayMoney;

public class Transactions {

	public void isTargetAchievable(int target, int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
			if (sum >= target) {
				System.out.println("Target achieved after " + (i + 1) + " transactions" + '\n');
				break;
			}
		}

		if (sum < target) {
			System.out.println("Given target is not achieved");
		}
	}

}
