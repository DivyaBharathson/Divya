package org.allvehicle;

import org.fourwheeler.FourWheeler;

public class Vehicle extends FourWheeler {
	
	public void VehicleNecessery() {
		System.out.println("Vehicle Neccessary");

	}
	
	public static void main(String[] args) {
		
		Vehicle v=new Vehicle();
		v.cycle();
		v.Auto();
		v.bike();
		v.Bus();
		v.car();
		v.lorry();
		
	}

}
