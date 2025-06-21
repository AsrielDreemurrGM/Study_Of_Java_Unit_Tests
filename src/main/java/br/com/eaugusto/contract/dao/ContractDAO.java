package br.com.eaugusto.contract.dao;

/**
 * Fallback contract DAO implementation that throws errors for all operations.
 * <p>
 * This class is used to simulate a real DAO that is not yet connected to a
 * database. All operations throw {@code UnsupportedOperationException}.
 * </p>
 * 
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 20, 2025
 */
public class ContractDAO implements IContractDAO {

	@Override
	public void save() {
		throw new UnsupportedOperationException("Doesn't work with Database");
	}

	@Override
	public void delete(String id) {
		throw new UnsupportedOperationException("Delete not implemented");
	}

	@Override
	public void edit(String id, String newData) {
		throw new UnsupportedOperationException("Edit not implemented");
	}

	@Override
	public String search(String id) {
		throw new UnsupportedOperationException("Search not implemented");
	}
}
