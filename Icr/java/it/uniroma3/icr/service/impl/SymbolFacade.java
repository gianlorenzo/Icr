package it.uniroma3.icr.service.impl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.icr.dao.impl.SymbolDaoImpl;
import it.uniroma3.icr.insertImageInDb.InsertSampleInDb;
import it.uniroma3.icr.model.Symbol;

@Service
public class SymbolFacade {
	
	@Autowired
	private SymbolDaoImpl symbolDaoImpl;
	
	@Autowired
	private InsertSampleInDb insertSample;
	
	public Symbol retrieveSymbol(long id) {
		return this.symbolDaoImpl.findSymbol(id);
		
	}
	
	public List<Symbol> retrieveAllSymbols() {
		return this.symbolDaoImpl.findAll();
	}
	
	public void insertSymbol(Symbol symbol) {
		symbolDaoImpl.insertSymbol(symbol);
	}
	
	public void getSampleImage() throws FileNotFoundException, IOException {
		insertSample.getSampleImage();
	}
	
}
