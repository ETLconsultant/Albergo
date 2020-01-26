package it.accenture.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import exceptions.ConnessioneException;
import it.accenture.model.Stanza;
import it.accenture.model.TipoStanza;



public class StanzaDaoImpl implements StanzaDao {
	
	private Connection connection;
	private Statement statement;
	private PreparedStatement prepared;
	
	public StanzaDaoImpl() throws ConnessioneException {
		connection = SingletonConnection.getInstance();
	}

	@Override
	public List<Stanza> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateDisponibile(boolean disponibile, int numeroStanza) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Stanza getStanzaById(int numeroStanza) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}


	

}
