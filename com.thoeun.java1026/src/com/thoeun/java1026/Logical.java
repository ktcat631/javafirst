package com.thoeun.java1026;

public class Logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 2021;
		
		boolean pan = year % 4 == 0 && year % 100 != 0;
		
		if(pan == true) {
			System.out.println("year는 윤년");
		}else {
			System.out.println("year는 윤년이 아님");
		}
	}

}
