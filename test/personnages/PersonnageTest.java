package personnages;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class PersonnageTest {
	

	@Test
	void testPersonnage() {
		Personnage personnage = new Personnage("Personnage", 1);
		assertNotNull(personnage);		
		assertThrows(AssertionError.class, () -> { 
			Personnage p = new Personnage("Personnage2", -1); 
		});
	}

	@Test
	void testGetForce() {
		Personnage personnage = new Personnage("Personnage", 1);
		assertEquals(1, personnage.getForce());
	}

	@Test
	void testGetNom() {
		Personnage personnage = new Personnage("Personnage", 1);
		assertEquals("Personnage", personnage.getNom());
	}

	@Test
	void testToString() {
		Personnage personnage = new Personnage("Personnage", 1);
		assertEquals("[nom=Personnage, force=1]", personnage.toString());
	}

	@Test
	void testParler() {
		Personnage personnage = new Personnage("Personnage", 1);
		personnage.parler("Test");
	}

	@Test
	void testPrendreParole() {
		Personnage personnage = new Personnage("Personnage", 1);
		assertEquals("Personnage : ", personnage.prendreParole());
	}

}
