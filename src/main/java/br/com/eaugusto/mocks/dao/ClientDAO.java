package br.com.eaugusto.mocks.dao;

/**
 * Real (unimplemented) DAO for client operations.
 * <p>
 * This class represents a database-backed DAO that throws an exception when any
 * operation is attempted. Used to simulate production behavior.
 * </p>
 * 
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 20, 2025
 */
public class ClientDAO implements IClientDAO {

	@Override
	public String save() {
		throw new UnsupportedOperationException("Doesn't work");
	}
}
