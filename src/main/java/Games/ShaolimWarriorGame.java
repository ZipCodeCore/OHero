package games;

import input.ConsoleManager;
import models.characters.Enemy;
import models.characters.Hero;
import models.items.Item;
import models.utility.HeroWarehouse;
import output.Display;

public class ShaolimWarriorGame {
    private static int enemyHealth = 100;
    private static Enemy badGuy = new Enemy(12345L,"Bolo","lackey");
    private static double enemyMoveChoice = Math.ceil(Math.random()*3);
    private static String playerName;
    private static int playerHealth;
    private static boolean alive = false;
    private static Display gameDisplay = new Display();
    private static Item scroll;
    private static ConsoleManager gameConsole = new ConsoleManager();
    private static Hero currentPlayer;


    private ShaolimWarriorGame(){}

    /**
     * method for deaths in game
     */

    public static void checkGameHealth(){
        //playerHealth = currentPlayer.getStats().getHealth();
        if (enemyHealth <= 0) {
            gameDisplay.printMessage("Your training was tested and you chi is strong, " + playerName + " you have defeated " + badGuy.getName() + ".\n" + "This battle is over but there are more who must answer for your masters betrayal ");
            alive = false;
        } else if (playerHealth <= 0) {
            gameDisplay.printMessage(playerName + " ,you have failed your master. " + badGuy.getName() + "'s chi was stronger. Master Huang betrayal will not be avenged by you.");
            alive = false;
        }
    }

    public static void start(HeroWarehouse characterCollection) {
        /**
         * games as on as long as player is alive
         */
        currentPlayer = characterCollection.getCharacterModelStorage().get(0);
        playerName = currentPlayer.getName();
        playerHealth = currentPlayer.getStats().getHealth();
            gameDisplay.printMessage("There has been a travesty at the Shoalin monastery. \n" +
                    "Your master Huang Zongxi has been found slain. \n" +
                    "All signs show that it was the disciples of Wang Shichong. \n" +
                    "You have traveled to Kāimíng to exact your revenge for the the honor of your master \n" +
                    "You enter the enemies dojo. " + badGuy.getName() + " is knealing in meditation. \n" +
                    "He raises his head. You lock eyes and he rises to fight you.");

            alive = true;
        while (alive) {


            gameDisplay.printMessage(badGuy.getName() + " has " + enemyHealth + " health remaining.");
            gameDisplay.printMessage(playerName + " has " + playerHealth + " health remaining.");

            gameDisplay.printMessage("What would you like to do? (a)punch (b)kick (c)knee strike: ");
            String playerFightChoice = gameConsole.playerInput();

            double enemyChoice = Math.ceil(Math.random() * 3);
            checkGameHealth();
            /**
             * switch statement takes the players choices a,b,c and
             * compares to random generated enemy choice should
             * create six different occurrences of responses
             */

            switch (playerFightChoice) {
                case "a" :
                    switch ((int) enemyChoice) {
                        case 1:
                            gameDisplay.printMessage(badGuy.getName() + " side steps your punch." + badGuy.getName() + " is faster than you thought");
                            checkGameHealth();
                            break;
                        case 2:
                            gameDisplay.printMessage(playerName + " lands a solid punch to " + badGuy.getName() + "'s ribs.");
                            enemyHealth -= 10;
                            checkGameHealth();
                            break;
                        case 3:
                            gameDisplay.printMessage(badGuy.getName() + " sidesteps and counters with kick into " + playerName + ".");
                            playerHealth -= 10;
                            checkGameHealth();
                            break;
                    }
                    break;
                    //enemyChoice = Math.ceil(Math.random() * 3);
                case "b":
                    switch ((int) enemyChoice) {
                        case 1:
                            gameDisplay.printMessage(badGuy.getName() + " dances by kick.");
                            checkGameHealth();
                            break;
                        case 2:
                            gameDisplay.printMessage(playerName + " your kick doubles " + badGuy.getName() + " over.");
                            enemyHealth -= 10;
                            checkGameHealth();
                            break;
                        case 3:
                            gameDisplay.printMessage(badGuy.getName() + " jumps back from your kick. And counters with a punch to " + playerName + "'s ribs.'");
                            playerHealth -= 10;
                            checkGameHealth();
                            break;
                    }
                    break;
                   // enemyChoice = Math.ceil(Math.random() * 3);
                case "c":
                    switch ((int) enemyChoice) {
                        case 1:
                            gameDisplay.printMessage(badGuy.getName() + " laughs at your missed knee attack.");
                            checkGameHealth();
                            break;
                        case 2:
                            gameDisplay.printMessage(playerName + " your knee doubles " + badGuy.getName() + " over.");
                            enemyHealth -= 10;
                            checkGameHealth();
                            break;
                        case 3:
                            gameDisplay.printMessage(badGuy.getName() + " evades your knee and lands a glancing blow to your face.");
                            playerHealth -= 10;
                            checkGameHealth();
                            break;
                default:
                    gameDisplay.printMessage("PLEASE ENTER a, b, OR c");
                    break;
                    }
                    break;

            }

        }
    }

}
