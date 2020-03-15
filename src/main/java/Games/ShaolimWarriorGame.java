package games;

import input.ConsoleManager;
import models.characters.Hero;
import models.items.Item;
import models.utility.HeroWarehouse;
import output.Display;

public class ShaolimWarriorGame {
    private static int enemyHealth = 100;
    private static String enemyName = "Bolo";
    private static double enemyMoveChoice = Math.ceil(Math.random()*3);
    private static String playerName;
    private static int playerHealth;
    private static boolean alive = false;
    private static Display gameDisplay = new Display();
    private static Item scroll;
    private static ConsoleManager gameConsole = new ConsoleManager();
    private static Hero currentPlayer;


    private ShaolimWarriorGame(){}

    public static void start(HeroWarehouse characterCollection) {
        currentPlayer = characterCollection.getCharacterModelStorage().get(0);

        gameDisplay.printMessage("There has been a travesty at the Shoalin monastery. \n" +
                "Your master Huang Zongxi has been found slain. \n" +
                "All signs show that it was the disciples of Wang Shichong. \n" +
                "You have traveled to Kāimíng to exact your revenge for the the honor of your master \n" +
                "You enter the enemies dojo." +enemyName + " is knealing in meditation. \n" +
                "He raises his head. You lock eyes and he rises to fight you.");
        playerHealth = currentPlayer.getStats().getHealth();
        playerName = currentPlayer.getName();
        gameDisplay.printMessage(enemyName + " has " + enemyHealth + " health remaining.");
        gameDisplay.printMessage(playerName + " has " + playerHealth + " health remaining.");
        }

    public void checkGameHealth(){
        playerHealth = currentPlayer.getStats().getHealth();
        if (enemyHealth <= 0) {
            gameDisplay.printMessage("Your training was tested and you chi is strong, " + currentPlayer + " you have defeated " + enemyName + ".\n" + "This battle is over but there are more who must answer for your masters betrayal ");
            alive = false;
        } else if (playerHealth <= 0) {
            gameDisplay.printMessage(currentPlayer + " ,you have failed your master. " + enemyName + "'s chi was stronger. Master Huang betrayal will not be avenged by you.");
            alive = false;
        }
    }

    private Boolean yesOrNoCheck(String yesOrNo) {
        return yesOrNo.equalsIgnoreCase("yes");
    }

    public void playerDecision(){}

        public void fightTime(){
        while (alive){



        }
        }

}
