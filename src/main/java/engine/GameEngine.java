package engine;

import games.Blizzard;
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

    public void nameAndStoreHero() {

        playerHero = new Hero(gameConsole.playerInput());
        characterCollection.getCharacterModelStorage().add(playerHero);
        playerHero.setId((long) characterCollection.getCharacterModelStorage().indexOf(playerHero));
        //Something is up with this ID creation. What's wrong with it? Could you optimize it?

        gameDisplay.printMessage("So your name is " + playerHero.getName() + " ?");

        if (yesOrNoCheck(gameConsole.playerInput())) {
            gameDisplay.printMessage("Great. Nice to meet you " + playerHero.getName() + " !");
        } else {
            gameDisplay.printMessage("Oh. Then what is your name?");
            playerHero.setName(gameConsole.playerInput());
            gameDisplay.printMessage("Ok then your name is " + playerHero.getName() + "\nGreat. Nice to meet you " + playerHero.getName());
        }
    }

    public void startingStats() {
//        gameDisplay.printMessage("If this weren't a lazy demo, you would select your starting stats here! \n" +
//                "Consider having the player start from archetypes rather than choosing individual stats! \n" +
//                "Also, look into the relationship between the Stats and CharacterModel class to understand how that could be managed. \n" +
//                "An example would be allowing the user to input 'Bruiser' and giving them high Health and Strength stats! \n" +
//                "Use your imagination! Remember: Design and write tests FIRST! Understand what you need to get the job done.");
        Hero currentPlayer = characterCollection.getCharacterModelStorage().get(0);

        gameDisplay.printMessage("\n" + currentPlayer.getName() + "'s Stats are:");

        characterCollection.getCharacterModelStorage().get(0).getStats().setDexterity(100);
        gameDisplay.printMessage( "Dexterity = " + currentPlayer.getStats().getDexterity());

        characterCollection.getCharacterModelStorage().get(0).getStats().setEnergy(100);
        gameDisplay.printMessage("Energy = " + currentPlayer.getStats().getEnergy());

        characterCollection.getCharacterModelStorage().get(0).getStats().setStrength(100);
        gameDisplay.printMessage("Strength = " + currentPlayer.getStats().getStrength());

        characterCollection.getCharacterModelStorage().get(0).getStats().setIntellect(100);
        gameDisplay.printMessage("Intellect = " + currentPlayer.getStats().getIntellect());

        characterCollection.getCharacterModelStorage().get(0).getStats().setHealth(100);
        gameDisplay.printMessage("Health = " + currentPlayer.getStats().getHealth());

        //That's a lot of repetitive code. Do this better!
        //You'll also note that arbitrary values can be input here - the player could make themselves impossibly strong!
        //Apply better code practices and constraints to keep both of these terrible things from happening!
    }

    public void bagCheck() {
        gameDisplay.printMessage( "\nYou've got stats now. You don't have anything in your inventory. You'll be fine. \n" +
                "But why not revel in how broke you are? Do you want to check your inventory?");

        gameDisplay.printMessage("[Enter YES or NO]");

        if (yesOrNoCheck(gameConsole.playerInput())) {
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




    private Boolean yesOrNoCheck(String yesOrNo){
        return yesOrNo.equalsIgnoreCase("yes");
    }
    // start here


    public void encounter() {
        gameDisplay.printMessage("\nYou have three game choices! \n" +
                "1: Head to the sewers. \n" +
                "2: Exit the building into the snow storm. \n" +
                "3: Enter through the bamboo doorway into the Shaolin temple\n" +
                "4: To EXIT.");

        String choice = gameConsole.playerInput();

        while (choice != "abort") {
            switch (choice) {
                case "1":
                    gameDisplay.printMessage("You are now in the sewer!");
                    break;
                case "2":
                    gameDisplay.printMessage("Look for cover, a blizzard is coming!");
                    Blizzard.start(characterCollection);
                    break;
                case "3":
                    gameDisplay.printMessage("Welcome to the dojo!");
                    break;
                case "4":
                    gameDisplay.printMessage("Thank you have a nice day");
                    return;
                default:
                    gameDisplay.printMessage("Please choose 1, 2, 3, or 4.");
                    break;
                }
                choice = gameConsole.playerInput();
            }
        }
    }

