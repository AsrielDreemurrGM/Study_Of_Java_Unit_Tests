package br.com.eaugusto;

import org.junit.Assert;
import org.junit.Test;

/**
 * Contains basic string assertion tests using JUnit.
 * <p>
 * These tests verify whether string values match or differ as expected, serving
 * as an introductory example of unit testing with assertions.
 * </p>
 * 
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 19, 2025
 */
public class FirstTest {

	/**
	 * Tests if a string value is equal to the expected literal.
	 */
	@Test
	public void test() {
		String name = "Eduardo";
		Assert.assertEquals("Eduardo", name);
	}

	/**
	 * Tests that a string value is not equal to an incorrect literal.
	 */
	@Test
	public void testNotEquals() {
		String name = "Eduardo";
		Assert.assertNotEquals("Eduardo1", name);
	}
}
