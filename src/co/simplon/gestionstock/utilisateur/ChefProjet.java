package co.simplon.gestionstock.utilisateur;

public class ChefProjet extends Utilisateur {
	
	private String fonction ="Chef de projets";

	public ChefProjet(String nom, String prenom) {
		super(nom, prenom);
		fonction = this.fonction;
	}
//method : commander / reserver / historique
	
	

	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
}
