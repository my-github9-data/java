package com.sunbeam;

public class Test<T> implements Check<T>{
	static <T> int countIf(T[] arr,T key, Check<T> c) {
		int counter =0;
		for (T ele : arr) {
			if (c.compare(ele,key))
				counter++;
		}return counter;
	}
	public static void main(String[] args) {
		Integer [] arr = {44, 77, 99, 22, 55, 66};
		Integer key = 50;
		
		int cnt = countIf(arr, key, (x,y)-> x > y);
		System.out.println("Count = " + cnt);

	}
	@Override
	public boolean compare(T x, T y) {
		return false;
	}

}
