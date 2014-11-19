package com.main;

import java.util.Scanner;

import com.model.Wine;

public class AddReview {

    static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

	
		String another = "Y";
		while (!another.equalsIgnoreCase("N")) {
			another = getUserInput();   
		}
	    	    
	}
	
	private static String getUserInput() {
		String another;
		
		Wine wine = new Wine();
		
		System.out.println("Enter name:");			
		wine.setName(scanner.nextLine());   
		
		System.out.println("Enter type:");
		wine.setType(scanner.nextLine());   
			
		System.out.println("Enter year:");
		wine.setYear(scanner.nextInt());   
		
		System.out.println("Enter price:");
		wine.setPrice(scanner.next());   
		
		System.out.println(wine.toString() + " : Added");
		
		System.out.println("Enter another wine (Y/N):");			
		another = scanner.next();
		return another;
	}
}
