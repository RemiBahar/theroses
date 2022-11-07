package Game;

import org.javatuples.Pair;

public class Treasure extends GameEntity {
	// EndGame - True
	// Message - You won
	
	// Constructor
	public Treasure(Pair<Integer, Integer> position){
		super(position, true, "You won!");
	}

}