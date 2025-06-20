package br.com.eaugusto.mockstests.service;

import org.junit.Assert;
import org.junit.Test;

import br.com.eaugusto.mocks.dao.ClientDAO;
import br.com.eaugusto.mocks.dao.ClientDAOMock;
import br.com.eaugusto.mocks.dao.IClientDAO;
import br.com.eaugusto.mocks.service.ClientService;

/**
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 20, 2025
 */
public class ClientServiceTest {

	@Test
	public void saveTest() {
		ClientDAOMock mockDAO = new ClientDAOMock();
		ClientService service = new ClientService(mockDAO);
		String result = service.save();

		Assert.assertEquals("Success", result);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void errorSavingTest() {
		IClientDAO dao = new ClientDAO();
		ClientService service = new ClientService(dao);
		String result = service.save();

		Assert.assertEquals("Success", result);
	}
}
