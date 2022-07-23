package week3.day1;

public class LearnArray {

	public static void main(String[] args) {

//Goal find how many 78 is available
		int[] input= {23,34,56,78,78,23};
		int count=0;
		int length = input.length;
		//loop each value
		for (int i = 0; i < input.length; i++) {//6
		//conditon (if) match with expect value
			if(input[i]==78) {//input[1]78==78
				count++;//increment by 1
			}
		}
		System.out.println("The count of 78 is"+ count);
		//count variable to increment
		//print the result
		
}
	}


