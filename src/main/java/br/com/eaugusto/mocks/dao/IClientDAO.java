package br.com.eaugusto.mocks.dao;

/**
 * Interface for client DAO operations.
 * <p>
 * Defines the contract for saving clients in the system.
 * </p>
 * 
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 20, 2025
 */
public interface IClientDAO {

	/**
	 * Saves a client entity.
	 *
	 * @return a string representing the result of the operation
	 */
	String save();
}
