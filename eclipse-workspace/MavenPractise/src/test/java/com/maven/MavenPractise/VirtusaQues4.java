package com.maven.MavenPractise;

public class VirtusaQues4 {
	public static void main(String[] args) {

		String s = "h3Gk8&rt63Fn";
		
		int length = s.length();
		char[] charArray = s.toCharArray();
	
		Character c = new Character('a');
		for (int i = 0; i < charArray.length; i++) {
			if (Character.isDigit(charArray[i]) && Character.isUpperCase(charArray[i + 1])) {
				System.out.println(charArray[i + 1]);
				
			}

		}

	}

}
