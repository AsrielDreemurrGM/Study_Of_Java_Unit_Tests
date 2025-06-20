package br.com.eaugusto.contracttests;

import org.junit.Assert;
import org.junit.Test;

import br.com.eaugusto.contract.dao.ContractDAO;
import br.com.eaugusto.contract.dao.ContractDAOMock;
import br.com.eaugusto.contract.dao.IContractDAO;
import br.com.eaugusto.contract.service.ContractService;
import br.com.eaugusto.contract.service.IContractService;

/**
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 20, 2025
 */
public class ContractServiceTest {

	@Test
	public void saveTest() {

		IContractDAO dao = new ContractDAOMock();

		IContractService service = new ContractService(dao);
		String result = service.save();

		Assert.assertEquals("Success", result);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void errorSavingToDatabaseTest() {

		IContractDAO dao = new ContractDAO();

		IContractService service = new ContractService(dao);
		String result = service.save();

		Assert.assertEquals("Success", result);
	}
}
