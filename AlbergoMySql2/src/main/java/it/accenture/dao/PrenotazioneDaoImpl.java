package it.accenture.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import exceptions.ConnessioneException;
import it.accenture.model.Formula;
import it.accenture.model.Periodo;
import it.accenture.model.Prenotazione;
import it.accenture.model.Stanza;


public class PrenotazioneDaoImpl implements PrenotazioneDao {
	
	private Connection connection;
	private PreparedStatement prepared;
	
	public PrenotazioneDaoImpl() throws ConnessioneException {
		connection = SingletonConnection.getInstance();
	}

	@Override
	public void insertPrenotazione(Prenotazione prenotazione) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Prenotazione> getAllByUtente(int idUtente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Periodo> getPeriodiByStanza(int numeroStanza) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean controlloDate(LocalDate dataInizio, LocalDate dataFine, int numeroStanza) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void controlloDisponibilitaQuotidiana(List<Stanza> listaStanze) {
		// TODO Auto-generated method stub
		
	}


}
