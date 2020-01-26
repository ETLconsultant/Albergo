package it.accenture.model;

import java.time.LocalDate;

public class Periodo {

	private LocalDate dataInizio;
	private LocalDate dataFine;

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

	@Override
	public String toString() {
		return "Periodo [dataInizio=" + dataInizio + ", dataFine=" + dataFine + "]";
	}

}
