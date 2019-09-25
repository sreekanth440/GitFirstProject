package org.employee;

import java.util.Scanner;

public class Task {
	
	public static void main(String[] args) {
		
		Scanner d= new Scanner(System.in);
		
		System.out.println("employee details");
		
	
		String name=d.next();
		System.out.println("emp name is"+name);
		int id=d.nextInt();
		System.out.println("emp id is"+id);
		
		String email=d.next();
		System.out.println("emp email is"+email);
		
		long phno=d.nextLong();
		System.out.println("emp phno is"+phno);
		
		float salary=d.nextFloat();
		System.out.println("emp salary is"+salary);
		
		String gender=d.next();
		System.out.println("emp gender is"+gender);
		
		String city=d.next();
		System.out.println("emp city is"+city);
	}
}
