package fr.le_campus_numerique.java.dd.ennemi;

import fr.le_campus_numerique.java.dd.caseDd.Case;
import fr.le_campus_numerique.java.dd.combat.Combattant;
import fr.le_campus_numerique.java.dd.personnage.Personnage;

public class Ennemi implements Case, Combattant {
    private String nom;
    private int forceDAttaque;
    private int pointDeVie;

    public Ennemi(String nom, int forceDAttaque, int pointDeVie) {
        this.nom = nom;
        this.forceDAttaque = forceDAttaque;
        this.pointDeVie = pointDeVie;
    }

    public void interagir(Personnage personnage) {
        System.out.println("Vous vous retrouvez face à un " + this.nom);
        System.out.println("Ce " + this.nom + " a un niveau de vie de : " + this.pointDeVie);
        System.out.println("Le combat commence avec le " + this.nom);

        combattre(personnage);
    }

    private void combattre(Personnage personnage) {
        if (this.estVivant() && personnage.estVivant()) {
            System.out.println(personnage.getNom() + " attaque !");
            this.encaisserAttaque(personnage.getForceDAttaque());

            if (this.estVivant()) {
                System.out.println(this.nom + " contre-attaque !");
                personnage.encaisserAttaque(this.forceDAttaque);

                combattre(personnage);
            }
        }
    }

    public void encaisserAttaque(int degats) {
        this.pointDeVie -= degats;
        if (this.pointDeVie > 0) {
            System.out.println(this.nom + " encaisse, son niveau de vie est à : " + this.pointDeVie);
        } else {
            System.out.println(this.nom + " est terrassé !");
        }
    }

    public boolean estVivant() {
        return this.pointDeVie > 0;
    }



    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getForceDAttaque() {
        return forceDAttaque;
    }

    public void setForceDAttaque(int forceDAttaque) {
        this.forceDAttaque = forceDAttaque;
    }

    public int getPointDeVie() {
        return pointDeVie;
    }

    public void setPointDeVie(int pointDeVie) {
        this.pointDeVie = pointDeVie;
    }
}
