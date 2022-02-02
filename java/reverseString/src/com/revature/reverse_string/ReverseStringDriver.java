package com.revature.reverse_string;

public class ReverseStringDriver {

	public static void main(String[] args) {
		// Print out a string in reverse, the whole string
		
		String helloThere = "helloThere";
		String reversed = "";
		
		// Iterative
		for(int i = helloThere.length() - 1; i >= 0; i--) {
			reversed = reversed.concat(String.valueOf(helloThere.charAt(i)));
		}
		
		String returnedReverse = reverseString("pineapple");
		System.out.println(returnedReverse);
		
		System.out.println(reversed);
		
		StringBuilder buildReverse = new StringBuilder();
		buildReverse.append(helloThere);
		System.out.println(buildReverse.reverse());
		
		
	}
	
	public static String reverseString(String word) {
		StringBuffer buffReverse = new StringBuffer();
		buffReverse.append(word);
		return buffReverse.reverse().toString();
	}

}
