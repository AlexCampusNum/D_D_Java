package fr.le_campus_numerique.java.dd.personnage;

import fr.le_campus_numerique.java.dd.equipement.sort.*;
import fr.le_campus_numerique.java.dd.equipement.philtre.*;

public class Magicien extends Personnage{

    public Magicien(String nom) {
        super(nom, "Magicien");
        this.setNiveauDeVie(6);
        this.setEquipementOffensif(new Eclair());
        this.setEquipementDefensif(new Philtre("Philtre", 4, "Philtre de défense"));
        this.setForceDAttaque(15 + getEquipementOffensif().getNivDAttaque());
    }
}
