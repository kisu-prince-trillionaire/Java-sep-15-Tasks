package com.handling.exceptiondemo;

import java.util.Scanner;

public class TryResource {
	public void add() {
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter two no to add : ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a+b;
			System.out.println("The sum is : " + c);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
