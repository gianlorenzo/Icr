package it.uniroma3.icr.dao;

import java.util.List;

import it.uniroma3.icr.model.Simbolo;

public interface SimboloDao {
	public Simbolo findSimbolo(String trascrizione);
	public List<Simbolo> findAll();

}
