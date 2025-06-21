package br.com.eaugusto.mocks.service;

import br.com.eaugusto.mocks.dao.IClientDAO;

/**
 * Service layer that handles client operations.
 * <p>
 * Relies on an injected {@link IClientDAO} to persist clients.
 * </p>
 * 
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 20, 2025
 */
public class ClientService {

	private IClientDAO clientDAO;

	/**
	 * Constructs a new service with the provided DAO.
	 *
	 * @param clientDAO the client DAO to be used
	 */
	public ClientService(IClientDAO clientDAO) {
		this.clientDAO = clientDAO;
	}

	/**
	 * Saves a client using the configured DAO.
	 *
	 * @return a success message
	 */
	public String save() {
		clientDAO.save();
		return "Success";
	}
}
