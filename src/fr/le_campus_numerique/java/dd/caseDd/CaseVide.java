package fr.le_campus_numerique.java.dd.caseDd;

import fr.le_campus_numerique.java.dd.personnage.Personnage;

public class CaseVide implements Case {
    public void interagir(Personnage personnage) {
        System.out.println("Case vide, mais restez sur vos gardes");
    }
}
