package Personnage;

import Equipement.EquipementDefensif;
import Equipement.EquipementOffensif;

public abstract class  Personnage {

    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";

    private String nom;
    private String type;
    private int niveauDeVie;
    private int forceDAttaque;
    private EquipementOffensif equipementOffensif;
    private EquipementDefensif equipementDefensif;

//    public Personnage.Personnage(){
//        this("Marbluf");
//    }
//
//    public Personnage.Personnage(String nom){
//        this(nom, "Personnage.Personnage.Magicien");
//    }

    public Personnage(String nom, String type){
        this.nom = nom;
        this.type = type;
//        if(Objects.equals(this.type, "Personnage.Personnage.Magicien")) {
//            this.type = new Personnage.Personnage.Magicien();
//            this.niveauDeVie = 6;
//            this.forceDAttaque = 15;
//            this.equipementOffensif = new Equipement.EquipementOffensif();
//            this.equipementDefensif = new Equipement.EquipementDefensif();
//        }
//        if(Objects.equals(this.type, "Personnage.Personnage.Guerrier")) {
//           this.type = new Personnage.Personnage.Guerrier();
//            this.niveauDeVie = 10;
//            this.forceDAttaque = 10;
//            this.equipementOffensif = new Equipement.EquipementOffensif("Equipement.Arme", 3, "Massue");
//            this.equipementDefensif = new Equipement.EquipementDefensif("Equipement.Bouclier", 2, "l'égide");
//        }
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

    public int getNiveauDeVie() {
        return niveauDeVie;
    }

    public void setNiveauDeVie(int niveauDeVie) {
        this.niveauDeVie = niveauDeVie;
    }

    public int getForceDAttaque() {
        return forceDAttaque;
    }

    public void setForceDAttaque(int forceDAttaque) {
        this.forceDAttaque = forceDAttaque;
    }

    public EquipementOffensif getEquipementOffensif(){
        return equipementOffensif;
    }
    public void setEquipementOffensif(EquipementOffensif equipementOffensif) {
        this.equipementOffensif = equipementOffensif;
    }
    public EquipementDefensif getEquipementDefensif(){
        return equipementDefensif;
    }
    public void setEquipementDefensif(EquipementDefensif equipementDefensif) {
        this.equipementDefensif = equipementDefensif;
    }



    public String toString() {
        return ANSI_BLUE + "Ton personnage :" + "\n" +
                ANSI_RESET +
                "Nom : " + nom + "\n" +
                "Type : " + type + "\n" +
                ANSI_BLUE +
                "Equipement Offensif : " + "\n" +
                ANSI_RESET
                + equipementOffensif + "\n" +
                ANSI_BLUE +
                "Equipement Défensif : " + "\n" +
                ANSI_RESET
                + equipementDefensif;
    }
}