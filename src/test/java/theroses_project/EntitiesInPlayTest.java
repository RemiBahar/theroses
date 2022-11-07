package theroses_project;

import static org.junit.Assert.assertEquals;

import org.javatuples.Pair;
import org.junit.BeforeClass;
import org.junit.Test;

import Game.EntitiesInPlay;
import Game.Monster;
import Game.Player;
import Game.Treasure;

public class EntitiesInPlayTest {
    public static EntitiesInPlay entitiesInPlay;
    
    @BeforeClass
	public static void setUpBeforeClass() throws Exception {
		entitiesInPlay = new EntitiesInPlay();
	}

    @Test
    public void addMonster() {
        Pair<Integer, Integer> position =  new Pair<Integer, Integer>(10, 5);
        Monster expectedMonster = new Monster(position);
        entitiesInPlay.addEntity(expectedMonster);
        Monster actualMonster = (Monster) entitiesInPlay.getEntity(position);

		assertEquals(expectedMonster, actualMonster);
	}

    @Test
    public void addTreasure() {
        Pair<Integer, Integer> position =  new Pair<Integer, Integer>(3, 1);
        Treasure expected = new Treasure(position);
        entitiesInPlay.addEntity(expected);
        Treasure actual = (Treasure) entitiesInPlay.getEntity(position);
        
		assertEquals(expected, actual);
	}

    @Test
    public void clearEntities() {
        Pair<Integer, Integer> position =  new Pair<Integer, Integer>(4, 4);
        Monster expectedMonster = new Monster(position);
        entitiesInPlay.addEntity(expectedMonster);
        Monster actualMonster = (Monster) entitiesInPlay.getEntity(position);
        entitiesInPlay.clearEntities();

        
		assertEquals("", entitiesInPlay.toString());
	}
}
