package week7.day2;

public class LearnStatic {

	static int a=5;
	int b=6;
	public static void print() {
		System.out.println("Print");
	}
	public void read() {
		System.out.println("read");
	}
	public static void main(String[] args) {
		LearnStatic obj=new LearnStatic();
		System.out.println(obj.b);
		System.out.println(a);
     print();
     obj.read();
	}

}
