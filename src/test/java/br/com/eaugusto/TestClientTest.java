package br.com.eaugusto;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 19, 2025
 */
public class TestClientTest {

	@Test
	public void clientClassTest() {
		ClientTest client = new ClientTest();
		client.setName("Eduardo");

		Assert.assertEquals("Eduardo", client.getName());
	}
}
