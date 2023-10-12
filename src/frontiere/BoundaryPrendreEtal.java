package frontiere;

import java.util.Scanner;

import controleur.ControlPrendreEtal;

public class BoundaryPrendreEtal {
	private ControlPrendreEtal controlPrendreEtal;
	private Scanner scan = new Scanner(System.in);

	public BoundaryPrendreEtal(ControlPrendreEtal controlChercherEtal) {
		this.controlPrendreEtal = controlChercherEtal;
	}

	public void prendreEtal(String nomVendeur) {
		if (!controlPrendreEtal.verifierIdentite(nomVendeur)) {
			System.out.println("Je suis désolé "+ nomVendeur +" mais il faut être un habitant de notre village pour commercer ici.");
		} else {
			System.out.println("Bonjour "+ nomVendeur +", je vais regarder si je peux vous trouver un étal");
			boolean etalDisponible = controlPrendreEtal.resteEtals();
			if (!etalDisponible) {
				System.out.println("Désolé.e "+ nomVendeur +" je n'ai plus détal qui ne soit pas déjà occupé.");
			} else {
				installerVendeur(nomVendeur);
			}
		}
	}

	private void installerVendeur(String nomVendeur) {
		System.out.println("C'est parfait il me reste un étal pour vous !");
		System.out.println("Il me faudrait quelques renseignements :");
		System.out.println("Quel produit souhaitez-vous vendre ?");
		String produit = scan.next();
		System.out.println("Combien souhaitez-vous en vendre ?");
		int nbProduits = scan.nextInt();
		int numEtal = controlPrendreEtal.prendreEtal(nomVendeur, produit, nbProduits);
		if (numEtal != -1) {
			System.out.println("Le vendeur "+ nomVendeur +" s'est installé à l'étal n°"+ numEtal);
		}
	}
}
