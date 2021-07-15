package day1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstClass {

	@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Assert.assertNotEquals("Test", "Test");
		System.out.println("First Line");
		
		StringBuffer a = new StringBuffer("1234");
		System.out.println(a.reverse());
		
		
		int i=10;
		System.out.println(String.valueOf(i));
		
	}

}