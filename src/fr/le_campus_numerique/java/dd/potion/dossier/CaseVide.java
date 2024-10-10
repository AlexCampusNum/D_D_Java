package fr.le_campus_numerique.java.dd.potion.dossier;

import fr.le_campus_numerique.java.dd.personnage.Personnage;

public class CaseVide implements Case {
    public void interagir(Personnage personnage) {
        System.out.println("fr.le_campus_numerique.java.dd.Case vide, mais restez sur vos gardes");
    }
}
