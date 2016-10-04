package it.uniroma3.icr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.icr.dao.impl.SymbolDaoImpl;
import it.uniroma3.icr.model.Symbol;

@Service
public class SymbolFacade {
	
	@Autowired
	private SymbolDaoImpl symbolDaoImpl;
	
	public Symbol retriveSymbol(long id) {
		return this.symbolDaoImpl.findSymbol(id);
		
	}
	
	public List<Symbol> retriveAllSymbols() {
		return this.symbolDaoImpl.findAll();
	}
	
	public void insertSymbol(Symbol symbol) {
		symbolDaoImpl.insertSymbol(symbol);
	}
	
	

}
