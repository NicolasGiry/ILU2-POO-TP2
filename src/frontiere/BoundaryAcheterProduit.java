package frontiere;

import java.util.Scanner;

import controleur.ControlAcheterProduit;

public class BoundaryAcheterProduit {
	private Scanner scan = new Scanner(System.in);
	private ControlAcheterProduit controlAcheterProduit;

	public BoundaryAcheterProduit(ControlAcheterProduit controlAcheterProduit) {
		this.controlAcheterProduit = controlAcheterProduit;
	}

	public void acheterProduit(String nomAcheteur) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quel produit voulez-vous acheter .");
		String produit = scanner.next();
		String vendeurs[] = controlAcheterProduit.getVendeursProduit("produit");
		if (vendeurs.length == 0) {
			System.out.println("Désolé, personne ne vend ce produit au marché");
		} else {
			System.out.println("Chez quel commerçant souhaitez-vous acheter des fleurs ?");
			for (int i=0; i< vendeurs.length; i++) {
				System.out.println(i+1+" - "+vendeurs[i]);
			}
			int vendeur = scanner.nextInt() - 1;
			System.out.println(nomAcheteur+" se déplace jusqu'à l'étal du vendeur "+vendeurs[vendeur]);
			System.out.println("Bonjour "+nomAcheteur+".\nCombien de "+produit+" voulez-vous acheter ?");
			int quantite = scanner.nextInt();
			System.out.println(controlAcheterProduit.acheter(vendeurs[vendeur], produit, quantite));
			
		}
		
		
	}
}
