package week3.day2;

public class Testing implements Language,Manualtesting{
	
	public static void main(String[] args) {
		Testing obj=new Testing();
		obj.java();
		obj.jirTool();

	}

	@Override
	public void jirTool() {
		System.out.println("jirTool");
		
	}

	@Override
	public void python() {

System.out.println("python");
		
	}

	@Override
	public void java() {

System.out.println("java");
		
	}

}
