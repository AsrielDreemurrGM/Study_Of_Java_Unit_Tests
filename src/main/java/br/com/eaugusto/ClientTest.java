package br.com.eaugusto;

/**
 * Represents a basic test client entity used for unit testing.
 * <p>
 * This class contains a single {@code name} property with its corresponding
 * getter and setter methods, allowing test scenarios to verify attribute
 * assignment and retrieval.
 * </p>
 * 
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 19, 2025
 */
public class ClientTest {

	private String name;

	/**
	 * Gets the name of the test client.
	 *
	 * @return the name of the client
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name of the test client.
	 *
	 * @param name the name to assign to the client
	 */
	public void setName(String name) {
		this.name = name;
	}
}
