package br.com.eaugusto.contract.service;

import br.com.eaugusto.contract.dao.IContractDAO;

/**
 * Service layer for contract-related business logic.
 * <p>
 * Delegates all operations to an injected {@link IContractDAO} implementation.
 * </p>
 * 
 * <p>
 * Returns string responses for testing and feedback purposes.
 * </p>
 * 
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 20, 2025
 */
public class ContractService implements IContractService {

	private IContractDAO contractDAO;

	/**
	 * Constructs the service with a specific DAO implementation.
	 *
	 * @param contractDAO the contract DAO to use
	 */
	public ContractService(IContractDAO contractDAO) {
		this.contractDAO = contractDAO;
	}

	@Override
	public String save() {
		contractDAO.save();
		return "Success";
	}

	@Override
	public String delete(String id) {
		contractDAO.delete(id);
		return "Deleted";
	}

	@Override
	public String edit(String id, String newData) {
		contractDAO.edit(id, newData);
		return "Edited";
	}

	@Override
	public String search(String id) {
		String result = contractDAO.search(id);
		return result != null ? result : "Not Found";
	}
}
