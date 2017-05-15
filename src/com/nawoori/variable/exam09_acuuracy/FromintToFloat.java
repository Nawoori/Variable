package com.nawoori.variable.exam09_acuuracy;

public class FromintToFloat {

	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		double num3 = num2;
		num2 = (int) num3;
		
		int result = num1- num2;
		System.out.println(result);

	}

}

//float타입은 가수가 23비트밖에 저장못함으로 초과하면 쓰레기값나옴.
//가능하면 정수는 double타입으로 변환. 쓰레기값 나옴.