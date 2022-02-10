package zooKeeper;

public class Mammal {
	
	private String name;
	private int energyLevel;
	
	
	
	//  ###################### Constructors ################### 
	public Mammal() {
		this.setName("mammal");
		this.setEnergyLevel(100);
		
	}
	
	public Mammal(int energy) {
		this.energyLevel = energy;
	}
	
	
	
	/// ###################### Methods ########################
	
	public int displayEnergy() {
		 System.out.println("Enegry Level is: " + this.getEnergyLevel());
		 return this.getEnergyLevel();
		
	}
	
	
	// ################ Getters and Setters ####################
	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	
}
