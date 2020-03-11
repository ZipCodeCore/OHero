package models.characters;

public class Enemy extends CharacterModel {

    private String type;

    public Enemy(Long id, String name, String enemyType) {
        super(name);
        this.type = enemyType;
    }
}
