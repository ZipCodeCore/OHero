package games;

import input.ConsoleManager;
import models.characters.Hero;
import models.items.Item;
import models.utility.HeroWarehouse;
import output.Display;

public class ShaolimWarriorGame {
    private static int enemyHealth = 100;
    private static String enemyName;
    private static double enemyMoveChoice = Math.ceil(Math.random()*3);
    private static String playerName = "playerHero.getName()";
    private static int playerHealth;
    private static boolean alive = false;
    private static Display gameDisplay = new Display();
    private static Item scroll;
    private static ConsoleManager gameConsole = new ConsoleManager();
    private static Hero currentPlayer;


    public void ShaolinWarriorGameStart(HeroWarehouse characterCollection) {
        currentPlayer = characterCollection.getCharacterModelStorage().get(0);
        gameDisplay.printMessage("There has been a travesty at the Shoalin monastery. \n" +
                "Your master Huang Zongxi has been found slain. \n" +
                "All signs show that it was the disciples of Wang Shichong. \n" +
                "You have traveled to Kāimíng to exact your revenge for the the honor of your master \n" +
                "You enter the enemies dojo." +enemyName + " is knealing in meditation. \n" +
                "He raises his head. You lock eyes and he rises to fight you.");
    }

    public void checkGameHealth(){
        if (enemyHealth <= 0) {
            gameDisplay.printMessage("Your training was tested and you chi is strong, " + playerName + " you have defeated " + enemyName + ".\n" + "This battle is over but there are more who must answer for your masters betrayal ");
            alive = false;
        } else if (playerHealth <= 0) {
            gameDisplay.printMessage(playerName + " ,you have failed your master. " + enemyName + "'s chi was stronger. Master Huang betrayal will not be avenged by you.");
            alive = false;
        }
    }

    private Boolean yesOrNoCheck(String yesOrNo) {
        return yesOrNo.equalsIgnoreCase("yes");
    }

    public void playerDecision(){}

        public void fightTime(){
        }

}
