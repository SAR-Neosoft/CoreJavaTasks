package com.lab.basic;

public class Unit2_3 {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 5, 6 };
		System.out.println("length" + arr.length);

//		int[] array1=new int[5];
//		a[0]=10;//initialization  
//		a[1]=20;  
//		a[2]=70;  
//		a[3]=40;  
//		a[4]=50;
		System.out.println("===============2D array===============");
		int[][] arr2 = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 } };
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("===============multi D array===============");
		int[][][] arr3 = { { { 1, 2, 2 }, { 3, 4, 4 } }, { { 5, 6, 6 }, { 7, 8, 8 } } };

		for (int[][] arr2d:arr3) {

			for (int[] arr1d:arr2d) {

				for (int arrd:arr1d) {

					System.out.print(arrd + " ");
				}

				System.out.println();
			}
			System.out.println();
		}
	}

}
