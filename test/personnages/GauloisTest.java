package personnages;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GauloisTest {
	
	Gaulois asterix;
	
	@BeforeEach
	public void initialiserSituation() {
		System.out.println("Initialisation...");
		asterix = new Gaulois("Astérix", 10);
	}

	@Test
	void testToString() {
		assertEquals("Gaulois [nom=Astérix, force=10, effetPotion=1]", asterix.toString());
	}

	@Test
	void testPrendreParole() {
		assertEquals("Le gaulois Astérix : ", asterix.prendreParole());
	}

	@Test
	void testGaulois() {
		assertNotNull(asterix);
	}

	@Test
	void testBoirePotion() {
		asterix.boirePotion(2);
	}

}
