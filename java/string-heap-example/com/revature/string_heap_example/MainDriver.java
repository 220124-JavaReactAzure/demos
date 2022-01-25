
public class MainDriver{

	public static void main(String[] args){
		String name1 = "Philip";
		String name2 = "Charles";
		String name3 = name1;
		// Declaring the name4 variable, instantiating a new String object and initializing the value to "Philip"
		// This is also an example of Wrapper Classes
		// We specifically want a NEW object that has a String value of "Philip"
		// String Pool - something has the same value 
		String name4 = new String("Philip"); 
		String name5 = "Philip";

		TestCase test = new TestCase("Philip");
		name4 = name5; 

		// System.out.println(name1 == name3);
		// System.out.println(name2 == name1);
		// System.out.println(name5 == name1);
		System.out.println(test);
		System.out.println(name4 == name1);
		System.out.println(name4.equals(name1));

		//System.out.println(name4 == name1);
		//System.out.println(name4.equals(name1));

		//System.out.println(name1 == test.nameTest);
		//System.out.println(name4 == test.nameTest);
		//System.out.println(name4.equals(test.nameTest));
	}

	public static class TestCase {
		// Class variable
		public String nameTest;

		// Class constructor
		public TestCase(String namalskdjfalskdjfe){
			this.nameTest = namalskdjfalskdjfe;
		}

		// Class method (there is some method involved)
		
	}

}