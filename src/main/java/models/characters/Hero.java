package models.characters;

import models.utility.Inventory;

public class Hero extends Character{

    private Inventory heroInventory;

    public Hero(Long id, String characterName) {
        super(id, characterName);
    }

    public Inventory getHeroInventory() {
        return heroInventory;
    }

    public void setHeroInventory(Inventory heroInventory) {
        this.heroInventory = heroInventory;
    }

}
