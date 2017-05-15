package com.nawoori.variable.exam08_casting;

public class CastingExample {

	public static void main(String[] args) {
		
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int)longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
		//double이 실수이기 때문에 타입변환 때 값이 손상됨
	}

}
