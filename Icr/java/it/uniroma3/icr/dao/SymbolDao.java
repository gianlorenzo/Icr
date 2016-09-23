package it.uniroma3.icr.dao;

import java.util.List;

import it.uniroma3.icr.model.Symbol;

public interface SymbolDao {
	public Symbol findSymbol(long id);
	public List<Symbol> findAll();

}
