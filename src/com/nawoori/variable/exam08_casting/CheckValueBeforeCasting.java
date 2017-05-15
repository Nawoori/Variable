package com.nawoori.variable.exam08_casting;

public class CheckValueBeforeCasting {

	public static void main(String[] args) {

		int i = 130;
		if(i<Byte.MIN_VALUE || i>Byte.MAX_VALUE){
			System.out.println("byte타입으로 변환할 수 없습니다.");
			System.out.println("값을 확인해주세요.");
		} else {
			byte b = (byte) i;
			System.out.println(b);
						
		}
		
	}

}