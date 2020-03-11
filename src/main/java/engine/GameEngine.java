package engine;

import input.ConsoleManager;
import models.characters.Hero;
import models.utility.CharacterWarehouse;
import output.Display;

public class GameEngine {
    private Display gameDisplay = new Display();
    private ConsoleManager gameConsole = new ConsoleManager();
    private CharacterWarehouse characterCollection = new CharacterWarehouse();

    private Hero playerHero;



    public void gameStart() {
        gameDisplay.printMessage("Welcome to OHero! This is a lazy demo for a game. \n" +
                "...yours will surely be much better, cleaner, and more fun. \n" +
                "First, name yourself.");
    }

    public void nameAndStoreHero(){

        playerHero = new Hero(gameConsole.playerInput());
        characterCollection.getCharacterStorage().add(playerHero);
        playerHero.setId((long) characterCollection.getCharacterStorage().indexOf(playerHero));
        //Something is up with this ID creation. What's wrong with it? Could you optimize it?

        gameDisplay.printMessage("So your name is " + playerHero.getName() + " ?");

        if(yesOrNoCheck(gameConsole.playerInput())){
            gameDisplay.printMessage("Great. Nice to meet you " + playerHero.getName() + " !");
        } else {
            gameDisplay.printMessage("Oh. Then what is your name?");
            playerHero.setName(gameConsole.playerInput());
        }
    }

    public void startingStats(){
        gameDisplay.printMessage("If this weren't a lazy demo, you would select your starting stats here! \n" +
        "Consider having the player start from archetypes rather than choosing individual stats! \n" +
        "Also, look into the relationship between the Stats and Character class to understand how that could be managed. \n" +
        "An example would be allowing the user to input 'Bruiser' and giving them high Health and Strength stats! \n" +
        "Use your imagination! Remember: Design and write tests FIRST! Understand what you need to get the job done.");

        gameDisplay.printMessage("Set your starting Dexterity.");
        characterCollection.getCharacterStorage().get(0).getStats().setDexterity(Integer.valueOf(gameConsole.playerInput()));
        gameDisplay.printMessage("Set your starting Energy.");
        characterCollection.getCharacterStorage().get(0).getStats().setEnergy(Integer.valueOf(gameConsole.playerInput()));
        gameDisplay.printMessage("Set your starting Strength.");
        characterCollection.getCharacterStorage().get(0).getStats().setStrength(Integer.valueOf(gameConsole.playerInput()));
        gameDisplay.printMessage("Set your starting Intellect.");
        characterCollection.getCharacterStorage().get(0).getStats().setIntellect(Integer.valueOf(gameConsole.playerInput()));
        gameDisplay.printMessage("Set your starting Health.");
        characterCollection.getCharacterStorage().get(0).getStats().setHealth(Integer.valueOf(gameConsole.playerInput()));
        //That's a lot of repetitive code. Do this better!
        //You'll also note that arbitrary values can be input here - the player could make themselves impossibly strong!
        //Apply better code practices and constraints to keep both of these terrible things from happening!
    }




    public Boolean yesOrNoCheck(String yesOrNo){
        if(yesOrNo.equalsIgnoreCase("yes")){
            return true;
        }
        return false;
    }
}
