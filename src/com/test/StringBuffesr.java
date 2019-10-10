package com.test;

public class StringBuffesr {
	
	public static void main(String[] args) {
		StringBuffer buffer=new StringBuffer("manoj");
		System.out.println("original String:"+buffer);
		buffer.reverse();
		System.out.println("reverse String:"+buffer);
		System.out.println("length:"+buffer.length());
	}

}
