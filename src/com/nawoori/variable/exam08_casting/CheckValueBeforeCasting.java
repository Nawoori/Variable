package com.nawoori.variable.exam08_casting;

public class CheckValueBeforeCasting {

	public static void main(String[] args) {

		int i = 130;
		if(i<Byte.MIN_VALUE || i>Byte.MAX_VALUE){
			System.out.println("byteŸ������ ��ȯ�� �� �����ϴ�.");
			System.out.println("���� Ȯ�����ּ���.");
		} else {
			byte b = (byte) i;
			System.out.println(b);
						
		}
		
	}

}