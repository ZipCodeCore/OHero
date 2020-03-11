package models.characters;

public class Enemy extends Character{

    private String type;

    public Enemy(Long id, String name, Integer intelligence, Integer strength, Integer dexterity, Integer health) {
        super(id, name, intelligence, strength, dexterity, health);
    }
}
