package co.simplon.gestionstock.utilisateur;

import java.util.Scanner;
import java.io.Serializable;

/**
 * Affichage des differents menus
 * 
 * @author Utilisateur
 *
 */
public class Menu {

	private Scanner scCodeParc;
	private Scanner scMenu;

	public Menu() {
		super();

		this.scCodeParc = new Scanner(System.in);
		this.scMenu = new Scanner(System.in);
	}

	public void afficherMenuMagasinier() {
		Menu choixMenu = new Menu();
		System.out.println("** MENU MAGASINIER **");
		System.out.println("1 - Historique");
		System.out.println("2 - Mettre en stock");
		System.out.println("3 - Envoyer en réparation");
		System.out.println("4 - Ajouter au Stock");
		System.out.println("5 - Supprimer du stock");

		System.out.println("Entrez votre choix.");
		Scanner scMenu = new Scanner(System.in);
		String choix = scMenu.nextLine();
		switch (choix) {
		case "1":
			choixMenu.afficherHistorique();
			break;
		case "2":
			choixMenu.mettreEnStock();
			break;
		case "3":
			choixMenu.envoyerEnReparation();
			break;
		case "4":
			choixMenu.ajouter();
			break;
		case "5":
			choixMenu.supprimer();
			break;

		default:
			System.out.println("Choix invalide.");
		}
	}

	public void afficherMenuChefDeProjet() {
		System.out.println("** MENU CHEF DE PROJET **");
		System.out.println("1 - Historique");
		System.out.println("2 - Reserver");
		System.out.println("3 - Commander");
		Menu choixMenu = new Menu();
		String choix = null;

		while (choix == null) {
			System.out.println("\nEntrez votre choix.");
			choix = scMenu.nextLine();
			switch (choix) {
			case "1":
				choixMenu.afficherHistorique();
				break;
			case "2":
				choixMenu.reserver();
				break;
			case "3":
				choixMenu.commander();
				break;

			default:
				System.out.println("Choix invalide.");
				choix = null;
			}
		}
	}

	public void afficherMenuTechnicien() {
		System.out.println("\n** MENU TECHNICIEN **");
		System.out.println("1 - Mettre en stock");
		System.out.println("2 - Poser dans un bureau");

		Menu choixMenu = new Menu();
		String choix = null;

		while (choix == null) {
			System.out.println("\nEntrez votre choix.");
			choix = scMenu.nextLine();
			switch (choix) {
			case "1":
				choixMenu.mettreEnStock();
				break;
			case "2":
				choixMenu.poserDansBureau();
				break;

			default:
				System.out.println("Choix invalide.");
				choix = null;
			}
		}
	}

	public void afficherHistorique() {
		System.out.println("\n** Historique **");
		System.out.println("Entrer code parc");
		String histo = scCodeParc.nextLine();
		System.out.println("Code parc : " + histo);

	}

	public void ajouter() {
		String enAjout = null;
		while (enAjout == null) {
			System.out.println("\n** Ajout de matériel dans le stock **");
			System.out.println("Entrer code parc ou code article");
			enAjout = scCodeParc.nextLine();
			// si code article demander quantité et créer variable de saisie
//			if (enAjout.equals("^[A-Z]{1}[0-9]{5}$"))// regex a vérifier et voir si il faut mettre un .equals
//				System.out.println("Code parc : " + enAjout);
//			else if (enAjout.equals("[0-9]{6}"))
//				System.out.println("Code article : " + enAjout);
//			else {
//				System.out.println("le regex n'a pas marché :(");
//				enAjout = null;
//			}
		}
		Sauvegarde save = new Sauvegarde();
		enAjout =save.code;
		save.sauvegarde(enAjout);
	}

	public void supprimer() {
		System.out.println("\n** Suppression de matériel du stock **");
		System.out.println("Entrer code parc");
		String enSuppression = scCodeParc.nextLine();
		//TODO vérifier si code parc existe
		System.out.println("Code parc : " + enSuppression);
	}

	public void mettreEnStock() {
		System.out.println("\n** Mise en stock **");
		System.out.println("Entrer code parc ou code article");
		// si code article demander quantité
		String enStock = scCodeParc.nextLine();
		System.out.println("Code parc : " + enStock);

	}

	public void envoyerEnReparation() {
		System.out.println("\n** Envoi en réparation **");
		System.out.println("Entrer code parc");
		String enRep = scCodeParc.nextLine();
		System.out.println("Code parc : " + enRep);
	}

	public void commander() {
		System.out.println("\n** Commande **");
		System.out.println("Entrer code parc ou code article");
		// si code article demander quantité
		String enCommande = scCodeParc.nextLine();
		System.out.println("Code parc : " + enCommande);
	}

	public void reserver() {
		System.out.println("\n** Réserver matériel **");
		System.out.println("Entrer code parc ou code article");
		// si code article demander quantité
		String enReserve = scCodeParc.nextLine();
		System.out.println("Code parc : " + enReserve);
	}

	public void poserDansBureau() {
		System.out.println("\n** Pose de matériel en bureau **");
		System.out.println("Entrer code parc ou code article");
		// si code article demander quantité
		String enPose = scCodeParc.nextLine();
		System.out.println("Code parc : " + enPose);
	}
}
