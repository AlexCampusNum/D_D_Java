import java.util.Objects;

public class Personnage {

    private String nom;
    private String type;
    private int niveauDeVie;
    private int forceDAttaque;
    private EquipementOffensif equipementOffensif;
    private EquipementDefensif equipementDefensif;

    public Personnage(){
        this("Marbluf");
    }

    public Personnage(String nom){
        this(nom, "Magicien");
    }

    public Personnage(String nom, String type){
        this.nom = nom;
        this.type = type;
        if(Objects.equals(this.type, "Magicien")) {
            this.niveauDeVie = 6;
            this.forceDAttaque = 15;
            this.equipementOffensif = new EquipementOffensif();
            this.equipementDefensif = new EquipementDefensif();
        }
        if(Objects.equals(this.type, "Guerrier")) {
            this.niveauDeVie = 10;
            this.forceDAttaque = 10;
            this.equipementOffensif = new EquipementOffensif("Arme", 3, "Massue");
            this.equipementDefensif = new EquipementDefensif("Bouclier", 2, "l'égide");
        }
    }

    public String getNom(){
        return nom;
    }

    public void setName(String nom){
        this.nom = nom;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

//    EquipementOffensif equipementOffensif = new EquipementOffensif();
//    EquipementDefensif equipementDefensif = new EquipementDefensif();

    public String toString(){
        return
                "Nom : " + nom + "\n" +
                "Type : " + type + "\n" +
                "Niveau de vie : " + niveauDeVie + "\n" +
                "Force d'attaque : "
                        + (forceDAttaque
                        +
                         equipementOffensif.getNivDAttaque())
                        + "\n" +
                "Equipement Offenssif : " + "\n" +
                        equipementOffensif + "\n" +
                "Equipement Défensif : " + "\n" +
                        equipementDefensif;
    }
}




