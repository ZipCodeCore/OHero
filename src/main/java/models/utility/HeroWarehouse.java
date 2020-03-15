package models.utility;

import models.characters.Hero;

import java.util.ArrayList;

public class HeroWarehouse {
    private ArrayList<Hero> characterModelStorage;

    public HeroWarehouse() {
        this.characterModelStorage = new ArrayList<Hero>();
    }

    public ArrayList<Hero> getCharacterModelStorage() {
        return characterModelStorage;
    }

    public void setCharacterModelStorage(ArrayList<Hero> characterModelStorage) {
        this.characterModelStorage = characterModelStorage;
    }


}
