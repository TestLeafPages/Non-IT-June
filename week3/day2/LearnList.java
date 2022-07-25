package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(3);
		list.add(4);
		list.add(null);
		list.add(4);
		
		System.out.println(list.remove(5));
		System.out.println(list.get(3));
		System.out.println(list.contains(null));
		System.out.println(list.size());
		//list.clear();
		//System.out.println(list.isEmpty());
		Collections.sort(list);
		
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			
			System.out.println(list.get(i));
			
		}

	}

}
