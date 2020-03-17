package models.characters;

import models.utility.Stats;

public abstract class CharacterModel {
    private Long id;
    private String name;
    private Stats stats;


    public CharacterModel(String characterName) {
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

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }


}
