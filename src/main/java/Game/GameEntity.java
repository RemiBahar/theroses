package Game;

import java.util.concurrent.ThreadLocalRandom;

import org.javatuples.Pair;

public abstract class GameEntity {
	// Location - xPos, yPos
	// Message - @Override by subclasses
	// EndGame (Boolean) -> true/false (as an extra). Always end game for now
	
	// Dependencies:
	// 	Runner -> check if GameEntity is in same position as player
	
	// Fields
	private final boolean endGame;
	private final String message;
	private final Pair<Integer, Integer> position;
	
	
	// Constructor
	GameEntity(Pair<Integer, Integer> position, boolean endGame, String message){
		// Generate position
		this.position = position;
		
		this.endGame = endGame;
		
		this.message = message;
	}
	
	public boolean isEndGame() {
		return endGame;
	}

	public String getMessage() {
		return message;
	}

	public Pair<Integer, Integer> getPosition(){
		return this.position;
	}

	public int getxPos() {
		return position.getValue0();
	}

	public int getyPos() {
		return position.getValue1();
	}

	@Override
	public String toString(){
		return "endGame: " + endGame + " "
			+  "position: " + position + " "
			+  "message: " + message + " "
			+  "type: " + this.getClass();
	}

	@Override 
	public boolean equals(Object obj){
		if(obj == null) { 
			return false; 
		}

		if(obj.getClass() != this.getClass()) { 
			return false; 
		}

		GameEntity entity = (GameEntity) obj;

		return entity.message == this.message
			&& entity.endGame == this.endGame
			&& entity.position == this.position;
	}

}