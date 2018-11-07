package Game;

public class Monster extends gamePlayer {
	
	public Monster(int strength, String name, int skill) {
		super(strength, name, skill);
		
	}

	private Energy eng ;
	private String name;
	private int item;
	private int attack;
	public void Monster(Energy eng,String name,int item) {
		
		this.eng = eng;
		this. name = name;
        this.item = item;
}
	
	public int getMaxStrength() {
		if(eng == Energy.STRONG) {
			return getStrength()*3 + getskill();
		}else if(eng == Energy.WEAK){
			return getStrength()*2+ getskill();
		}
		else {
			 return getStrength()+ getskill();		}
		
		
		} 
	
	public int getAttack() {
		return attack;
	}

		public void increaseSkill() {
			
			
		}

		public void getWinner() {
						
		}
}


