package week3.day1;

public class FindOccurance {

	public static void main(String[] args) {
		 String str = "TestLeaf";
         int count=0;
			// declare and initialize a variable count to store the number of occurrences
			
			// convert the string into char array
			char[] charArray = str.toCharArray();
			//get the length of the array
				int length = str.length();
			// traverse from 0 till the array length 
             for (int i = 0; i < charArray.length; i++) {
            	// Check the char array has the particular char in it 
				if(charArray[i]=='e') {//0-'T'
					count++;// if is has increment the count
			 //System.out.println("The occurance"+charArray[i]);
			 }
		 }	
             System.out.println("The occurance:e"+count);
             // print the count out of the loop		
	}
}
