package Game;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class MonsterTest {

	Monster mon = new Monster(0, null, 0); 
	gamePlayer gp = new gamePlayer(0, null, 0);
	
	@Test
	void testGetMaxStrengthStrong() {
		assertEquals(200, mon.getMaxStrength());
		int[] expected= {200,0}; 
		int[] actual = {mon.getMaxStrength(), mon.getskill()};
		assertArrayEquals(expected, actual);
	}
	@Test 
	void testGetMaxStrengthWeak() {
		mon = new Monster(0, null, 0); 
		mon.getDownEnergy();
		int[] expected = {50, 0};
		int[] actual = {mon.getMaxStrength(), mon.getskill()};
		assertArrayEquals(expected, actual);
	}
	
@Test		
  void gettAttack() {
		
            mon.increaseSkill();
			mon.getAttack();
			gp[]expected = {mon,gp};
			assertArrayEquals(expected, mon.getAttack());
		}
@Test
void getWinn() {
			
}

}		
