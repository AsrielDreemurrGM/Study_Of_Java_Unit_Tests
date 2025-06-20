package br.com.eaugusto;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test class for the {@link ClientTest} class.
 * <p>
 * This test ensures that the {@code setName} and {@code getName} methods in
 * {@code ClientTest} work as expected.
 * </p>
 * 
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 19, 2025
 */
public class TestClientTest {

	/**
	 * Tests setting and getting the name of a {@code ClientTest} instance.
	 */
	@Test
	public void clientClassTest() {
		ClientTest client = new ClientTest();
		client.setName("Eduardo");

		Assert.assertEquals("Eduardo", client.getName());
	}
}
