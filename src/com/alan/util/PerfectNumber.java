package com.alan.util;

import java.util.ArrayList;
import java.util.List;

public class PerfectNumber {
	public static void main(String[] args) {
		System.out.println(PerfectNumber.isPerfect(6));
		System.out.println(PerfectNumber.isPerfect(496));
		System.out.println(PerfectNumber.isPerfect(15));
		
	}
	public static boolean isPerfect(int num) {
		int sum=0;
		List<Integer> listDivisors = getDivisorList(num);
		
		sum=0;
		for (int a : listDivisors) {
			sum += a;
		}
		
		return (num ==  sum - num)? true : false;
	}
	
	private static List<Integer> getDivisorList(int num) {
		List<Integer> listDivisors = new ArrayList<>();
		for (int i = num; i > 0; --i) {
			if ( listDivisors.contains(i)) {
				break;
			}
			for (int x = 0; x <= i; x++ ) {
				if (i * x == num) {
					listDivisors.add(i);
					listDivisors.add(x); 
				}
			}
		}
		return listDivisors;
	}
}
