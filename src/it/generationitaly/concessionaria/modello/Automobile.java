package it.generationitaly.concessionaria.modello;

public class Automobile {
    
	private String targa;
	private String marca;
	private String modello;
	private int cilindrata;
	private int km;
	private Proprietario proprietario;

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public int getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	@Override
	public String toString() {
		return "Automobile [targa=" + targa + ", marca=" + marca + ", modello=" + modello + ", cilindrata=" + cilindrata
				+ ", km=" + km + "]";
	}

}
