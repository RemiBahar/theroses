package theroses_project;

import static org.junit.Assert.assertEquals;

import org.javatuples.Pair;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import Game.Monster;

public class MonsterTest {
	public static Monster monster;
	public static int xPos;
	public static int yPos;
	public static Pair<Integer, Integer> expectedPosition;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		int gridSize = 15;
		xPos = 10;
		yPos = 5;
		expectedPosition =  new Pair<Integer, Integer>(xPos, yPos);
        monster = new Monster(expectedPosition);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void message() {
		assertEquals(monster.getMessage(), "You got eaten!");
	}

	@Test
	public void endGame() {
		assertEquals(monster.isEndGame(), true);
	}

	@Test
	public void position() {
		assertEquals(expectedPosition, monster.getPosition());
	}

	@Test
	public void xPosition() {
		assertEquals(xPos, monster.getxPos());
	}

	@Test
	public void yPosition() {
		assertEquals(yPos, monster.getyPos());
	}


}
