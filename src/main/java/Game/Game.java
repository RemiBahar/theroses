package Game;

import java.util.concurrent.ThreadLocalRandom;

public class Game {
	
	/* attributes
	// - player x pos
	// - player y pos
	 * - treasure position x
	 * - treasure position y 
	 * - grid size n
	 * - starting pos
	 * - distance from treasure
	 */
	
	public int player_x;
	public int player_y;
	public int treasure_x;
	public int treasure_y;
	public int grid_size;
//	public int startPos;
	public int distTreasure;
	
	
	/*
	// methods
	// - checkIfWin
	 * - calculateDistance
	 * - moveNorth
	 * - moveSouth
	 * - moveEast
	 * - moveWest
	 * - checkBoundary
	 * - generateRandomPosition
	 * - printPlayerPos
	 * 
	 */
	
	
	public Game(int grid_size) {
		this.grid_size = grid_size;
		this.player_x = genRandom(grid_size);
		this.player_y = genRandom(grid_size);
		this.treasure_x = genTreasureCoord(grid_size, player_x);
		this.treasure_y = genTreasureCoord(grid_size, player_y);
		this.calcDistance();
		
	}
	
	public void movePlayer(int direction) {
		
		switch(direction) {
		
		case 1: // North
			if (this.player_y >= this.grid_size - 1) {
				System.out.println("Cannot move out of bounds (north)");
			}
			else {
				this.player_y++;
			}
			break;
			
		case 2: // East
			if (this.player_x >= this.grid_size - 1) {
				System.out.println("Cannot move out of bounds (east)");
			}
			else {
				this.player_x++;
			}
			break;
			
		case 3: // South
			if (this.player_y <= 0) {
				System.out.println("Cannot move out of bounds (south)");
			}
			else {
				this.player_y--;
			}
			break;
			
		case 4: // West
			if (this.player_x <= 0) {
				System.out.println("Cannot move out of bounds (west)");
			}
			else {
				this.player_y--;
			}
			break;
		
		}
		
		this.calcDistance();
	}
	
	public void calcDistance() {
		int dist_x = Math.abs(this.player_x - this.treasure_x);
		int dist_y = Math.abs(this.player_y - this.treasure_y);
		this.distTreasure = dist_x + dist_y; 
	}
	
	public static int genTreasureCoord(int max, int pos) {
		int i_pos = genRandom(max);
		while (i_pos == pos) {
			i_pos = genRandom(max);
		}
		
		return i_pos;
	}
	
	public static int genRandom(int max) {
		
		return ThreadLocalRandom.current().nextInt(0,max);

	}
	
	public boolean checkIfWin() {
		
		return (this.distTreasure == 0);
	}


}
