package com.test;

public class Hellojava8 {
	
	interface Hello{
        void hello(String str);
    }
 
    public static void main(String[] args) {
 
        Hello refHello = (String str) -> System.out.println("Hello " + str);
        
        refHello.hello("World");
    }
}