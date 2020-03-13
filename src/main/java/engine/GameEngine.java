package engine;

import input.ConsoleManager;
import models.characters.Hero;
import models.utility.HeroWarehouse;
import output.Display;

public class GameEngine {
    private Display gameDisplay = new Display();
    private ConsoleManager gameConsole = new ConsoleManager();
    private HeroWarehouse characterCollection = new HeroWarehouse();

    private Hero playerHero;



    public void gameStart() {
        gameDisplay.printMessage("Welcome to OHero! This is a lazy demo for a game. \n" +
                "...yours will surely be much better, cleaner, and more fun. \n" +
                "First, name yourself.");
    }

    public void nameAndStoreHero(){

        playerHero = new Hero(gameConsole.playerInput());
        characterCollection.getCharacterModelStorage().add(playerHero);
        playerHero.setId((long) characterCollection.getCharacterModelStorage().indexOf(playerHero));
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
        "Also, look into the relationship between the Stats and CharacterModel class to understand how that could be managed. \n" +
        "An example would be allowing the user to input 'Bruiser' and giving them high Health and Strength stats! \n" +
        "Use your imagination! Remember: Design and write tests FIRST! Understand what you need to get the job done.");

        gameDisplay.printMessage("Set your starting Dexterity.");
        characterCollection.getCharacterModelStorage().get(0).getStats().setDexterity(Integer.valueOf(gameConsole.playerInput()));
        gameDisplay.printMessage("Set your starting Energy.");
        characterCollection.getCharacterModelStorage().get(0).getStats().setEnergy(Integer.valueOf(gameConsole.playerInput()));
        gameDisplay.printMessage("Set your starting Strength.");
        characterCollection.getCharacterModelStorage().get(0).getStats().setStrength(Integer.valueOf(gameConsole.playerInput()));
        gameDisplay.printMessage("Set your starting Intellect.");
        characterCollection.getCharacterModelStorage().get(0).getStats().setIntellect(Integer.valueOf(gameConsole.playerInput()));
        gameDisplay.printMessage("Set your starting Health.");
        characterCollection.getCharacterModelStorage().get(0).getStats().setHealth(Integer.valueOf(gameConsole.playerInput()));
        //That's a lot of repetitive code. Do this better!
        //You'll also note that arbitrary values can be input here - the player could make themselves impossibly strong!
        //Apply better code practices and constraints to keep both of these terrible things from happening!
    }

    public void bagCheck(){
        gameDisplay.printMessage("You've got stats now. You don't have anything in your inventory. You'll be fine. \n" +
        "But why not revel in how broke you are? Do you want to check your inventory?");

        gameDisplay.printMessage("[Enter YES or NO]");

        if (yesOrNoCheck(gameConsole.playerInput())){
            gameDisplay.printMessage("How inquisitive! Enjoy this +5 Intellect!");
            characterCollection.getCharacterModelStorage().get(0).getStats().increaseIntel(5);
            gameDisplay.printCharacterStats(characterCollection.getCharacterModelStorage().get(0));
            gameDisplay.printMessage("...your bag is still empty though. It contains " +
                    characterCollection.getCharacterModelStorage().get(0).getHeroInventory().getItemStash().size() +
                    "\n items which is just sad. Nothing we can do about it though.");
        } else {
            gameDisplay.printMessage("Not very curious are you?");
            characterCollection.getCharacterModelStorage().get(0).getStats().decreaseIntel(5);
            gameDisplay.printMessage("Alright, we'll move on.");
        }
    }

    public void encounter() {
        gameDisplay.printMessage("Choose your Adventure! \n" +
                "1: Ninja Turtles. \n" +
                "2: Snow Spy. \n" +
                "3: Shaolin Monk.");
        if (gameConsole.playerInput().equals("1")) {
            gameDisplay.printMessage("Turtle Power! You must now defeat the foot clan to catch up with SHREDDER!");
        }
         else if (gameConsole.playerInput().equals("2")) {
            gameDisplay.printMessage("A blizzard is coming, find cover");
        }
        else if (gameConsole.playerInput().equals("3")) {
            gameDisplay.printMessage("You must train to defeat your enemies");
        }

    }



    private Boolean yesOrNoCheck(String yesOrNo){
        return yesOrNo.equalsIgnoreCase("yes");
    }
}
