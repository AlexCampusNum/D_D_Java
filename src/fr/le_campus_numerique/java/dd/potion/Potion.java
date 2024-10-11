package fr.le_campus_numerique.java.dd.potion;

import fr.le_campus_numerique.java.dd.caseDd.Case;
import fr.le_campus_numerique.java.dd.personnage.Personnage;
import java.util.Scanner;


public class Potion implements Case {

    private String type;
    private String nom;
    private int valeur;
    private final Scanner scanner;


    public Potion(String type, String nom, int valeur) {
        this.type = type;
        this.nom = nom;
        this.valeur = valeur;
        scanner = new Scanner(System.in);
    }

    public void interagir(Personnage personnage){
        System.out.println("Vous trouvez une " + this.nom);
        System.out.println("Voulez vous utiliser cette " + this.nom + " ou la stocker ?");
        System.out.println("1. Utiliser");
        System.out.println("2. Stocker");
        int choix;
        while (true) {
            try {
                choix = Integer.parseInt(scanner.nextLine());
                if (choix == 1 || choix == 2) break;
                System.out.println("Veuillez entrer un choix valide (1 ou 2) :");
            } catch (NumberFormatException e) {
                System.out.println("Entrée invalide. Veuillez entrer un nombre (1 ou 2) :");
            }
        }

        if (choix == 1) {
            personnage.setNiveauDeVie(personnage.getNiveauDeVie() + this.valeur);
            System.out.println("Votre niveau de vie augmente à : " + personnage.getNiveauDeVie());
        } else if (choix == 2) {
            personnage.setStock(this);
        }
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
