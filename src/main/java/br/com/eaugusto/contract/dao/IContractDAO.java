package br.com.eaugusto.contract.dao;

/**
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 20, 2025
 */

public interface IContractDAO {

	void save();

	void delete(String id);

	void edit(String id, String newData);

	String search(String id);
}
