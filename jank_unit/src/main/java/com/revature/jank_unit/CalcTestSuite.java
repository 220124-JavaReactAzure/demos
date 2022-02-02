package com.revature.jank_unit;

public class CalcTestSuite {

	Calculator sut = new Calculator();
	
	@Test
	public void test_add_returns_CorrectAnswer() {
		int expected = 4;
		int actual = sut.add(2, 2);
		System.out.println("Test1 done.");
		JankDriver.assertThat(actual == expected);
	}
	
	@Test
	public void test_add_withNegatives() {
		int expected = -5;
		int actual = sut.add(0, -5);
		System.out.println("Test2 done.");
		JankDriver.assertThat(actual == expected);
	}
	
	@Test
	public void test_failsOnPurposed() {
		
		int expected = 0;
		int actual = sut.add(1, 1);
		System.out.println("Test3 done.");
		JankDriver.assertThat(actual == expected);
	}
	
	HashMap hmap = new HashMap();
}


