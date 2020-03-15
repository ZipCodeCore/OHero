package Games;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import output.Display;

import static org.junit.jupiter.api.Assertions.*;

class ShaolimWarriorGameTest {


    private static int enemyHealth = 100;
    private static int playerHealth = 100;
    private static boolean alive = false;


    @Test
    void checkGameHealth() {
        if(enemyHealth <= 0)
            alive = false;
        else if (playerHealth <= 0)
            alive = false;

        Assert.assertTrue(( alive = true));
    }

    @Test
    void shaolinWarriorGameStart() {
    }

    @Test
    void fightTime() {
        alive = true;
        //String fight = null;
    }

    @Test
    void playerDecision() {
        //when
        Display gameDisplay = new Display();
        gameDisplay.printMessage("\"What would you like to do? (a)punch (b)kick (c)use weapon: ");
        //given
       // String playerAction = gameDisplay;
        //then
    }
}