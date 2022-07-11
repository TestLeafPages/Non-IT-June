package week1.day2;

public class LearnAccessModifier {

	public void method1() {
		System.out.println("method-Public");
	}
	private void method2() {

       System.out.println("method-private");

	}
	protected void method3() {
		System.out.println("method3-protected");
		
	}
	void method4() {
		System.out.println("method4-default");
	}
	
	public static void main(String[] args) {
		LearnAccessModifier obj =new LearnAccessModifier();	
         
	}

}
