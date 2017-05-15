package com.nawoori.variable.exam01;

public class VariableScopeExample {

	public static void main(String[] args) {
		int a1;
		
		if(true) {
			int a2;
			
			a1 = 10;
			a2 = 20;
		}
		a1 = 20;
		
		for(int i = 0;  i<5;  i++) {
			int a3;
			a1 = 10;
			a3 = 30;
		}
			a1 = 10;

	}

}
