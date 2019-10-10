package com.test.functional.interfaces;

public class ClassThread {
	
public static void main(String[] args) {
	Runnable r=()->{
		for (int i = 0; i <=5; i++) {
			System.out.println("chield thread");
		}
	};
	Thread t=new Thread(r);
	t.start();
	for (int i = 0; i <=5; i++) {
		System.out.println("parent thread");
	}
}
}
