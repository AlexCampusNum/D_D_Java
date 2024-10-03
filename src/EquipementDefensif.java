public class EquipementDefensif {
    private String type;
    private int nivDefence;
    private String nom;

    public EquipementDefensif(){
        this("Philtre");
    }
    public EquipementDefensif(String type){
        this(type, 4);
    }
    public EquipementDefensif(String type, int nivDefence){
        this(type, nivDefence, "Philtre de défense");
    }
    public EquipementDefensif(String type, int nivDefence, String nom){
        this.type = type;
        this.nivDefence = nivDefence;
        this.nom = nom;
    }

    public String getType() {
        return type;
    }
    public int getNivDefence() {
        return nivDefence;
    }
    public String getNom() {
        return nom;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setNivDefence(int nivDefence) {
        this.nivDefence = nivDefence;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String toString(){
        return "Défence de type : " + type + "\n" +
                "Niveau : " + "+" + nivDefence + "\n" +
                "Nom : " + nom;
    }

}
