package Games;

import models.characters.Hero;
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
    void checkGameHealth(int playerHealth) {

        if(enemyHealth <= 0)
            alive = false;
        else if (ShaolimWarriorGameTest.playerHealth <= 0)
            alive = false;

        checkGameHealth(playerHealth);


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

    }
}