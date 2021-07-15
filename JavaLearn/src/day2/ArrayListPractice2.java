package day2;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice2 {

	public static void main(String[] args) {
		
		ArrayList<String> listy = new ArrayList<String>();
		listy.add("Volvo");
		System.out.println("without indices "+listy);
		System.out.println(listy.indexOf("Volvo"));
		
		listy.add(0, "Tesla");
		listy.add(1, "BMW");
		listy.add(2, "TATA");
		listy.add(3, "MG");
		listy.add(4, "Ford");
		listy.add(5, "Ford");
		System.out.println("with indices "+listy);
		System.out.println(listy.indexOf("Volvo"));
		
		
		Iterator<String> it = listy.iterator();
		while(it.hasNext()) {
			if(it.next()== "Ford") {
				System.out.println("I have Ford");
			}		
		}
		
		
		
	}

}
