package models.items;

public class Armor extends Item {
    private String name;
    private int armorStrength;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArmorStrength() {
        return armorStrength;
    }

    public void setArmorStrength(int armorStrength) {
        this.armorStrength = armorStrength;
    }
}
