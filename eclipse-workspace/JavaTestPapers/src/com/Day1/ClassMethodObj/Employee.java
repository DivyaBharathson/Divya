package com.Day1.ClassMethodObj;

public class Employee {
	
	private void empID() {
		
		System.out.println("Emp ID");
		
	}
	private void empName() {
		System.out.println("Emp Name");

	}
	private void empDob() {
		System.out.println("Emp Dob");
	
	}
	private void empPhone() {
		System.out.println("Emp Phone");
	}
	private void empEmail() {
		System.out.println("Emp Email");

	}
	private void empAddress() {
		System.out.println("Emp address");

	}
	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.empID();
		emp.empName();
		emp.empPhone();
		emp.empDob();
		emp.empEmail();
		emp.empAddress();
		
	}

}
