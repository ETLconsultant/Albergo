package it.accenture.dao;

import java.util.List;

import exceptions.DAOException;
import it.accenture.model.Utente;

public interface UtenteDao {

	public void insertUtente(Utente utente) throws DAOException;
	
	public Utente getByUsernameAndPassword(String username, 
			String password);
	
	public void updateUtente(Utente utente);
	
	public void deleteteUtenteById(int idutente);
	
	public void close();
	
	
	
}