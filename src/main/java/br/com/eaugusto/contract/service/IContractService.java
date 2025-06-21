package br.com.eaugusto.contract.service;

/**
 * Interface for contract service operations.
 * <p>
 * Encapsulates high-level actions typically performed by business logic layers.
 * Returns strings instead of objects for simplicity.
 * </p>
 * 
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 20, 2025
 */
public interface IContractService {

	/**
	 * Saves a contract.
	 *
	 * @return a success message
	 */
	String save();

	/**
	 * Deletes a contract by ID.
	 *
	 * @param id the contract ID
	 * @return a deletion message
	 */
	String delete(String id);

	/**
	 * Edits a contract.
	 *
	 * @param id      the contract ID
	 * @param newData the new data to assign
	 * @return an edit confirmation message
	 */
	String edit(String id, String newData);

	/**
	 * Searches for a contract.
	 *
	 * @param id the contract ID
	 * @return the contract data or {@code "Not Found"} if missing
	 */
	String search(String id);
}
