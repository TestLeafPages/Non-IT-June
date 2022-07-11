package week1.day2;

public class LearnReturnType {
	
	public String myName(String name) {
		
		System.out.println(name);
		return name;
	}
	public int age(int num) {
		
		System.out.println(num);
		return num;
	}

	public static void main(String[] args) {
		 LearnReturnType obj=new  LearnReturnType();
		obj.age(30);
		obj.myName("Testleaf");	}

}
