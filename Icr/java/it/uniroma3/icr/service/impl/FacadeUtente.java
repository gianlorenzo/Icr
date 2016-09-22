package it.uniroma3.icr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.icr.dao.impl.UtenteDaoImpl;
import it.uniroma3.icr.model.Utente;

@Service
public class FacadeUtente {
	@Autowired
	private UtenteDaoImpl utendeDaoImpl;
	public void addUtente(Utente utente) {
		utendeDaoImpl.insertUtente(utente);
	}
	public Utente retrieveUtente(String nickname) {
		return this.utendeDaoImpl.findUtente(nickname);
	}
}
