package frontiere;

import controleur.ControlAfficherMarche;

public class BoundaryAfficherMarche {
	private ControlAfficherMarche controlAfficherMarche;

	public BoundaryAfficherMarche(ControlAfficherMarche controlAfficherMarche) {
		this.controlAfficherMarche = controlAfficherMarche;
	}

	public void afficherMarche(String nomAcheteur) {
		String[] infosMarche = controlAfficherMarche.donnerInfosMarche();
		
		if (infosMarche.length == 0) {
			System.out.println("Le march� est vide, revenez plus tard.");
		} else {
			System.out.println(nomAcheteur+", vous trouverez au march� :");
			for (int i=0; i<infosMarche.length; i++) {
				// vendeur
				System.out.print("-"+infosMarche[i]);
				i++;
				// quantite
				System.out.print(" qui vend "+infosMarche[i]);
				i++;
				// produit
				System.out.println(" "+infosMarche[i]);
			}
		}
	}
}
