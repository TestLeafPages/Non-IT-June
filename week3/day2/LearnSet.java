package week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		Set<String> data=new TreeSet<String>();
		data.add("Tcs");
		data.add("Tcs");
		data.add("CTS");
		data.add("cts");
		data.add("Hp");
		data.add("Hp");
		
		System.out.println(data.remove("cts"));
		
		System.out.println(data.size());
		System.out.println(data.add("Amazon"));
		System.out.println(data);
		//iterate all data
		//for(data type variable:where u r getting data)
		for (String output : data) {
			System.out.println(output);
			
		}
		

	}

}
