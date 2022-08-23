package week7.day2;

public class ChildClass extends ParentClass {//becoz final keyword
 
	public ChildClass () {
		super();//call the super class constructor
}
	public void childHouse() {
		super.parentHouse();
		System.out.println("childHouse");
	}
	public void childCar() {
		super.parentCar();
		System.out.println("childCar");
		
	}
	public  void parentHouse() {//overriding existing
		System.out.println("childHouse");
	}
	//access parent class method use super keyword
	//parent class method but implementation is different
	//Retrieve the functionality any super class
	//Applicable only in inheritance
	 public void parentCar() {
		 super.parentCar();
	 }
	
	public static void main(String[] args) {
		ChildClass cls=new ChildClass();
		cls.childHouse();
		cls.parentCar();
		cls.parentHouse();
		
	

	}

}
