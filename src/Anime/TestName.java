package Anime;

public class TestName {

	public static void main(String[] args) {
		Pokemon starter = new Pokemon();
		
		starter.fire();
		starter.grass();
		starter.water();
		
		Pokemon yellow = new Pokemon("Pikachu");
		System.out.println(yellow.electricPokemon);
		
		System.out.println();
		
		DragonBallZ Goku = new DragonBallZ();
		
		System.out.print("Goku's enemy is: ");
		Goku.enemy();
		System.out.print("His son's name is: ");
		Goku.son();
		System.out.print("His friend is: ");
		Goku.friend();
		
		DragonBallZ numbers = new DragonBallZ(10000, 7);
		System.out.println("Power Level: "+numbers.powerLevel+" Number of Dragon Balls: "+numbers.numberOfDragonBalls);

	}

}
