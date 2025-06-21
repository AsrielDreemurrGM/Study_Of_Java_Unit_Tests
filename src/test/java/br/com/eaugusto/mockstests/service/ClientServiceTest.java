package br.com.eaugusto.mockstests.service;

import org.junit.Assert;
import org.junit.Test;

import br.com.eaugusto.mocks.dao.ClientDAO;
import br.com.eaugusto.mocks.dao.ClientDAOMock;
import br.com.eaugusto.mocks.dao.IClientDAO;
import br.com.eaugusto.mocks.service.ClientService;

/**
 * Unit tests for the {@link ClientService} class.
 * <p>
 * Verifies the behavior of the service with both mock and real DAO
 * implementations.
 * </p>
 * 
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 20, 2025
 */
public class ClientServiceTest {

	/**
	 * Tests saving with a working mock DAO.
	 */
	@Test
	public void saveTest() {
		ClientDAOMock mockDAO = new ClientDAOMock();
		ClientService service = new ClientService(mockDAO);
		String result = service.save();

		Assert.assertEquals("Success", result);
	}

	/**
	 * Expects an exception when using a real DAO that is not implemented.
	 */
	@Test(expected = UnsupportedOperationException.class)
	public void errorSavingTest() {
		IClientDAO dao = new ClientDAO();
		ClientService service = new ClientService(dao);
		String result = service.save();

		Assert.assertEquals("Success", result); // Unreachable due to exception
	}
}
