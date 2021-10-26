package com.thoeun.java1026;

public class Logical2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		
		boolean r = x > 5 && x++ > 10;
		System.out.println(x);
		
		x = 10;
		r = x < 5 && x++ > 10;
		System.out.println(x);
	}

}
