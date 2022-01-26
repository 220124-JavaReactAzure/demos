package com.revature.class_loading;

public class Hawk extends Raptor {
	
	static {
		System.out.println("hawk1");
	}

	public static void main(String[] args) {
		System.out.println("initilize");
		new Penguin();
		new Hawk();
		System.out.println("done.");
	}

}
