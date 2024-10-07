package Equipement;

public abstract class EquipementDefensif {
    private String type;
    private int nivDefence;
    private String nom;

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getNivDefence() {
        return nivDefence;
    }
    public void setNivDefence(int nivDefence) {
        this.nivDefence = nivDefence;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String toString(){
        return "Défence de type : " + type + "\n" +
                "Niveau : " + "+ " + nivDefence + "\n" +
                "Nom : " + nom;
    }

}