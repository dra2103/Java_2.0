package zooKeeper;

public class Gorilla extends Mammal {
	
	// constructor
	public Gorilla() {
		
	}
	
	public Gorilla(int energy) {
		super(energy);
	}
	
	
 
	// ############ Methods ##############
	public void throwSomething() {
		this.setEnergyLevel(getEnergyLevel()-5);
		System.out.println("The Gorilla has thrown something:");
		
	}
	
	public void eatBananas() {
		this.setEnergyLevel(getEnergyLevel()+ 10);
		System.out.println("Mmmm goooood:" );
		
	}
	
	public void climb() {
		this.setEnergyLevel(getEnergyLevel()-10);
		System.out.println("Gorilla climbed a tree, now he's tired:");
		
	}
	
}
