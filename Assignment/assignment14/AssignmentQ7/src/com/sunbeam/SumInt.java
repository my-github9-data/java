package com.sunbeam;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class SumInt {

	public static void main(String[] args) {
		Random r =new Random();
		Stream<Integer> s = Stream.generate(()->r.nextInt(10)).limit(10);
		int res= s.reduce(0,(a,e)-> a+e);
		System.out.println(res);	
	}

}
