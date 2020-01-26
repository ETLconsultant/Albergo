package it.accenture.model;

import java.time.LocalDate;

public class Prenotazione {

	private int idPrenotazione;
	private int numeroGiorni;
	private LocalDate dataInizio;
	private LocalDate dataFine;
	private Formula formula;
	private double prezzoTotale;
	// prezzo notte * numero giorni * i posti letto
	// tenendo in considerazione la formula selezionata
	private int idUtente;
	private int numeroStanza;

	
	
	public Prenotazione(int numeroGiorni, LocalDate dataInizio, LocalDate dataFine, Formula formula,
			 int idUtente, int numeroStanza) {
		this.numeroGiorni = numeroGiorni;
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
		this.formula = formula;
		this.idUtente = idUtente;
		this.numeroStanza = numeroStanza;
	}
	
	public Prenotazione() {
		
	}

	public int getIdPrenotazione() {
		return idPrenotazione;
	}

	public void setIdPrenotazione(int idPrenotazione) {
		this.idPrenotazione = idPrenotazione;
	}

	public int getNumeroGiorni() {
		return numeroGiorni;
	}

	public void setNumeroGiorni(int numeroGiorni) {
		this.numeroGiorni = numeroGiorni;
	}

	public LocalDate getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(LocalDate dataInizio) {
		this.dataInizio = dataInizio;
	}

	public LocalDate getDataFine() {
		return dataFine;
	}

	public void setDataFine(LocalDate dataFine) {
		this.dataFine = dataFine;
	}

	public Formula getFormula() {
		return formula;
	}

	public void setFormula(Formula formula) {
		this.formula = formula;
	}

	public double getPrezzoTotale() {
		return prezzoTotale;
	}

	public void setPrezzoTotale(double prezzoTotale) {
		this.prezzoTotale = prezzoTotale;
	}

	public int getIdUtente() {
		return idUtente;
	}

	public void setIdUtente(int idUtente) {
		this.idUtente = idUtente;
	}

	public int getNumeroStanza() {
		return numeroStanza;
	}

	public void setNumeroStanza(int numeroStanza) {
		this.numeroStanza = numeroStanza;
	}

	@Override
	public String toString() {
		return "Prenotazione [idPrenotazione=" + idPrenotazione + ", numeroGiorni=" + numeroGiorni + ", dataInizio="
				+ dataInizio + ", dataFine=" + dataFine + ", formula=" + formula + ", prezzoTotale=" + prezzoTotale
				+ ", idUtente=" + idUtente + ", numeroStanza=" + numeroStanza + "]";
	}
	
	public void calcolaPrezzo(double prezzoNotte, int postiLetto) {
		double prezzo = numeroGiorni * postiLetto * prezzoNotte;
		prezzo = prezzo *
				(100 + formula.getPercentualeIncrementoPrezzo()) / 100;
		this.prezzoTotale = prezzo;
	}

}
