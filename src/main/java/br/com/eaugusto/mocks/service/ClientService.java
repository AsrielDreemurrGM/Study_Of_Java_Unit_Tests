package br.com.eaugusto.mocks.service;

import br.com.eaugusto.mocks.dao.IClientDAO;

/**
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 20, 2025
 */
public class ClientService {

	private IClientDAO clientDAO;

	public ClientService(IClientDAO clientDAO) {
		this.clientDAO = clientDAO;
	}

	public String save() {
		clientDAO.save();
		return "Success";
	}
}
