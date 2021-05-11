package org.sonnyjava.nestedloop;

import java.util.Scanner;

public class NestedLoop {

	public static void main(String[] args) {
		
		int rows, columns;
		String symbol = "";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number of rows: ");
		rows = scan.nextInt();
		System.out.println("Enter number of columns: ");
		columns = scan.nextInt();
		System.out.println("Enter any symbol you like: ");
		symbol = scan.next();
		
		for(int i=1; i<=rows; i++) {
			System.out.println();
				for(int j =1; j<=columns; j++) {
					System.out.print(symbol);	
			}
				
		}	
		
		scan.close();
	}

}
