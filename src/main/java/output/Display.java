package output;

import models.characters.CharacterModel;

public class Display {

    public String printMessage(String textToDisplay){
        System.out.println(textToDisplay);
        return textToDisplay;
    }

    public void printCharacterStats(CharacterModel characterToPrint){
        printMessage(characterToPrint.getName() + "'s stats are:");
        printMessage("DEXTERITY");
        printMessage(String.valueOf(characterToPrint.getStats().getDexterity()));
        printMessage("ENERGY");
        printMessage(String.valueOf(characterToPrint.getStats().getEnergy()));
        printMessage("HEALTH");
        printMessage(String.valueOf(characterToPrint.getStats().getHealth()));
        printMessage("INTELLECT");
        printMessage(String.valueOf(characterToPrint.getStats().getIntellect()));
        printMessage("STRENGTH");
        printMessage(String.valueOf(characterToPrint.getStats().getStrength()));
    }
}
