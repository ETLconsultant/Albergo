package it.accenture.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import exceptions.ConnessioneException;
import it.accenture.dao.PrenotazioneDaoImpl;
import it.accenture.model.Prenotazione;
import it.accenture.model.Utente;

@WebServlet("/listaPrenotazioni")
public class ListaPrenotazioni extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	
  }
	
}
