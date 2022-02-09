package zooKeeper;

public class Bat extends Mammal {

	
	// constructor
	public Bat() {
		super(300);
	}

	
	//methods
	public void fly() {
		this.setEnergyLevel(getEnergyLevel()-50);
		System.out.println("I think about it every night and day");
	}
	
	public void eatHuman() {
		this.setEnergyLevel(getEnergyLevel()+25);
		System.out.println("I'm feasting");
	}
	
	public void attackTown() {
		this.setEnergyLevel(getEnergyLevel() -100);
		System.out.println("The crys of women and children");
	}
}
