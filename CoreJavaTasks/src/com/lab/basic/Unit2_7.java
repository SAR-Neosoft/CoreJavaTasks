package com.lab.basic;

public class Unit2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[] { 64, 4, 1, 7, 10 };
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println();

		System.out.println("array after sorting: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}