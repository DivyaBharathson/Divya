package com.maven.MavenPractise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class VirtusaQues3 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String 1");
		String s1=sc.nextLine();
		System.out.println("Enter String 2");
		String s2=sc.nextLine();
		System.out.println("Enter String 3");
		String s3=sc.nextLine();
		System.out.println("Enter String 4");
		String s4=sc.nextLine();
		System.out.println("The strings after arranging them in order : fghtklm");
		
		List<String> li=new ArrayList<String>();
		li.add(s1);
		li.add(s2);
		li.add(s3);
		li.add(s4);
		
		for (String string : li) {
			if (string.startsWith("f")) {
				System.out.println(string);
			}
		}
			for (String string1 : li) {
				 if (string1.startsWith("g")) {
				System.out.println(string1);
				
			}
			}for (String string2 : li) {
				 if (string2.startsWith("h")) {
				System.out.println(string2);
				 }
			}
			for (String string3 : li) {
				 if (string3.startsWith("t")) {
				System.out.println(string3);
				 }
			}
			for (String string4 : li) {
				 if (string4.startsWith("k")) {
				System.out.println(string4);
				 }
			}
			for (String string5 : li) {
				 if (string5.startsWith("l")) {
				System.out.println(string5);
				 }
			}
			for (String string6 : li) {
				 if (string6.startsWith("m")) {
				System.out.println(string6);
				 }
			}
		
	}

	

}
