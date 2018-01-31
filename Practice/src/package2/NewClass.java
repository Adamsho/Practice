package package2;

import package1.*;

public class NewClass extends Parent{
	public static void main(String[] args) {
		
		Parent pr = new Parent();
		NewClass n = new NewClass();
		
		
		
		System.out.println(n.city);
		pr.print();
		
		System.out.println("");
		
//		pr.setName("Amin");
//		System.out.println(pr.getName());
		
		
	}
}
