package package1;

public class Parenttest {
	public static void main(String[] args) {
		
		
		Parent p = new Parent();
		Child ch = new Child();

		Parent pt = new Child();
		pt.print();
		
		System.out.println(ch.name="Child class");
		ch.print();
		ch.Bla();
		System.out.println(ch.name="ch Obj");
		System.out.println(ch.city);
		System.out.println("-----------------------------------------------");
		
		System.out.println(p.name = "Amin");
		p.print();
		
	}
}
