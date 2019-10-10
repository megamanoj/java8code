package com.test;

public class MethodOverLoadingByNumArgmnts {
	
	public static  int add(int i,int j)
	{
		return i+j;
	}
	
	public static int add(int i,int j,int k) {
		return i+j+k;
	}
	public static void main(String[] args) {
		
		System.out.println(MethodOverLoadingByNumArgmnts.add(10, 30));
		System.out.println(MethodOverLoadingByNumArgmnts.add(20, 30, 40));
		
	}
}
