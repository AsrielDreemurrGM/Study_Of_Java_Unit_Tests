package br.com.eaugusto.contract.dao;

/**
 * Interface defining CRUD operations for contract entities.
 * <p>
 * All methods receive or return Strings to simulate contract data without
 * binding to specific classes or persistence layers.
 * </p>
 * 
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 20, 2025
 */
public interface IContractDAO {

	/**
	 * Saves a contract entry (predefined for mocks).
	 */
	void save();

	/**
	 * Deletes a contract with the specified ID.
	 *
	 * @param id the contract ID to delete
	 */
	void delete(String id);

	/**
	 * Updates a contract with new data.
	 *
	 * @param id      the contract ID to update
	 * @param newData the new data to store
	 */
	void edit(String id, String newData);

	/**
	 * Searches for a contract by its ID.
	 *
	 * @param id the contract ID to search for
	 * @return the contract data or {@code null} if not found
	 */
	String search(String id);
}
