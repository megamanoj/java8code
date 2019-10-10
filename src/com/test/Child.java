package com.test;

public class Child extends Parrent {

	public Child() {
		super();
		System.out.println(":::  ::: Child constructor :::  ::: ");
	}

	@Override
	Parrent display() {
		System.out.println(":::  ::: Child constructor :::  ::: ");
		return null;
	}

	@Override
	Child show() {
		System.out.println(":::  ::: Parrent show :::  ::: ");
		return null;
	}
}
