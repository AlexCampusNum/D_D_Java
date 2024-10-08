package Personnage;

import Equipement.EquipementDefensif;
import Equipement.EquipementOffensif;

public abstract class Personnage {

    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";

    private String nom;
    private String type;
    private int niveauDeVie;
    private int forceDAttaque;
    private EquipementOffensif equipementOffensif;
    private EquipementDefensif equipementDefensif;


    public Personnage(String nom, String type){
        this.nom = nom;
        this.type = type;
    }

    public String getNom(){
        return nom;
    }

    public void setNom(String nom){
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