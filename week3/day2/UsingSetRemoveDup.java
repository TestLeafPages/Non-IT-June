package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UsingSetRemoveDup {

	public static void main(String[] args) {
		//input="We Learn Java In Week3 Java"
		String input="We Learn Java In Week3 Java";
		String[] split = input.split(" ");
		Set<String> dupset=new LinkedHashSet<String>(Arrays.asList(split));
		
		//convert Set into List
		List<String>list=new ArrayList<String>(dupset);
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i)==list.get(i+1)) {
				
				System.out.println(list.get(i));
			
		}
		
		}
		//System.out.println(dupset);
	}

}
