package week3.day1;

public class LearnString {

	public static void main(String[] args) {
		//String Literal
		String str1="TestLeaf";
		String str3="testleaf";
		String str4="TestLeaf";
		String str2=new String("TestLeaf");
//validate both string same
		if(str1==str4) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}
		//Compare the string value
		System.out.println(str1.equals(str3));
		System.out.println(str1.equalsIgnoreCase(str3));
		//part of string or partial value available in string
		System.out.println(str1.contains("Leaf"));
		//convert string into character Array
		String s="Welcome";//w e l c o m e
		char[]ch=new char[6];
		ch[0]='W';//1 e 2 1
		//string.toCharArray
		char[] charArray = s.toCharArray();
		
		//find the length of the string
		int length = s.length();
		System.out.println(charArray[length-1]);
		//get specific character
		char charAt = s.charAt(0);//w
		System.out.println(charAt);
		//part of the stringTestleaf
		//substring(startindex)
		//substring(start,end index)
		System.out.println(s.substring(3));
		System.out.println(s.substring(5,7));//1-48 amazon 30000
		//To remove the space 
		String s1="       Wel   come           ";
		System.out.println(s1.trim());
		
		String s2="Welcome to testleaf";//welcome
		//to
		//Testleaf
		//split the string
		String[] split = s2.split(" ");
		System.out.println(split);
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]+" ");
		}
		
	//how to replace string
		System.out.println(s2.replace("o", "e"));
		
//adding two string
		//Concatenation
		System.out.println("My String"+str2);
		System.out.println(str1.concat(s2));
		
		
		
	}

}
