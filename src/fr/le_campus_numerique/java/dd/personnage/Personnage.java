package fr.le_campus_numerique.java.dd.personnage;

import fr.le_campus_numerique.java.dd.equipement.EquipementDefensif;
import fr.le_campus_numerique.java.dd.equipement.EquipementOffensif;
import fr.le_campus_numerique.java.dd.combat.Combattant;
import fr.le_campus_numerique.java.dd.potion.Potion;

public abstract class Personnage implements Combattant {

    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";

    private String nom;
    private String type;
    private int niveauDeVie;
    private int forceDAttaque;
    private int stockIndex;
    private Potion[] stock;
    private EquipementOffensif equipementOffensif;
    private EquipementDefensif equipementDefensif;


    public Personnage(String nom, String type){
        this.nom = nom;
        this.type = type;
        this.stock = new Potion[1];
        this.stockIndex = 0;
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

    public Potion[] getStock() {
        return stock;
    }

    public void setStock(Potion potion) {
        if (stockIndex < stock.length) {
            stock[stockIndex] = potion;
            stockIndex++;
            System.out.println("La " + potion.getNom() + " a été ajoutée au stock.");
        } else {
            System.out.println("Le stock est plein, impossible de stocker cette potion.");
        }
    }

    public int getStockIndex() {
        return stockIndex;
    }

    public void setStockIndex(int stockIndex) {
        this.stockIndex = stockIndex;
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

    public void utiliserPotionDuStock(int index) {
        if (index >= 0 && index < stockIndex) {
            Potion potion = stock[index];
            setNiveauDeVie(getNiveauDeVie() + potion.getValeur());
            System.out.println("Vous avez utilisé une potion : " + potion.getNom());
            retirerPotionDuStock(index);
        } else {
            System.out.println("Potion invalide.");
        }
    }

    private void retirerPotionDuStock(int index) {
        for (int i = index; i < stockIndex - 1; i++) {
            stock[i] = stock[i + 1];
        }
        stock[stockIndex - 1] = null;
        stockIndex--;
    }

    public void encaisserAttaque(int degats) {
        this.niveauDeVie -= degats;
        if (this.niveauDeVie > 0) {
            System.out.println(this.nom + ", vous encaissez, votre niveau de vie est à : " + this.niveauDeVie);
        } else {
            System.out.println("Vous êtes mort " + this.nom);
            System.out.println("Fin de partie !");
            System.exit(0);
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