package br.com.eaugusto.contract.dao;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 20, 2025
 */
public class ContractDAOMock implements IContractDAO {

	private Map<String, String> database = new HashMap<>();

	@Override
	public void save() {
		database.put("1", "Mock Contract");
	}

	@Override
	public void delete(String id) {
		database.remove(id);
	}

	@Override
	public void edit(String id, String newData) {
		database.put(id, newData);
	}

	@Override
	public String search(String id) {
		return database.get(id);
	}
}
