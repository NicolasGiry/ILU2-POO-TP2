package frontiere;

import java.util.Scanner;

import controleur.ControlAcheterProduit;
import personnages.Gaulois;

public class BoundaryAcheterProduit {
	private Scanner scan = new Scanner(System.in);
	private ControlAcheterProduit controlAcheterProduit;

	public BoundaryAcheterProduit(ControlAcheterProduit controlAcheterProduit) {
		this.controlAcheterProduit = controlAcheterProduit;
	}

	public void acheterProduit(String nomAcheteur) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quel produit voulez-vous acheter ?");
		String produit = scanner.next();
		Gaulois vendeurs[] = controlAcheterProduit.getVendeursProduit(produit);
		if (vendeurs==null) {
			System.out.println("D�sol�, personne ne vend ce produit au march�");
		} else {
			System.out.println("Chez quel commer�ant souhaitez-vous acheter des "+produit+" ?");
			for (int i=0; i< vendeurs.length; i++) {
				System.out.println(i+1+" - "+vendeurs[i].getNom());
			}
			int vendeur = scanner.nextInt() - 1;
			System.out.println(nomAcheteur+" se d�place jusqu'� l'�tal du vendeur "+vendeurs[vendeur].getNom());
			System.out.println("Bonjour "+nomAcheteur+".\nCombien de "+produit+" voulez-vous acheter ?");
			int quantite = scanner.nextInt();
			int quantiteAchetee = controlAcheterProduit.acheterProduit(vendeurs[vendeur].getNom(), quantite);
			if (quantiteAchetee==0) {
				System.out.println(nomAcheteur + " veut acheter " + quantite + " " + produit
						+ ", malheureusement il n’y en a plus !");
			} else if (quantiteAchetee < quantite) {
				System.out.println(nomAcheteur + " veut acheter " + quantite + " " + produit
						+ ", malheureusement " + vendeurs[vendeur].getNom() + " n’en a plus que " + quantiteAchetee +
						". "+nomAcheteur+" achète tout le stock de "+vendeurs[vendeur].getNom()+".");
			} else {
				System.out.println(nomAcheteur + " achète " + quantiteAchetee + " " + produit + " à " + vendeurs[vendeur].getNom());
				
			}
		}		
	}
}
