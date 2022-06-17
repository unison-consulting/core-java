package demo2;

import demo.CollectionInJava;

public class InheritanceExample1 extends CollectionInJava {

	public InheritanceExample1(String name) {
		super(name);
	}

	public InheritanceExample1(String fName, String lName) {
		super(fName, lName);
	}

	public String welcomeMessage(String name) {
		return "Welcome in Child Class " + name;
	}

	public String welcomeMessage(String fName, String lName) {
		return "Welcome in Child Class " + fName + " " + lName;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Welcome Inheritance Example");

		InheritanceExample1 example = new InheritanceExample1("Sekar", "Poomalai");

		example.generateSet();
		example.displaySet();
		String msg = example.welcomeMessage("Sekar");
		System.err.println();
		System.err.println(msg);
		System.err.println(example.welcomeMessage("John", "Lee"));
		
		example.name = "Sekar";

		System.err.println(example.name);
		System.err.println(example.name3);
		System.err.println(example.NAME_4);
		System.err.println(name5);
	}

}
