package co.simplon.gestionstock.utilisateur;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	// private ArrayList<Utilisateur> listeUtilisateur;

	public static void main(String[] args) {
		Main magasin = new Main();
		ArrayList<Utilisateur> listeUtilisateur = magasin.ajouterUtilisateur();

		// Affichages de tous les utilisateurs
		// int i = 0;
		// System.out.println("Liste des utilisateurs :");
		// for (Utilisateur utilisateur : listeUtilisateur) {
		// System.out.println(listeUtilisateur.get(i).getNom() + " " +
		// listeUtilisateur.get(i).getPrenom() + " est "
		// + listeUtilisateur.get(i).getFonction());
		// i++;
		// }

		// Connexion utilisateur

		Utilisateur utilisateur = null;
		while (utilisateur == null) {
			System.out.println("\nEntrez votre nom.");
			Scanner sc = new Scanner(System.in);
			String nom = sc.nextLine();
			System.out.println("Entrez votre prénom.");
			String prenom = sc.nextLine();
			utilisateur = magasin.checkUtilisateur(listeUtilisateur, nom, prenom);
		}

		 if (utilisateur.getFonction().equals("Technicien")) {
			 //appel menuTech
			 Menu menuTech = new Menu();
			 menuTech.afficherMenuTechnicien();
		 }
		 else if (utilisateur.getFonction().equals("Magasinier")){
			 //appel menuMag
			 Menu menuMagasinier = new Menu();
			 menuMagasinier.afficherMenuMagasinier();
		 }
		 else {
			 //appel MenuCdP
			 Menu menuChefProjet = new Menu();
		 menuChefProjet.afficherMenuChefDeProjet();
		 }
	}

	// Methodes

	private ArrayList<Utilisateur> ajouterUtilisateur() {
		ArrayList<Utilisateur> listeUtilisateur = new ArrayList<Utilisateur>();

		Utilisateur bobTech = new Utilisateur("Tech", "Bob", "Technicien");
		listeUtilisateur.add(bobTech);
		Utilisateur cobMag = new Utilisateur("Mag", "Cob", "Magasinier");
		listeUtilisateur.add(cobMag);
		Utilisateur dobProj = new Utilisateur("Proj", "Dob","ChefProjet");
		listeUtilisateur.add(dobProj);

		return listeUtilisateur;

	}

	private Utilisateur checkUtilisateur(ArrayList<Utilisateur> listeUtilisateur, String nom, String prenom) {
		for (Utilisateur utilisateur : listeUtilisateur) {
			if ((nom.equalsIgnoreCase(utilisateur.getNom())) && (prenom.equalsIgnoreCase(utilisateur.getPrenom()))) {
				
				utilisateur.connecter(nom, prenom,utilisateur.getFonction());
				return utilisateur;
			}
		}
		System.out.println("Utilisateur inconnu.");
		return null;
	}

}
