package com.handling.exceptiondemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Item {
	public void getRecord() {
		try(Scanner sc = new Scanner(System.in)) {
			List itemList = new ArrayList();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
