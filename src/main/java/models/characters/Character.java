package models.characters;

import models.utility.Stats;

public abstract class Character {
    private Long id;
    private String name;
    private Stats stats;


    public Character(Long id, String characterName) {
        this.id = id;
        this.name = characterName;
        this.stats = new Stats();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
