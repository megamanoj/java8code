package com.test;
public class ApplicationMainClass {

	public static void main(String[] args) {
		System.out.println("main class started");
		Parrent p  = new Parrent() {
			
			@Override
			Parrent display() {
				System.out.println(":::  ::: Ananomus display :::  ::: ");
				return null;
			}
		};
		p.display();
		p.show();
		p = new Child();
		p.display();
		p.show();
	}
}
