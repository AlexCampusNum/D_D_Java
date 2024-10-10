package fr.le_campus_numerique.java.dd.potion;

import fr.le_campus_numerique.java.dd.potion.dossier.Case;
import fr.le_campus_numerique.java.dd.personnage.Personnage;

public class Potion implements Case {

    private String type;
    private String nom;
    private int valeur;

    public Potion(String type, String nom, int valeur) {
        this.type = type;
        this.nom = nom;
        this.valeur = valeur;
    }

    public void interagir(Personnage personnage){
        System.out.println("Vous trouvez une " + nom);
        int actualLevel = personnage.getNiveauDeVie();
        int newLevel = actualLevel + valeur;
        personnage.setNiveauDeVie(newLevel);
        System.out.println("Votre niveau de vie augmente, il est maintenant de " + personnage.getNiveauDeVie());
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }
}
