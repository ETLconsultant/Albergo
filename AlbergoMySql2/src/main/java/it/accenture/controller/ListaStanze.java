package it.accenture.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import exceptions.ConnessioneException;
import it.accenture.dao.PrenotazioneDaoImpl;
import it.accenture.dao.StanzaDaoImpl;
import it.accenture.model.Periodo;
import it.accenture.model.Stanza;

@WebServlet("/listaStanze")
public class ListaStanze extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	
	
	
}
