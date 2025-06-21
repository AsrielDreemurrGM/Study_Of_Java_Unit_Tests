package br.com.eaugusto.contracttests;

import org.junit.Assert;
import org.junit.Test;

import br.com.eaugusto.contract.dao.ContractDAO;
import br.com.eaugusto.contract.dao.ContractDAOMock;
import br.com.eaugusto.contract.dao.IContractDAO;
import br.com.eaugusto.contract.service.ContractService;
import br.com.eaugusto.contract.service.IContractService;

/**
 * Unit tests for {@link ContractService} using both real and mock DAOs.
 * <p>
 * Verifies expected behavior of save, delete, edit, and search operations. Also
 * tests fallback error behavior using the unsupported DAO.
 * </p>
 * 
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 20, 2025
 */
public class ContractServiceTests {

	/**
	 * Tests saving a contract using the mock DAO.
	 */
	@Test
	public void saveTest() {
		IContractDAO dao = new ContractDAOMock();
		IContractService service = new ContractService(dao);
		String result = service.save();
		Assert.assertEquals("Success", result);
	}

	/**
	 * Expects an error when trying to save using an unsupported DAO.
	 */
	@Test(expected = UnsupportedOperationException.class)
	public void errorSavingToDatabaseTest() {
		IContractDAO dao = new ContractDAO();
		IContractService service = new ContractService(dao);
		service.save(); // throws exception
	}

	/**
	 * Tests deleting an existing mock contract.
	 */
	@Test
	public void deleteTest() {
		IContractDAO dao = new ContractDAOMock();
		IContractService service = new ContractService(dao);
		service.save();
		String result = service.delete("1");
		Assert.assertEquals("Deleted", result);
	}

	/**
	 * Tests editing a mock contract entry.
	 */
	@Test
	public void editTest() {
		IContractDAO dao = new ContractDAOMock();
		IContractService service = new ContractService(dao);
		service.save();
		String result = service.edit("1", "Updated Contract");
		Assert.assertEquals("Edited", result);
	}

	/**
	 * Tests searching for a mock contract.
	 */
	@Test
	public void searchTest() {
		IContractDAO dao = new ContractDAOMock();
		IContractService service = new ContractService(dao);
		service.save();
		String result = service.search("1");
		Assert.assertEquals("Mock Contract", result);
	}
}
