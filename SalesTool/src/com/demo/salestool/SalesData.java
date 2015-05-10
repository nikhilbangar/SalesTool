package com.demo.salestool;

/**
 * 
 * @author Nikhil Bangar
 *
 */

public class SalesData {
	int[] data = {10,20,30,40,50,60};
	
	public void display() {
		System.out.println("Data: ");
		int sum = 0;
		for(int i:data){
			System.out.println("Next Value: " + data[i]);
			sum+=i;
		}
		System.out.println("Sum is: " + sum);
	}

}
