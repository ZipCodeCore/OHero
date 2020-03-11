package models.utility;

import models.characters.Character;

import java.util.ArrayList;

public class CharacterWarehouse {
    private ArrayList<Character> characterStorage;

    public CharacterWarehouse() {
        this.characterStorage = new ArrayList<Character>();
    }

    public ArrayList<Character> getCharacterStorage() {
        return characterStorage;
    }

    public void setCharacterStorage(ArrayList<Character> characterStorage) {
        this.characterStorage = characterStorage;
    }
}
