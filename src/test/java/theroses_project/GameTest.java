package theroses_project;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import Game.Game;

public class GameTest {
    public static Game game;
    
    @BeforeClass
	public static void setUpBeforeClass() throws Exception {
        int gridSize = 20;
        int noOfMonsters = 10;

		game = new Game(gridSize, noOfMonsters);
	}

    @Test
    public void moveNorth() {
        // Move player South by two so they can move North
        game.movePlayer(3);
        game.movePlayer(3);

        // Initial position
        int xInitial = game.p.getxPos();
        int yInitial = game.p.getyPos();

        // Position after moving
		game.movePlayer(1);
        int xAfter = game.p.getxPos();
        int yAfter = game.p.getyPos();

        assertEquals(xInitial, xAfter);
        assertEquals(yInitial + 1, yAfter);
	}

    @Test
    public void moveEast() {
        // Move player South by two so they can move North
        game.movePlayer(4);
        game.movePlayer(4);

        // Initial position
        int xInitial = game.p.getxPos();
        int yInitial = game.p.getyPos();

        // Position after moving
		game.movePlayer(2);
        int xAfter = game.p.getxPos();
        int yAfter = game.p.getyPos();

        assertEquals(xInitial + 1, xAfter);
        assertEquals(yInitial, yAfter);
	}

    @Test
    public void moveSouth() {
        // Move player South by two so they can move North
        game.movePlayer(1);
        game.movePlayer(1);

        // Initial position
        int xInitial = game.p.getxPos();
        int yInitial = game.p.getyPos();

        // Position after moving
		game.movePlayer(3);
        int xAfter = game.p.getxPos();
        int yAfter = game.p.getyPos();

        assertEquals(xInitial, xAfter);
        assertEquals(yInitial - 1, yAfter);
	}

    @Test
    public void moveWest() {
        // Move player South by two so they can move North
        game.movePlayer(2);
        game.movePlayer(2);

        // Initial position
        int xInitial = game.p.getxPos();
        int yInitial = game.p.getyPos();

        // Position after moving
		game.movePlayer(4);
        int xAfter = game.p.getxPos();
        int yAfter = game.p.getyPos();

        assertEquals(xInitial - 1, xAfter);
        assertEquals(yInitial, yAfter);
	}
}
