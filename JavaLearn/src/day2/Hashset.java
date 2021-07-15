package day2;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
		
		HashSet <Integer> nu = new HashSet<Integer>();
		nu.add(4);
		nu.add(7);
		System.out.println(nu);
		
		HashSet<String> cars = new HashSet<String>();
		cars.add("MG");	
		cars.add("Tesla");
		cars.add("volvo");
		cars.add("BMW");
		
		
		System.out.println(cars.isEmpty());
		System.out.println(cars);
		
		//cars.add("Tesla");
		cars.add("TATA");
		System.out.println(cars);
		
		for(String i : cars) {
			System.out.println(i);
		}
		
		Iterator<String> it = cars.iterator();
		while (it.hasNext()) {
			if(it.next()=="Tesla") {
				System.out.println("I have Tesla");
			}			
		}	
	}
}
