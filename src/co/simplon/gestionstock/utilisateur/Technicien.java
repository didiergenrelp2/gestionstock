package co.simplon.gestionstock.utilisateur;

public class Technicien extends Utilisateur {
	
	private String fonction="Technicien";

	public Technicien(String nom, String prenom) {
		super(nom, prenom);
		fonction = this.fonction;
	}
// Methods : mettre en stock, mettre en bureau

	public void menuTechnicien() {
		System.out.println("** MENU TECHNICIEN **");
		System.out.println("1 - Mettre en stock");
		System.out.println("2 - Poser dans un bureau");
	}
	
	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	
}
