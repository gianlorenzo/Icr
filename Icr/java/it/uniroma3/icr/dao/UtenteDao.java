package it.uniroma3.icr.dao;

import it.uniroma3.icr.model.Utente;

public interface UtenteDao {
	public void insertUtente(Utente utente);
	public Utente findUtente(String username);

}
