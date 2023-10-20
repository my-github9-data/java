package com.sunbeam;

import java.util.Scanner;
import java.util.stream.Stream;

public class Factorial {

	public static void main(String[] args) {
		
		System.out.print("Enter the No. - ");
		Scanner sc = new Scanner (System.in);
		int num= sc.nextInt();
		
		Stream<Integer> strm = Stream.iterate(1,i->i+1).limit(num);
		int res= strm.reduce(1,(a,e)-> a*e);
		System.out.println(res);
	}

}
