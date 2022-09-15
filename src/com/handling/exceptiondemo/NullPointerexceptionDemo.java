package com.handling.exceptiondemo;

public class NullPointerexceptionDemo {
	public void print(String str) {
		try {
			System.out.println(str.length());
			
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
	}
	

}
