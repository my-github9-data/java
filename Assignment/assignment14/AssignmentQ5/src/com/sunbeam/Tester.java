package com.sunbeam;

import java.util.Scanner;

public class Tester<T> implements Check<T>{
	static <T> int countIf(T[] arr,T key, Check<T> c) {
		int counter =0;
		for (T ele : arr) {
			if (c.compare(ele,key))
				counter++;
		}return counter;
	}
	@Override
	public boolean compare(T x, T y) {
		return false;
	}
	
	public static void main(String[] args) {
		Double[] arr= {1.1,1.2,1.3,1.2,1.5,1.4,1.5,1.1};
		Double key;
		System.out.print("Enter the key ");
		Scanner sc =new Scanner(System.in);
		key = sc.nextDouble();
		
		int cnt =countIf(arr,key,(e,k)-> e.equals(k));
		System.out.println("Count:" +cnt);
	}
}
