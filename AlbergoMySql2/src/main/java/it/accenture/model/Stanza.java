package it.accenture.model;

public class Stanza {

	private int numeroStanza;
	private TipoStanza tipoStanza;
	private int postiLetto;
	private double prezzoNotte;
	private boolean disponibile;

	public int getNumeroStanza() {
		return numeroStanza;
	}

	public void setNumeroStanza(int numeroStanza) {
		this.numeroStanza = numeroStanza;
	}

	public TipoStanza getTipoStanza() {
		return tipoStanza;
	}

	public void setTipoStanza(TipoStanza tipoStanza) {
		this.tipoStanza = tipoStanza;
	}

	public int getPostiLetto() {
		return postiLetto;
	}

	public void setPostiLetto(int postiLetto) {
		this.postiLetto = postiLetto;
	}

	public double getPrezzoNotte() {
		return prezzoNotte;
	}

	public void setPrezzoNotte(double prezzoNotte) {
		this.prezzoNotte = prezzoNotte;
	}

	public boolean isDisponibile() {
		return disponibile;
	}

	public void setDisponibile(boolean disponibile) {
		this.disponibile = disponibile;
	}

	@Override
	public String toString() {
		return "Stanza [numeroStanza=" + numeroStanza + ", tipoStanza=" + tipoStanza + ", postiLetto=" + postiLetto
				+ ", prezzoNotte=" + prezzoNotte + ", disponibile=" + disponibile + "]";
	}

}
