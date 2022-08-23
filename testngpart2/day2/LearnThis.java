package week7.day2;

public class LearnThis {//Create object for current class
   int a=10;
   
    public void write() {
		System.out.println("Hello");
    }
   
    public LearnThis() {
    	this("Testleaf");
    	
    	System.out.println("First data");//Third run	
	}
    
    public LearnThis(String name) {
    	this(20);
    System.out.println("Two constructor");//second run
    }
   
    public LearnThis (int a) {
          
		System.out.println("Third  constructor");//first run
	}
    
    public void print(String name) {
    	int var=this.a;//ctrl+2+l   //this can used inside same class
    	System.out.println(this.a);
    	this.print("Testleaf");
		
	}
	public static void main(String[] args) {
		  LearnThis obj=new LearnThis(); //Create object for class
		  System.out.println(obj.a);   //inside main method we con't use keyword
		  obj.write();	 

	}

}
