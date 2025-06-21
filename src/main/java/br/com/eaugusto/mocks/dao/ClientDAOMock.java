package br.com.eaugusto.mocks.dao;

/**
 * Mock implementation of {@link IClientDAO} for testing purposes.
 * <p>
 * Always returns "Success" when saving a client.
 * </p>
 * 
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 20, 2025
 */
public class ClientDAOMock implements IClientDAO {

	@Override
	public String save() {
		return "Success";
	}
}
