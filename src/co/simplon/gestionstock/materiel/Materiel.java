package co.simplon.gestionstock.materiel;

public class Materiel {
	private String domaine;
	private String type;
	private String etat;
	private String nom;
	private int quantité;
	private double prix;

	public Materiel(String domaine, String type, String etat, String nom, double prix) {
		super();
		this.domaine = domaine;
		this.type = type;
		this.etat = etat;
		this.nom = nom;
		this.prix = prix;
	}
	public Materiel(String domaine, String type, String nom) {
		super();
		this.domaine = domaine;
		this.type = type;
		this.etat = etat;
		this.nom = nom;
		this.prix = prix;
	}
	// Enumeration
	public enum Etat{
		EnStock,
		EnCommande,
		SurSite,
		Reserved;
	}
	
	public enum Domaine {
		Informatique,
		Reseau,
		Automate,
		Alarme;
	}

	public String getDomaine() {
		return domaine;
	}

	public void setDomaine(String domaine) {
		this.domaine = domaine;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getQuantité() {
		return quantité;
	}

	public void setQuantité(int quantité) {
		this.quantité = quantité;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
}
