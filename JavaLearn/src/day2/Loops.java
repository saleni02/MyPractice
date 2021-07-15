package day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Loops {

	public static void main(String[] args) {
		// While Loop : Executed while a condition is true. Condition is checked before Execution of Statement
		System.out.println("---------While loop Starts from here---------"); 
		int x=1;
		 while(x<=4) {
			 System.out.println(x);
			 x++;
		 }
		 
		 //For Loop :
		 System.out.println("-------------For Loop starts here-----------");
		 for(int i=0; i<=5; i++) {
			 System.out.println(i);
		 }
		 
		 // Enhances for loop :
		 System.out.println("-----------------Enhanced For Loop STarts here----------------");
		 
		 HashSet <String> trucks = new HashSet <String> ();
		 trucks.add("VOLVO");
		 trucks.add("Mercedes Benz");
		 trucks.add("ASHOK LEYLAND");
		 trucks.add("TATA");
		 
		 for(String c : trucks) {
			 System.out.println(c);
		 }
		 
		// Do While Loop : Condition is checked after Execution of Statement
		 System.out.println("---------------------- DO While Loop Starts here ------------------");
		 
		 int b = 10 ;
		 do {
			 System.out.println(b);
			 b--;
		 }
		 while (b>=5);
	 
	}
	
}
