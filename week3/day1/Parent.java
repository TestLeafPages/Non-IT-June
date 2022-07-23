package week3.day1;

public class Parent extends  GrandParent  {
 static int house =1;
public  void oneHouse() {
	System.out.println("Father house");
}
	public static void main(String[] args) {
		Parent obj=new Parent();
		System.out.println(house);
		obj.oneHouse();
		//obj.house();

	}

}
