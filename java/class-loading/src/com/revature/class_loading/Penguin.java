package com.revature.class_loading;

public class Penguin extends Bird{

	// Static initiliazation block (executes during class loading)
	static {
		System.out.println("PenguinStatic");
	}
	
	{
		System.out.println("PenguinNon-Static");
	}
	
}
