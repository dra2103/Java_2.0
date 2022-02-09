package zooKeeper;

public class TestMammal {

	public static void main(String[] args) {
		Gorilla gorilla1 = new Gorilla();
		 gorilla1.displayEnergy();
		 gorilla1.throwSomething();
		 gorilla1.throwSomething();
		 gorilla1.throwSomething();
		 gorilla1.eatBananas();
		 gorilla1.eatBananas();
		 gorilla1.climb();
		 System.out.println(gorilla1.displayEnergy());
		 
		 
		 Bat bat1 = new Bat();
		 
		 bat1.displayEnergy();
		 bat1.attackTown();
		 bat1.attackTown();
		 bat1.attackTown();
		 bat1.eatHuman();
		 bat1.eatHuman();
		 bat1.fly();
		 bat1.fly();
		 bat1.displayEnergy();
	}

}
