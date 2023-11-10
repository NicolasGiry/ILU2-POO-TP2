package villagegaulois;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import personnages.Gaulois;

class VillageTest {
	
	Village village;
	
	@BeforeEach
	public void initialiserSituation() {
		System.out.println("Initialisation...");
		village = new Village("Village", 10, 5);
	}

	@Test
	void testVillage() {
		assertNotNull(village);
	}

	@Test
	void testGetNom() {
		assertEquals("Village", village.getNom());
	}

	@Test
	void testSetChef() {
		Chef abraracourcix = new Chef("Abraracourcix", 10, village);
		village.setChef(abraracourcix);
	}

	@Test
	void testAjouterHabitant() {
		Village petitVillage = new Village("petitVillage", 1, 1);
		Gaulois asterix = new Gaulois("Astérix", 10);
		petitVillage.ajouterHabitant(asterix);
		
		// plus de place dans le village
		Gaulois obelix = new Gaulois("Obélix", 10);
		petitVillage.ajouterHabitant(obelix);
	}

	@Test
	void testTrouverHabitant() {
		Gaulois asterix = new Gaulois("Astérix", 10);
		village.ajouterHabitant(asterix);
		
	}

	@Test
	void testDonnerVillageois() {
		fail("Not yet implemented");
	}

	@Test
	void testDonnerNbEtal() {
		fail("Not yet implemented");
	}

	@Test
	void testInstallerVendeur() {
		fail("Not yet implemented");
	}

	@Test
	void testPartirVendeur() {
		fail("Not yet implemented");
	}

	@Test
	void testRechercherEtalVide() {
		fail("Not yet implemented");
	}

	@Test
	void testRechercherVendeursProduit() {
		fail("Not yet implemented");
	}

	@Test
	void testRechercherEtal() {
		fail("Not yet implemented");
	}

	@Test
	void testDonnerEtatMarche() {
		fail("Not yet implemented");
	}

}
