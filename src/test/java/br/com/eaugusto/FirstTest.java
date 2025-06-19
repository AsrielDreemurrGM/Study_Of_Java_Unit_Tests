package br.com.eaugusto;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 19, 2025
 */
public class FirstTest {

	@Test
	public void test() {
		String name = "Eduardo";
		Assert.assertEquals("Eduardo", name);
	}

	@Test
	public void testNotEquals() {
		String name = "Eduardo";
		Assert.assertNotEquals("Eduardo1", name);
	}
}
