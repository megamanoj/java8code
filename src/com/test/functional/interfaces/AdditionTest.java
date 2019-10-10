package com.test.functional.interfaces;

public class AdditionTest {
	public static void main(String[] args) {
		Addition add = (a ,b) -> System.out.println("sum of:" + (a + b));
		add.add(20, 30);
	}
}
