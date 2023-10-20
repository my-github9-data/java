package com.sunbeam;

import java.util.stream.IntStream;

public class Range {

	public static void main(String[] args) {
	 IntStream i1=IntStream.range(1, 10);
	 int a=i1.sum();
	 System.out.println(a);
	 
	 IntStream i2= IntStream.range(1, 10);
	 System.out.println(i2.summaryStatistics());
	}

}
