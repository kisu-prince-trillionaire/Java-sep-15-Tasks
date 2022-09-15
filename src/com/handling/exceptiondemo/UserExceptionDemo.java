package com.handling.exceptiondemo;

import java.util.Scanner;

public class UserExceptionDemo {
	public void check() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your age : ");
			int age = sc.nextInt();
			if(age < 19) {
				throw new InvalidAgeException("Invalid age Exception");
			}else {
				System.out.println("The age is " + age);
			}
		}
		catch(Exception w) {
			System.out.println(w);
		}
	}

}
