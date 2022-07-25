package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveDuplicate {
//1. List - {Adam,Ben, Zara, Adam, Charlie, James, Ben} 
	//Print only the duplicate - Adam, Ben 
	public static void main(String[] args) {
		List<String> name=new ArrayList<String>();
		int count=0;
         name.add("Adam");
         name.add("Ben");
         name.add("Zara");
         name.add("Adam");
         name.add("Charlie");
         name.add("James");
         name.add("Ben");
         name.add("Adam");
         name.add("Adam");
         Collections.sort(name);
         for (int i = 0; i <name.size()-1; i++) {
			//if(name.get(i)==name.get(i+1)) {//Adam Adam Ben Ben charlie  James Zara
			if(name.get(i)=="Adam") {
				count++;
        	 
			}
		}
         System.out.println(count);
	}

}
