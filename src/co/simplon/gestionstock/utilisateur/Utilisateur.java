package co.simplon.gestionstock.utilisateur;

import java.util.ArrayList;

public class Utilisateur {
	private String nom;
	private String prenom;
	private String fonction;
	// private ArrayList<String> listeUtilisateur = new ArrayList<String>();

	public Utilisateur(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	public Utilisateur(String nom, String prenom, String fonction) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.fonction = fonction;
	}


	public void connecter(String nom, String prenom, String fonction) {
		System.out.println("Connection de " + this.nom + " " + this.prenom + " en tant que " + this.fonction);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	// public ArrayList<String> getListeUtilisateur() {
	// return listeUtilisateur;
	// }
	//
	// public void setListeUtilisateur(ArrayList<String> listeUtilisateur) {
	// listeUtilisateur = listeUtilisateur;
	// }
}
