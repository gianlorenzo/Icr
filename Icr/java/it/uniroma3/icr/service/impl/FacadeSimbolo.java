package it.uniroma3.icr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.icr.dao.impl.SimboloDaoImpl;
import it.uniroma3.icr.model.Simbolo;

@Service
public class FacadeSimbolo {
	
	@Autowired
	private SimboloDaoImpl simboloDaoImpl;
	
	public Simbolo retriveSimdolo(String trascrizione) {
		return this.simboloDaoImpl.findSimbolo(trascrizione);
		
	}
	
	public List<Simbolo> retriveAllSimboli() {
		return this.simboloDaoImpl.findAll();
	}
	
	

}
