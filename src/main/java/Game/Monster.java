package Game;

import org.javatuples.Pair;

public class Monster extends GameEntity{
	// Override variables

	// Constructor
	public Monster(Pair<Integer, Integer> position){
		super(position, true, "You got eaten!");
	}

}