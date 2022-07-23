package week3.day1;

public class ReverseString {

	public static void main(String[] args) {
		//Goal: To understand the String, loop

		//a) Create a class by name: ReverseString (with main method) in same package
		//b) Write a logic to reverse a String
		//c) Run and Confirm the reversed String is printed in console
       String name="Testleaf";//length 8  0...7
      char[] charArray = name.toCharArray();
      for (int i =charArray.length-1; i>=0; i--) {
    	  System.out.print(charArray[i]);
		
	}
      String str = "TestLeaf";

		// declare and initialize a variable count to store the number of occurrences
		int count=0;
		// convert the string into char array
		char[]charstr=str.toCharArray();
		System.out.println(charstr);
		//get the length of the array
			int lengthstr = charstr.length;
			System.out.println(lengthstr);
		// traverse from 0 till the array length 
			for (int i = 0; i < charstr.length; i++) {
		// Check the char array has the particular char in it 
		 if(charstr[i]=='e') {
			// if is has increment the count
			count++;
			System.out.println("occurrences of a char'e': "+ i);
		 }
	 }	// print the count out of the loop			
		 System.out.println(count);
       
      
      
      
     
      
       
       
       
	}

}
