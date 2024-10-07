package Personnage;

import Equipement.Arme;
import Equipement.Bouclier;

public class Guerrier extends Personnage {

    public Guerrier(String nom) {
        super(nom, "Guerrier");
        this.setNiveauDeVie(10);
        this.setForceDAttaque(10);
        this.setEquipementOffensif(new Arme());
        this.setEquipementDefensif(new Bouclier());
    }
}
