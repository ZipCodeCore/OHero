package models.characters;

import models.utility.Inventory;

public class Hero extends Character{

    private Inventory heroInventory;

    public Hero( String characterName) {
        super(characterName);
    }

    public Inventory getHeroInventory() {
        return heroInventory;
    }

    public void setHeroInventory(Inventory heroInventory) {
        this.heroInventory = heroInventory;
    }

}
