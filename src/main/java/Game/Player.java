package Game;

import org.javatuples.Pair;

public class Player extends GameEntity{
	
	private int xPos;
	private int yPos;
	
	// Constructor
	public Player(Pair<Integer, Integer> position){
		super(position, false, null);
		setxPos(this.getxPos());
		setyPos(this.getyPos());
	}

	@Override
	public int getxPos() {
		return xPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	@Override
	public int getyPos() {
		return yPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}

	@Override
	public Pair<Integer, Integer> getPosition(){
		return new Pair<Integer, Integer>(getxPos(), getyPos());
	}

	@Override 
	public boolean equals(Object obj){
		if(obj == null) { 
			return false; 
		}

		if(obj.getClass() != this.getClass()) { 
			return false; 
		}

		return true;
	}

}