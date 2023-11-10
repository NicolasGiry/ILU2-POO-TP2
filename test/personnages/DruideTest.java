package personnages;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DruideTest {
	
	
	@Test
	void testDruide() {
		Druide druide = new Druide("Druide", 10, 5, 10);
		assertNotNull(druide);
	}

	@Test
	void testPrendreParole() {
		Druide druide = new Druide("Druide", 10, 5, 10);
		assertEquals("Le druide Druide : ", druide.prendreParole());
	}

	@Test
	void testPreparerPotion() {
		Druide druide = new Druide("Druide", 10, 1, 6);
		druide.preparerPotion();
		
		Druide superDruide = new Druide("Druide", 10, 8, 10);
		superDruide.preparerPotion();
	}

	@Test
	void testBooster() {
		Druide druide = new Druide("Druide", 10, 5, 10);
		Gaulois obelix = new Gaulois("Obélix", 20);
		Gaulois asterix = new Gaulois("Asterix", 10);
		
		druide.booster(obelix);
		druide.booster(asterix);
		
	}

}
