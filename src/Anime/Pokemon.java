package Anime;

public class Pokemon {
	
	public String electricPokemon;
	public int numberInParty;

	public void grass() {
		System.out.println("I choose Bulbasaur");
	}
	
	public void fire() {
		System.out.println("I choose Charmander");
	}
	
	public void water() {
		System.out.println("I choose Squirtle");
	}
	
	public Pokemon() {}
	public Pokemon(String electricPokemon) {
		this.electricPokemon = electricPokemon;
	}
}
