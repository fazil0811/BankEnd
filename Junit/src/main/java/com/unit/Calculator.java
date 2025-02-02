package com.unit;

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public int sum() {
		return 8 - 3;
	}

	public void mul(int a, int b) {
		System.out.println(a * b);
	}

	public void div() {
		System.out.println(24.03 / 8.11);
	}

	public int findmax() {
		int[] a = { 43, 54, 23, 59, 34, 44 };
		int firstmax = 0;
		int secondmax = 0;
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] > firstmax) {
//				secondmax = firstmax;
//				firstmax = a[i];
//			}
//			if (a[i] > secondmax && a[i] != firstmax) {
//				secondmax = a[i];
//			}
//		}
//		return secondmax;

		for (Integer x : a) {
			if (x > firstmax) {
				secondmax = firstmax;
				firstmax = x;
			}
			if (x > secondmax && x != firstmax) {
				secondmax = x;
			}
		}
		return secondmax;
	}

}
