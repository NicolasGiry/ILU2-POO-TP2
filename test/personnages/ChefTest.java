package personnages;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import villagegaulois.Village;

class ChefTest {
	private Village village;
	
	@BeforeEach
	public void initialiserSituation() {
		System.out.println("Initialisation...");
		village = new Village("le village des irréductibles", 10, 2);
	}

	@Test
	void testParler() {
		Chef abraracourcix = new Chef("Abraracourcix", 10, village);
		abraracourcix.parler("Test");
	}

	@Test
	void testPrendreParole() {
		Chef abraracourcix = new Chef("Abraracourcix", 10, village);
		assertEquals("Le chef Abraracourcix du village le village des irréductibles : ", abraracourcix.prendreParole());
	}

	@Test
	void testChef() {
		Chef abraracourcix = new Chef("Abraracourcix", 10, village);
		assertNotNull(abraracourcix);
	}

}
