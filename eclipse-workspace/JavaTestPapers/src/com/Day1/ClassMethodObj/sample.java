package com.Day1.ClassMethodObj;

public class sample {
	public static void main(String[] args) {
		
	
	
	double actualTotalPrice=137.5, actualPricePerNight=125;
	if(actualTotalPrice==((actualPricePerNight/10)+actualPricePerNight)) {
		System.out.println("The final amount displayed has 10% tax included");
	}else {
		System.out.println("The final amount displayed is not correct");
	}

}
}