package fr.le_campus_numerique.java.dd.personnage;

import fr.le_campus_numerique.java.dd.equipement.arme.*;
import fr.le_campus_numerique.java.dd.equipement.bouclier.*;

public class Guerrier extends Personnage {

    public Guerrier(String nom) {
        super(nom, "Guerrier");
        this.setNiveauDeVie(10);
        this.setEquipementOffensif(new Massue());
        this.setEquipementDefensif(new Bouclier("Bouclier", 2, "L'Égide"));
        this.setForceDAttaque(10 + getEquipementOffensif().getNivDAttaque());
    }
}
