package it.generationitaly.concessionaria.modello;

import java.util.ArrayList;

public class Proprietario {
	private int id;
	private String codiceFiscale;
	private String nome;
	private String cognome;
	private ArrayList<Automobile> automobili = new ArrayList<Automobile>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public ArrayList<Automobile> getAutomobili() {
		return automobili;
	}

	public void setAutomobili(ArrayList<Automobile> automobili) {
		this.automobili = automobili;
	}

	@Override
	public String toString() {
		return "Proprietario [id=" + id + ", codiceFiscale=" + codiceFiscale + ", nome=" + nome + ", cognome=" + cognome
				+ "]";
	}

}