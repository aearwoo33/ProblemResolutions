package com.alan.util;

import java.util.Arrays;

public class SumNLargest {
	
	public static void main(String[] args) {
		Integer[] array = { 2,4,7,9,29,9,73,2};
		int n = 5;
		int sum = calc (array, n);
		
		System.out.println(sum + " is the sum of the top " + n + " numbers.");
	}
	public static int calc(Integer[] array, int nLargest) { // Has side-effect of sorting array
		int sum = 0;
		Arrays.sort(array, (Integer e1, Integer e2)->e2 - e1);
		for (Integer i : array){
			sum += i;
			if (--nLargest == 0) {
				break;
			}
		}
		return sum;
	}
}
