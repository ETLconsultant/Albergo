package it.accenture.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import exceptions.ConnessioneException;
import exceptions.DAOException;
import it.accenture.model.Utente;
import java.sql.ResultSet;

public class UtenteDaoImpl implements UtenteDao {
	
	private Connection connection;
	private PreparedStatement prepared;
	private Statement statement;
	
	public UtenteDaoImpl() throws ConnessioneException {
		connection = SingletonConnection.getInstance();
	}

	@Override
	public void insertUtente(Utente utente) throws DAOException {
		String query = "insert into utente (nome,username,password)"
				+ " values ( ?, ?, ?)";
		try {
			prepared = connection.prepareStatement(query,prepared.RETURN_GENERATED_KEYS);
			prepared.setString(1, utente.getNome());
			prepared.setString(2, utente.getUsername());
			prepared.setString(3, utente.getPassword());
			prepared.executeUpdate();
			ResultSet rs = prepared.getGeneratedKeys();
			if (rs.next()) {
				System.out.println("Auto Generated Primary Key " + rs.getInt(1));
				utente.setId(rs.getInt(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e.getMessage());
				}
			
		
	}

	@Override
	public Utente getByUsernameAndPassword(String username, String password) {
		
		return null;
		
		
	}

	
	

	@Override
	public void updateUtente(Utente utente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteteUtenteById(int idutente) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void close() {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		

     }
		
	}
}	
	
