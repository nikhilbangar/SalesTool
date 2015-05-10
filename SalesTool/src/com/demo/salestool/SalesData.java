package com.demo.salestool;

public class SalesData {
	int[] data = {10,20,30};
	
	public void display() {
		System.out.println("Data: ");
		for(int i=0; i < data.length; i++){
			System.out.println("Next Value: " + data[i]);
		}
	}

}
