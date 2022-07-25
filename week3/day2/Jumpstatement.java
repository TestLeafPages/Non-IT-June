package week3.day2;

public class Jumpstatement {

	public static void main(String[] args) {
		int num=10;
		for (int i = 0; i <=num; i++) {
			if(i==5) {
				//break;
			
				//break;//terminate entire execution
			continue;//skip the particular value
			}
			System.out.println(i);
		}
		System.out.println("Out of loop");
	}

}
