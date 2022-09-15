package com.handling.exceptiondemo;

import java.security.DigestException;
import java.util.Scanner;

public class Division {
	public void divide() {
		try {
			int a;
			int b;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the first no : ");
			a = sc.nextInt();
			System.out.println("Enter the sceond no : ");
			b = sc.nextInt();
			
			int q = a/b;
			System.out.println("The quotient is : " + q);
			sc.close();
		}
		catch(ArithmeticException   e) {
			System.out.println(e);
		}
		finally {
			System.out.println("In finally Clause");
		}

	}
}
