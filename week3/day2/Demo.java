package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
     String input="Testleaf";//testlaf
     char[] charArray = input.toCharArray();
     Set<Character>unique=new LinkedHashSet<Character>();
     for (int i = 0; i < charArray.length; i++) {
    	 if(!unique.add(charArray[i])) {
    		 unique.remove(charArray[i]);
    		 
    	 }
		
	}
     System.out.println(unique);
     
     
		
	}

}
