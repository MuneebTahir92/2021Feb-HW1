package Anime;

public class DragonBallZ {
	
	protected int powerLevel;
	protected int numberOfDragonBalls;

	protected void friend() {
		System.out.println("Krillin");
	}
	
	protected void son() {
		System.out.println("Gohan");
	}
	
	protected void enemy() {
		System.out.println("Frieza");
	}
	
	protected DragonBallZ() {}
	protected DragonBallZ(int powerLevel, int numberOfDragonBalls) {
		this.powerLevel = powerLevel;
		this.numberOfDragonBalls = numberOfDragonBalls;
	}
}
