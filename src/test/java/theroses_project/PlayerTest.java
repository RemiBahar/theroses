package theroses_project;

import static org.junit.Assert.assertEquals;

import org.javatuples.Pair;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.Order;

import Game.Player;

public class PlayerTest {
    public static Player player;
	public static int xPos;
	public static int yPos;
	public static Pair<Integer, Integer> expectedPosition;
    public static Pair<Integer, Integer> initialPosition;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		int gridSize = 15;
		xPos = 10;
		yPos = 5;
		expectedPosition =  new Pair<Integer, Integer>(xPos, yPos);
        player = new Player(expectedPosition);
        
       
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void message() {
		assertEquals(player.getMessage(), null);
	}

	@Test
	public void endGame() {
		assertEquals(player.isEndGame(), false);
	}

	@Test
	public void position() {
        int x = 2;
        int y = 3;
        Pair<Integer, Integer> expectedPosition = new Pair<Integer, Integer>(x, y);
        player.setxPos(x);
        player.setyPos(y);
        
		assertEquals(expectedPosition, player.getPosition());
	}

    @Test
	public void updateXPosition() {
        int updatedXPos = 12;
        player.setxPos(updatedXPos);
		assertEquals(updatedXPos, player.getxPos());
	}

    @Test
    @Order(2)
	public void updateYPosition() {
        int updatedYPos = 7;
        player.setyPos(updatedYPos);
		assertEquals(updatedYPos, player.getyPos());
	}

}
