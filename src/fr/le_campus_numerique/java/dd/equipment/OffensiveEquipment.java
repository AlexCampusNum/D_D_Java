package fr.le_campus_numerique.java.dd.equipment;


import fr.le_campus_numerique.java.dd.space.Space;

/**
 * Represents an abstract offensive equipment in the game.
 * This class provides a base for all types of offensive equipment.
 */
public abstract class OffensiveEquipment implements Space {
    private String type;
    private int attackLevel;
    private String name;

    /**
     * Gets the type of the offensive equipment.
     *
     * @return The type of the offensive equipment
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type of the offensive equipment.
     *
     * @param type The new type of the offensive equipment
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets the attack level of the offensive equipment.
     *
     * @return The attack level of the offensive equipment
     */
    public int getAttackLevel() {
        return attackLevel;
    }

    /**
     * Sets the attack level of the offensive equipment.
     *
     * @param attackLevel The new attack level of the offensive equipment
     */
    public void setAttackLevel(int attackLevel) {
        this.attackLevel = attackLevel;
    }

    /**
     * Gets the name of the offensive equipment.
     *
     * @return The name of the offensive equipment
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the offensive equipment.
     *
     * @param name The new name of the offensive equipment
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns a string representation of the offensive equipment.
     *
     * @return A string containing the type, attack level, and name of the equipment
     */
    @Override
    public String toString() {
        return "Attaque de type : " + type + "\n" +
                "Niveau : " + "+ " + attackLevel + "\n" +
                "Nom : " + name;
    }
}