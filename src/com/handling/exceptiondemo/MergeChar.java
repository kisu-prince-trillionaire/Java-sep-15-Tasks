package com.handling.exceptiondemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class MergeChar {
	public void merge() {
		try {
			PrintWriter pw = new PrintWriter("C:\\Users\\VISHAL KUMAR\\Downloads\\File handling\\data5.txt");
	         
	        BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\VISHAL KUMAR\\Downloads\\File handling\\data3.txt"));
	        BufferedReader br2 = new BufferedReader(new FileReader("C:\\Users\\VISHAL KUMAR\\Downloads\\File handling\\data4.txt"));
	          
	        String line1 = br1.readLine();
	        String line2 = br2.readLine();
	          
	        while (line1 != null || line2 !=null)
	        {
	            if(line1 != null)
	            {
	                pw.println(line1);
	                line1 = br1.readLine();
	            }
	              
	            if(line2 != null)
	            {
	                pw.println(line2);
	                line2 = br2.readLine();
	            }
	        }
	      
	        pw.flush();
	          
	        br1.close();
	        br2.close();
	        pw.close();
	          
	        System.out.println("Merged file1.txt and file2.txt alternatively into file3.txt");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
