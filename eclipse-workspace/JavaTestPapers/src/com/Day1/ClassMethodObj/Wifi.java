package com.Day1.ClassMethodObj;

public class Wifi extends MobileData {

			private void wifiName() {
				System.out.println("Wifi Name");
			}
			public static void main(String[] args) {
				Wifi w=new Wifi();
				
//				MobileData m= new MobileData();
//				Lan l=new Lan();
//				WireLess wi=new WireLess();
	
				w.wifiName();
				w.mobileData();
				w.lan();
				w.wireLess();
				
			}
}
