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
		service.save(); // will throw
	}

	@Test
	public void deleteTest() {
		IContractDAO dao = new ContractDAOMock();
		IContractService service = new ContractService(dao);
		service.save(); // adds mock entry
		String result = service.delete("1");
		Assert.assertEquals("Deleted", result);
	}

	@Test
	public void editTest() {
		IContractDAO dao = new ContractDAOMock();
		IContractService service = new ContractService(dao);
		service.save(); // adds "Mock Contract"
		String result = service.edit("1", "Updated Contract");
		Assert.assertEquals("Edited", result);
	}

	@Test
	public void searchTest() {
		IContractDAO dao = new ContractDAOMock();
		IContractService service = new ContractService(dao);
		service.save(); // adds "Mock Contract"
		String result = service.search("1");
		Assert.assertEquals("Mock Contract", result);
	}
}
