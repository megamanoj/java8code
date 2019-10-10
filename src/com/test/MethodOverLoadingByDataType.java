package com.test;

public class MethodOverLoadingByDataType {

	public void sum(int i, int j) {
		System.out.println("sum:" + (i + j));
	}

	public void sum(int a, int b, int c) {
		System.out.println("sum:" +( a + b + c));
	}

	public static void main(String[] args) {
		MethodOverLoadingByDataType methodOverLoadingByDataType = new MethodOverLoadingByDataType();
		methodOverLoadingByDataType.sum(10, 30);
		methodOverLoadingByDataType.sum(5, 10, 20);
	}
}
