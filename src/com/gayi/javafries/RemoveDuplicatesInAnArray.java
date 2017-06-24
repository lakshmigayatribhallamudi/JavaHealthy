package com.gayi.javafries;

import java.util.Arrays;

public class RemoveDuplicatesInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = { 1, 2, 3, 1, 2, 3, 4 };
		//int[] arr = { 1, 1, 3, 5, 6, 5, 4, 2, 3, 4 };
		RemoveDuplicatesInAnArray rmv = new RemoveDuplicatesInAnArray();
		rmv.avoidDuplicates(arr);

	}

	public void avoidDuplicates(int[] arr) {

		// Ip arr : 1 2 3 1 2 4
		Arrays.sort(arr);

		// sorted arr: 1 1 2 2 3 4

		// Declaring and intializing two pointrs cp and mp
		int cp = 0;
		int mp = 1;

		// Iterating the loop through the array length
		while (mp < arr.length) {
			//// if arr[cp] equals to arr[mp]
			if (arr[cp] == arr[mp]) {

				// incrementing mp where cp remains same
				mp = mp + 1;
			}
			// If the first element at cp=0 has no duplicates
			else {

				cp = cp + 1;
				arr[cp] = arr[mp];
				mp = mp + 1;

			}

		}
		// System.out.println(cp);
		int[] arr1 = Arrays.copyOf(arr, cp + 1);

		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}

}
