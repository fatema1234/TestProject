package Game;

public abstract class gamePlayer {

	
		private int strength;  
		private String name;
		private int skill;
		private int DownEnergy;
		private int attack;
		public gamePlayer(int strength,String name,int skill) { 
			 
			strength =0;
			this.name = name;
			skill = 0;
		}
		
			
		public String getName() {
			return name;
		}
		
			
		int getStrength() {
			return strength;
		}
		
	public int getskill() {
		return skill;
	}
		
				
		
		public int getDownEnergy() {
		return DownEnergy; 
	
	}
		public int getAttack() {
			return attack;
		}
}

	
