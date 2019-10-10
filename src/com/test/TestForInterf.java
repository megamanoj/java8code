package com.test;

public class TestForInterf {

	public static void main(String[] args) {
		Demo1 demo=new Demo1();
		demo.m1();
		
		//calling chiled By parent refence..
		Interf interf=new Demo1();
		interf.m1();
	
	}
}
