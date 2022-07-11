package week1.day2;

public class Calculator {
	
	//method add,sub,mul,div
	public void add(int a,int b) {
		System.out.println(a+b);	
	}
	public void sub(int a, float b) {
		System.out.println(a-b);
		
	}
	public void mul(double a,int b,double c) {
		System.out.println(a*b*c);
		
	}
	public void div(long a ,double b,float c)  {
		System.out.println(a/b/c);
		
	}
	//sub(int float)
	//mul(double,int,double)
	//div(long,double,float)
	
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		cal.add(12, 10);
		cal.sub(23, 2.0f);
		cal.mul(234d, 12, 2345d);
		cal.div(23324l, 23.4d, 23.4f);
		

	}

}
