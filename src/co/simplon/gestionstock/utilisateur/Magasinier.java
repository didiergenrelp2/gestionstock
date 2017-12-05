package co.simplon.gestionstock.utilisateur;

import java.util.Scanner;

public class Magasinier extends Utilisateur {

	private final String fonction;

	public Magasinier(String nom, String prenom) {
		super(nom, prenom);
		this.fonction = "Magasinier";
	}

	

	public String getFonction() {
		return fonction;
	}

//	public void setFonction(String fonction) {
//		this.fonction = fonction;
//	}
}
