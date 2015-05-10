package com.demo.salestool;

/**
 * 
 * @author Nikhil Bangar
 *
 */

public class SalesData {
	int[] data = {10,20,30};
	
	public void display() {
		System.out.println("Data: ");
		int sum = 0;
		for(int i=0; i < data.length; i++){
			System.out.println("Next Value: " + data[i]);
			sum+=i;
		}
		System.out.println("Sum is: " + sum);
	}

}
