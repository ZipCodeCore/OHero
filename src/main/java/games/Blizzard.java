package games;

import input.ConsoleManager;
import models.characters.Hero;
import models.utility.HeroWarehouse;
import output.Display;

import java.util.Timer;

public class Blizzard {

    private static Display gameDisplay = new Display();
    private static ConsoleManager gameConsole = new ConsoleManager();
    private static Hero currentPlayer;
    private static Timer timer;

    private Blizzard() {
    }


    public static void start(HeroWarehouse characterCollection) {
        currentPlayer = characterCollection.getCharacterModelStorage().get(0);
        timer = new Timer();

        gameDisplay.printMessage("\nYou've entered the teradome.");
        gameDisplay.printMessage("Are you an Advanced, Novice, or Beginner.\nEnter 1 for Advanced: 2 for Novice: 3 for Beginner.");

        int selection = Integer.parseInt(gameConsole.playerInput());

        switch (selection){
            case 1:
                gameDisplay.printMessage("You've chosen Advanced!");
                break;
            case 2:
                gameDisplay.printMessage("You've chosen Novice!");
                break;
            case 3:
                gameDisplay.printMessage("You've chosen Beginner!");
                break;
            default:
                gameDisplay.printMessage("PLEASE ENTER 1,2, OR 3");
                break;
        }
    }
}
