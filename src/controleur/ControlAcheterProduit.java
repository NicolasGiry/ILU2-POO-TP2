package controleur;

import personnages.Gaulois;
import villagegaulois.Etal;
import villagegaulois.Village;

public class ControlAcheterProduit {
	private Village village;
	private ControlTrouverEtalVendeur controlTrouverEtalVendeur;
	private ControlVerifierIdentite controlVerifierIdentite;

	public ControlAcheterProduit(ControlVerifierIdentite controlVerifierIdentite,
			ControlTrouverEtalVendeur controlTrouverEtalVendeur,
			Village village) {
		this.village = village;
		this.controlVerifierIdentite = controlVerifierIdentite;
		this.controlTrouverEtalVendeur = controlTrouverEtalVendeur;
	}
	
	public Gaulois[] getVendeursProduit(String produit) {
		return village.rechercherVendeursProduit(produit);
	}

	public int acheterProduit(String vendeur, int quantite) {
		Etal etal = village.rechercherEtal(village.trouverHabitant(vendeur));
		return etal.acheterProduit(quantite);
	}
}
