package Games;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

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

        Assert.assertTrue((  alive = true));
    }
}