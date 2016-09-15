package edu.madisoncollege.entjava;
import org.junit.Before;
import org.junit.Test;

import java.util.*;
import static org.junit.Assert.*;


/**
 * Created by netherskub on 9/14/16.
 */

public class SantaTest {

    SantaInAnElevator santaInAnElevator;
    private List<String> tokenArray;

    @Before
    public void setup() {

        santaInAnElevator = new SantaInAnElevator();
        tokenArray = new ArrayList<String>();
    }

    @Test
    public void getDestination() {

        santaInAnElevator.displayFloorLevel();
    }

    @Test
    public void testDetermineFloor() {

        tokenArray.add("(");
        tokenArray.add(")");
        assertEquals("Floor level is at 0", 0, santaInAnElevator.determineFloor(tokenArray));
    }


}
