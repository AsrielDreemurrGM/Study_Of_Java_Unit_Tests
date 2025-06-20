package br.com.eaugusto.mocks.dao;

/**
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 20, 2025
 */
public class ClientDAOMock implements IClientDAO {

	@Override
	public String save() {
		return "Success";
	}
}
