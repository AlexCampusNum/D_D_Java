package fr.le_campus_numerique.java.dd.personnage;

import fr.le_campus_numerique.java.dd.equipement.EquipementDefensif;
import fr.le_campus_numerique.java.dd.equipement.EquipementOffensif;
import fr.le_campus_numerique.java.dd.combat.Combattant;

public abstract class Personnage implements Combattant {

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

    public void encaisserAttaque(int degats) {
        this.niveauDeVie -= degats;
        if (this.niveauDeVie > 0) {
            System.out.println(this.nom + " encaisse, son niveau de vie est à : " + this.niveauDeVie);
        } else {
            System.out.println(this.nom + " est vaincu.");
        }
    }

    public boolean estVivant() {
        return this.niveauDeVie > 0;
    }


    public String toString() {
        return ANSI_BLUE + "Ton personnage :" + "\n" +
                ANSI_RESET +
                "Nom : " + nom + "\n" +
                "Type : " + type + "\n" +
                "Niveau de vie : " + niveauDeVie + "\n" +
                "Force d'attaque : " + forceDAttaque + "\n" +
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