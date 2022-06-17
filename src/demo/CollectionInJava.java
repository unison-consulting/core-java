package demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionInJava {

//	public CollectionInJava() {
//		
//	}

	public String name = "Peter1";
	private String name2 = "Peter2";
	public String name3 = "Peter3";
	public final String NAME_4 = "Peter4";
	public static String name5 = "peter5";

	public CollectionInJava(String name) {
		System.out.println("Hello " + name);
	}

	public CollectionInJava(String firstName, String lastName) {
		System.out.println("Hello " + firstName + " " + lastName);
	}

	private List<Integer> ids = new ArrayList<Integer>();

	private Integer[] ids2 = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21 };

	private void prepareList() {
		for (int i = 1; i <= 20; i++) {
			ids.add(i);
		}
	}

	private void displayList() {
		prepareList();
		prepareList();
		int i = 0;
		for (Integer item : ids) {
			if (i == 0) {
				System.out.print(item);
			} else {
				System.out.print("," + item);
			}
			++i;
		}

		System.out.println();

		for (int j = 0; j < ids2.length; j++) {
			System.err.print(ids2[j]);
		}
		System.out.println();

	}

	static Map<Integer, String> getDict() {
		Map<Integer, String> mapObj = new HashMap<Integer, String>();

		for (int i = 1; i <= 20; i++) {
			mapObj.put(i, String.valueOf(i));
		}

		return mapObj;
	}

	void displayMapValue(Map<Integer, String> pMapObj) {
		for (Map.Entry<Integer, String> item : pMapObj.entrySet()) {
			System.out.print("," + item.getKey() + "-" + item.getValue());
		}
	}

	Set<String> setObj = new HashSet<String>();
	// List<String> setObj = new ArrayList<String>();

	public void generateSet() {
		for (int i = 1; i <= 20; i++) {
			setObj.add(String.valueOf(i));
		}
	}

	public void displaySet() {
		for (String item : setObj) {
			System.out.print("," + item);
		}
	}

	public String welcomeMessage() {
		return "Welcome Guest";
	}

	public String welcomeMessage(String name) {
		return "Welcome " + name;
	}

	/**
	 * This method is main method, which execute all the function s
	 * 
	 * @param args -
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to Java");
		CollectionInJava obj = new CollectionInJava("Sekar");
		System.out.println("List Example !");
		obj.displayList();
		System.out.println("Map Example !");
		obj.displayMapValue(getDict());
		System.out.println();
		System.out.println("Set Example !");
		obj.generateSet();
		obj.generateSet();
		obj.displaySet();
		System.out.println();

		System.err.println(obj.welcomeMessage());

	}

}
