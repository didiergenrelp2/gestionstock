package co.simplon.gestionstock.materiel;

public class Piece extends Materiel {

	public Piece(String domaine, String type, String etat, String nom, double prix) {
		super(domaine, type, etat, nom, prix);
		// TODO Auto-generated constructor stub
	}
	public enum TypePiece {
		CableReseau,
		Souris,
		Adaptateur,
		BoutonAlarme;
	}
}
