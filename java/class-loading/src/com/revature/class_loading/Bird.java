package com.revature.class_loading;

public class Bird {

	// non-static initialization block (runs before constructor logic during object instantiation
	{
		System.out.println("birdNon-Static");
	}
	
	public Bird(){
		System.out.println("birbConstructor");
	}
	
	static {
		System.out.println("BirbStatic");
	}
}
