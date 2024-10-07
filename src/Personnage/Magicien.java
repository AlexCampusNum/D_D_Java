package Personnage;

import Equipement.Sort;
import Equipement.Philtre;

public class Magicien extends Personnage{

    public Magicien(String nom) {
        super(nom, "Magicien");
        this.setNiveauDeVie(6);;
        this.setForceDAttaque(15);
        this.setEquipementOffensif(new Sort());
        this.setEquipementDefensif(new Philtre());
    }
}
