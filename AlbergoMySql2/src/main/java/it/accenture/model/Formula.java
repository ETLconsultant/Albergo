package it.accenture.model;

public enum Formula {

	BB(0), 
	MEZZA_PENSIONE(20), 
	PENSIONE_COMPLETA(40);

	private int percentualeIncrementoPrezzo;

	private Formula(int percentualeIncrementoPrezzo) {
		this.percentualeIncrementoPrezzo = percentualeIncrementoPrezzo;
	}

	public int getPercentualeIncrementoPrezzo() {
		return percentualeIncrementoPrezzo;
	}

	public void setPercentualeIncrementoPrezzo(int percentualeIncrementoPrezzo) {
		this.percentualeIncrementoPrezzo = percentualeIncrementoPrezzo;
	}

}
