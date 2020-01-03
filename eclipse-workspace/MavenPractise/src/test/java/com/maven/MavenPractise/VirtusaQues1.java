package com.maven.MavenPractise;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class VirtusaQues1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		char[] charArray = s.toCharArray();
		Character c = new Character('a');

		Set<Character> set = new LinkedHashSet<Character>();

		for (int i = 0; i < charArray.length; i++) {

			for (int j = i + 1; j < charArray.length; j++) {

				if (charArray[i] == (charArray[j])) {
					set.add((charArray[i]));
				}
			}
		}
		System.out.println("Dup char in the string are : "+set);
//		for (char d : set) {
//			 System.out.println(d);
		}

	}

