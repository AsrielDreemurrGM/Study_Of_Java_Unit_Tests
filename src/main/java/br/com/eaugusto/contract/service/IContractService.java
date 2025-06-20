package br.com.eaugusto.contract.service;

/**
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 20, 2025
 */
public interface IContractService {

	String save();

	String delete(String id);

	String edit(String id, String newData);

	String search(String id);
}
