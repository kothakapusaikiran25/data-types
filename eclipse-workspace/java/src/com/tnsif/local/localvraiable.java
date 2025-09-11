package com.tnsif.local;

public class localvraiable {
	int instanceVar = 10;
	
	public void showValues() {
		int localVar = 20;
		
		System.out.println("Instance Variable: " + instanceVar);
		System.out.println("Local Variable: " + localVar);
	}

	public static void main(String[] args) {
		
		localvraiable obj = new localvraiable();
		
		obj.showValues();
	

	}

}
