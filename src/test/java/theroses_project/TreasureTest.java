package theroses_project;

import static org.junit.Assert.assertEquals;

import org.javatuples.Pair;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import Game.Treasure;

public class TreasureTest {
    public static Treasure treasure;
	public static int xPos;
	public static int yPos;
	public static Pair<Integer, Integer> expectedPosition;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		int gridSize = 15;
		xPos = 10;
		yPos = 5;
		expectedPosition =  new Pair<Integer, Integer>(xPos, yPos);
        treasure = new Treasure(expectedPosition);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void message() {
		assertEquals(treasure.getMessage(), "You won!");
	}

	@Test
	public void endGame() {
		assertEquals(treasure.isEndGame(), true);
	}

	@Test
	public void position() {
		assertEquals(expectedPosition, treasure.getPosition());
	}

	@Test
	public void xPosition() {
		assertEquals(xPos, treasure.getxPos());
	}

	@Test
	public void yPosition() {
		assertEquals(yPos, treasure.getyPos());
	}
}
