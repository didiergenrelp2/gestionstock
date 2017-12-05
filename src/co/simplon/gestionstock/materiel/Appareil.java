package co.simplon.gestionstock.materiel;

public class Appareil extends Materiel {

	private int codeParc;

	public Appareil(String domaine, String type, String etat, String nom, double prix, int codeParc) {
		super(domaine, type, etat, nom, prix);
		this.codeParc = codeParc;
	}

	public Appareil(String domaine, String type, String etat, String nom, double prix) {
		super(domaine, type, etat, nom, prix);
	}

	public enum TypeAppareil{
		Imprimante,
		Routeur,
		Camera,
		CompteuseBillets,
		
	}
	
	public int getCodeParc() {
		return codeParc;
	}

	public void setCodeParc(int codeParc) {
		this.codeParc = codeParc;
	}

}
