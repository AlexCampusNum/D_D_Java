package fr.le_campus_numerique.java.dd.equipement;

public abstract class EquipementDefensif {
    private String type;
    private int nivDefense;
    private String nom;

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getNivDefense() {
        return nivDefense;
    }
    public void setNivDefense(int nivDefense) {
        this.nivDefense = nivDefense;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String toString(){
        return "Défence de type : " + type + "\n" +
                "Niveau : " + "+ " + nivDefense + "\n" +
                "Nom : " + nom;
    }

}