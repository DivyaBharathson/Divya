package com.Day2.Inheritance.Scanner.Datatype.AccessSpecifier;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Emp ID");
		
		int i = sc.nextInt();
		System.out.println(i);
		System.out.println("enter a name");
		String nme = sc.next();
		System.out.println(nme);
		System.out.println("enter full name");
		String full = sc.nextLine();
		System.out.println(full);
		
	
	}
	
	
}
