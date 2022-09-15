package com.handling.exceptiondemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MultipleCatch {
	public void createFile() throws IOException {
		try {
			File file = new File("Any file");
			if(file.createNewFile()) {
				System.out.println("New file created");
			}
			else {
				System.out.println("File already exist");
			}
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
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
