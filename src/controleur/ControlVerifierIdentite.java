package controleur;

import java.util.Objects;
import villagegaulois.Village;

public class ControlVerifierIdentite {
	private Village village;

	public ControlVerifierIdentite(Village village) {
		this.village = village;
	}

	public boolean verifierIdentite(String nomVendeur) {
		String gaulois = null;
		village.trouverHabitant(nomVendeur);
		if (Objects.equals(nomVendeur, village.donnerVillageois()[0])) {
			gaulois = "chef";
		} else {
			for (int i=0; i<village.donnerVillageois().length; i++) {
				if (Objects.equals(nomVendeur, village.donnerVillageois()[i])) {
					gaulois = "habitant";
				}
			}
		}
		return gaulois != null;
	}
}
