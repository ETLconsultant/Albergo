package it.accenture.dao;

import java.util.List;

import it.accenture.model.Stanza;

public interface StanzaDao {

	public List<Stanza> getAll();
	
	public void updateDisponibile(boolean disponibile, int numeroStanza);
	
	public Stanza getStanzaById(int numeroStanza);
	
	public void close();
	
	
}
