package br.com.eaugusto.contract.service;

import br.com.eaugusto.contract.dao.IContractDAO;

/**
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 20, 2025
 */
public class ContractService implements IContractService {

	private IContractDAO contractDAO;

	public ContractService(IContractDAO contractDAO) {
		this.contractDAO = contractDAO;
	}

	@Override
	public String save() {
		contractDAO.save();
		return "Success";
	}
}
