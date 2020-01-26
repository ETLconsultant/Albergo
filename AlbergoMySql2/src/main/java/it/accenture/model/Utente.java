package it.accenture.model;

import java.io.Serializable;

public class Utente implements Serializable {

	private int idUtente;
	private String nome;
	private String username;
	private String password;

	public int getId() {
		return idUtente;
	}

	public void setId(int idUtente) {
		this.idUtente = idUtente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Utente [idUtente=" + idUtente + ", nome=" + nome + ", username=" + username + ", password=" + password + "]";
	}

}
