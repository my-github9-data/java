package com.sunbeam;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class ReadWrite {

	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		try(FileWriter fw= new FileWriter("File_Read_Write.txt")){
			try(BufferedWriter bwr= new BufferedWriter(fw)){
				for(int i=1; i<=4; i++) {
					System.out.print("Enter four ele -");
					String line = sc.nextLine();
					bwr.write(line);
					bwr.newLine();
					}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
