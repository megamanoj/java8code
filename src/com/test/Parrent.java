package com.test;

public abstract class Parrent {
	abstract Parrent display();

	public Parrent() {
		System.out.println(":::  ::: Parrent constructor :::  ::: ");
	}

	Child show() {
		System.out.println(":::  ::: Parrent show :::  ::: ");
		return null;
	}

}
