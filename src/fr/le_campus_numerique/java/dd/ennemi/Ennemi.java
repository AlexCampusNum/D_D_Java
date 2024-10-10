package fr.le_campus_numerique.java.dd.ennemi;

import fr.le_campus_numerique.java.dd.potion.dossier.Case;
import fr.le_campus_numerique.java.dd.personnage.Personnage;

public class Ennemi implements Case {
    private String nom;
    private int forceDAttaque;
    private int pointDeVie;

    public Ennemi(String nom, int forceDAttaque, int pointDeVie) {
        this.nom = nom;
        this.forceDAttaque = forceDAttaque;
        this.pointDeVie = pointDeVie;
    }

    public void interagir(Personnage personnage){
        System.out.println("Vous vous retrouvez face à un " + nom);
        System.out.println("Ce gobelin à un niveau de vie de : " + this.pointDeVie);
        System.out.println("Vous attaquez ce gobelin");

        while (this.pointDeVie > 0 && personnage.getNiveauDeVie() > 0) {
            this.pointDeVie -= personnage.getForceDAttaque();

            if (this.pointDeVie <= 0) {
                System.out.println("Vous terrassez finalement ce gobelin.");
                break;
            }

            personnage.setNiveauDeVie(personnage.getNiveauDeVie() - this.forceDAttaque);
            if (personnage.getNiveauDeVie() <= 0) {
                System.out.println("Vous êtes vaincu.");
                break;
            }
        }
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
