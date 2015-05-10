package com.demo.salestool;

public class SalesData {
	int[] data = {10,20,30,40,50,60};
	
	public void display() {
		System.out.println("Data: ");
		for(int i:data){
			System.out.println("Next Value: " + data[i]);
		}
	}

}
