package controleur;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import personnages.Gaulois;
import villagegaulois.Village;

class ControlLibererEtalTest {
	private Village village;
	private Chef abraracourcix;
	
	@BeforeEach
	public void initialiserSituation() {
		System.out.println("Initialisation...");
		village = new Village("le village des irréductibles", 10, 5);
		abraracourcix = new Chef("Abraracourcix", 10, village);
		village.setChef(abraracourcix);		
	}


	@Test
	void testControlLibererEtal() {
		ControlTrouverEtalVendeur controlTrouverEtalVendeur = new ControlTrouverEtalVendeur(village);
		ControlLibererEtal controlLibererEtal = new ControlLibererEtal(controlTrouverEtalVendeur);
		assertNotNull(controlLibererEtal);
	}

	@Test
	void testIsVendeur() {
		ControlTrouverEtalVendeur controlTrouverEtalVendeur = new ControlTrouverEtalVendeur(village);
		ControlLibererEtal controlLibererEtal = new ControlLibererEtal(controlTrouverEtalVendeur);
		String vendeur = "Bonemine";
		Gaulois bonemine = new Gaulois(vendeur, 3);
		village.ajouterHabitant(bonemine);
		village.installerVendeur(bonemine, "fleurs", 10);
		assertTrue(controlLibererEtal.isVendeur(vendeur));
		assertFalse(controlLibererEtal.isVendeur("Personne"));
	}

	@Test
	void testLibererEtal() {
		ControlTrouverEtalVendeur controlTrouverEtalVendeur = new ControlTrouverEtalVendeur(village);
		ControlLibererEtal controlLibererEtal = new ControlLibererEtal(controlTrouverEtalVendeur);
		String vendeur = "Bonemine";
		Gaulois bonemine = new Gaulois(vendeur, 3);
		village.ajouterHabitant(bonemine);
		village.installerVendeur(bonemine, "fleurs", 10);
		String[] donneesAttendues = new String[5];
		donneesAttendues[0] = "true";
		donneesAttendues[1] = "Bonemine";
		donneesAttendues[2] = "fleurs";
		donneesAttendues[3] = "10";
		donneesAttendues[4] = "0";
		String[] donneesEtal;
		assertNotNull(donneesEtal = controlLibererEtal.libererEtal(vendeur));
		assertArrayEquals(donneesAttendues, donneesEtal);
		donneesEtal = controlLibererEtal.libererEtal("Personne");
		donneesAttendues [0] = "false";
		donneesAttendues [1] = "Personne";
		donneesAttendues [2] = null;
		donneesAttendues [3] = null;
		donneesAttendues [4] = null;
		assertArrayEquals(donneesAttendues, donneesEtal);
		//assertNull(village.rechercherEtal(bonemine));
	}

}
