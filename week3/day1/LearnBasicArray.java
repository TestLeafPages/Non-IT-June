package week3.day1;

import java.util.Arrays;

public class LearnBasicArray {

	public static void main(String[] args) {
		int [] nums= {10,50,40,30,20};//int array
		String [] companys= {"Tcs","CtS"};
		
		
		int length = nums.length;//ctrl+2+l
		System.out.println(length);
		System.out.println(nums[length-1]);
		//To read first data
		//arrayname[index]
		System.out.println(nums[0]);
		//Read the last data
		//arrayname[length-1] 5-1=4 50
        //To sort the data
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {//5
			System.out.println(nums[i]);
			
		}
		int [] num= {22,39,82,75,0,45};//6
		Arrays.sort(num);//0 22 39 45 75 82
		System.out.println(num[0]);
		System.out.println(num[length]);
	}

}
