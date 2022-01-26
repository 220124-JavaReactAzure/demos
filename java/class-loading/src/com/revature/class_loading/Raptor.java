package com.revature.class_loading;

public class Raptor extends Bird{

	static {
		System.out.println("raptorStatic1");
	}
	
	{
		System.out.println("raptorNonstatic3");
	}
	
	public Raptor(){
		System.out.println("raptorConstructor");
	}
	
	{
		System.out.println("raptorNonstatic1");
	}
	
	{
		System.out.println("raptorNonstatic2");
	}
	
	static {
		System.out.println("raptorStatic2");
	}
	
	
	
}
