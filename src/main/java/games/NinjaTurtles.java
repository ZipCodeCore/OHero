package games;

import input.ConsoleManager;
import models.characters.Hero;
import models.utility.HeroWarehouse;
import output.Display;

import java.util.Timer;

public class NinjaTurtles {

    private static Display gameDisplay = new Display();
    private static ConsoleManager gameConsole = new ConsoleManager();
    private static Hero currentPlayer;
    private static Timer timer;

    private NinjaTurtles() {
    }


    public static void start(HeroWarehouse characterCollection) {
        currentPlayer = characterCollection.getCharacterModelStorage().get(0);
        timer = new Timer();

        gameDisplay.printMessage("\nHeroes in a half shell. Turtle Power!");
        gameDisplay.printMessage("What did you want to do next.\nEnter 1 to Eat pizza: 2 to Train with Master Splinter: 3 to begin your hunt for Shredder.");

        int selection = Integer.parseInt(gameConsole.playerInput());

        switch (selection){
            case 1:
                gameDisplay.printMessage("Wise men say, 'forgiveness is divine, but never pay full price for late pizza'! ");
                break;
            case 2:
                gameDisplay.printMessage("My Master Yoshi's first rule was:  Possess the right thinking.  Only then can one receive the gifts of strength, knowledge, and peace!");
                break;
            case 3:
                gameDisplay.printMessage("Cowabunga Dudes! Lets kick some bad guy butt!");
                break;
            default:
                gameDisplay.printMessage("PLEASE ENTER 1, 2, OR 3");
                break;
        }
    }
}
