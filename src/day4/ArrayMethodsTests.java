package day4;

import static org.junit.Assert.*;

import org.junit.*;


public class ArrayMethodsTests {
	@Test
	public void printArray(){
		ArrayMethods arr = new ArrayMethods();
		arr.swapFirstAndLast();
		assertEquals(arr.printArray(),"[9,4,5,6,8,1]");
	}
}
