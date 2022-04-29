package com.interviewpractice.string;

class Test1 {

	// Constructor of this class
	Test1(int x)
	{

		// Print statement whenever this constructor is
		// called
		System.out.println("Constructor called " + x);
	}
}

// Class 2
// Class contains an instance of Test1
// Main class
class Test2 {

	// Creating instance(object) of class1 in this class
	Test1 t1 = new Test1(10);
	Test1 t3 = new Test1(15);

	// Constructor of this class
	Test2(int i) { t1 = new Test1(i); }

	// Main driver method
	public static void main(String[] args)
	{
		// Creating instance of this class inside main()
		Test2 t2 = new Test2(5);
	}
}
