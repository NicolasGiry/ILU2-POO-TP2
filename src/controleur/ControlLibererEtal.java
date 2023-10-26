package controleur;

import villagegaulois.Etal;

public class ControlLibererEtal {
	private ControlTrouverEtalVendeur controlTrouverEtalVendeur;

	public ControlLibererEtal(
			ControlTrouverEtalVendeur controlTrouverEtalVendeur) {
		this.controlTrouverEtalVendeur = controlTrouverEtalVendeur;
	}

	public boolean isVendeur(String nomVendeur) {
		return controlTrouverEtalVendeur.trouverEtalVendeur(nomVendeur)!=null;
	}

	/**
	 * 
	 * @param produit
	 * @return donneesVente est un tableau de chaine contenant [0] : un boolean
	 *         indiquant si l'étal est occupé [1] : nom du vendeur [2] : produit
	 *         vendu [3] : quantité de produit à vendre au début du marché [4] :
	 *         quantité de produit vendu
	 */
	public String[] libererEtal(String nomVendeur) {
		String[] donneesEtal = new String[5];
		Etal etal = controlTrouverEtalVendeur.trouverEtalVendeur(nomVendeur);
		donneesEtal[1] = nomVendeur;
		if (etal==null) {
			donneesEtal[0] = "false";
		} else {
			donneesEtal[0] = "true";
			donneesEtal[2] = etal.getProduit();
			String[] donneesVente = etal.etatEtal();
			donneesEtal[3] = donneesVente[3];
			donneesEtal[4] = donneesVente[4];
		}
		return donneesEtal;
	}

}
