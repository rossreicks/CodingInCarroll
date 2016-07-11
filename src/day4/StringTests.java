package day4;

/*
 * need to also include the Unit Library.
 * to do this: right click on you class in the package
 * explorer and click build path -> configure build path
 * click the libraries tab from the top navigation
 * click add library from the right navigation and select
 * Junit -> JUnit 4
 */
import static org.junit.Assert.*;

import org.junit.*;

public class StringTests {
	String str = "mississippi";
	
	@Test
	public void testLength(){
		int length = str.length();
		assertEquals(length, 11);
	}
	
	@Test
	public void charAtTest(){
		char first = str.charAt(0);
		assertEquals(first, 'm');
	}
}
