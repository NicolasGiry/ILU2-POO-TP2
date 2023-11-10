package personnages;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GauloisTest {
	
	Gaulois asterix;
	
	@BeforeEach
	public void initialiserSituation() {
		System.out.println("Initialisation...");
		asterix = new Gaulois("Ast�rix", 10);
	}

	@Test
	void testToString() {
		assertEquals("Gaulois [nom=Ast�rix, force=10, effetPotion=1]", asterix.toString());
	}

	@Test
	void testPrendreParole() {
		assertEquals("Le gaulois Ast�rix : ", asterix.prendreParole());
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
