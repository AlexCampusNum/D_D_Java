package fr.le_campus_numerique.java.dd.equipment;

/**
 * Represents an abstract defensive equipment in the game.
 * This class provides a base for all types of defensive equipment.
 */
public abstract class DefensiveEquipment {
    private String type;
    private int defenseLevel;
    private String name;

    /**
     * Gets the type of the defensive equipment.
     *
     * @return The type of the defensive equipment
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type of the defensive equipment.
     *
     * @param type The new type of the defensive equipment
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets the defense level of the defensive equipment.
     *
     * @return The defense level of the defensive equipment
     */
    public int getDefenseLevel() {
        return defenseLevel;
    }

    /**
     * Sets the defense level of the defensive equipment.
     *
     * @param defenseLevel The new defense level of the defensive equipment
     */
    public void setDefenseLevel(int defenseLevel) {
        this.defenseLevel = defenseLevel;
    }

    /**
     * Gets the name of the defensive equipment.
     *
     * @return The name of the defensive equipment
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the defensive equipment.
     *
     * @param name The new name of the defensive equipment
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns a string representation of the defensive equipment.
     *
     * @return A string containing the type, defense level, and name of the equipment
     */
    @Override
    public String toString() {
        return "Défence de type : " + type + "\n" +
                "Niveau : " + "+ " + defenseLevel + "\n" +
                "Nom : " + name;
    }
}