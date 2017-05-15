package com.nawoori.variable.exam07_promotion;

public class PromotionExample {

	public static void main(String[] args) {
		
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println(intValue);
		
		intValue = 500;
		long longValue = intValue;
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue);
		
		longValue =10000000000L;
		float floatValue = longValue;
		//float가 부동소수점 방시을 쓰기 때문에 가능
	}

}
