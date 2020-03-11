package models.utility;

public class Stats {
    private Integer dexterity;
    private Integer energy;
    private Integer strength;
    private Integer intellect;
    private Integer health;

    public Stats(Integer dexterity, Integer energy, Integer strength, Integer intellect, Integer health) {
        this.dexterity = dexterity;
        this.energy = energy;
        this.strength = strength;
        this.intellect = intellect;
        this.health = health;
    }

    public Stats() {

    }

    public Integer getDexterity() {
        return dexterity;
    }

    public void setDexterity(Integer dexterity) {
        this.dexterity = dexterity;
    }

    public Integer getEnergy() {
        return energy;
    }

    public void setEnergy(Integer energy) {
        this.energy = energy;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getIntellect() {
        return intellect;
    }

    public void setIntellect(Integer intellect) {
        this.intellect = intellect;
    }

    public Integer increaseIntel(Integer modifier){
        return this.intellect = this.intellect + modifier;
    }

    public Integer decreaseIntel(Integer modifier){
        return this.intellect = this.intellect - modifier;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }


}
