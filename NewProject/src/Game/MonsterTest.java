package Game;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MonsterTest {

	Monster mon = new Monster(); 
	
	@Test
	void testGetMaxStrengthStrong() {
		assertEquals(200, mon.getMaxStrength());
		int[] expected= {200,0}; 
		int[] actual = {mon.getMaxStrength(), mon.getskill()};
		assertArrayEquals(expected, actual);
	}
	@Test 
	void testGetMaxStrengthWeak() {
		mon = new Monster(); 
		mon.getDownEnergy();
		int[] expected = {50, 0};
		int[] actual = {mon.getMaxStrength(), mon.getskill()};
		assertArrayEquals(expected, actual);
	}
	
	
	
}