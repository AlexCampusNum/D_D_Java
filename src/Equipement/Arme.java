package Equipement;

import Case.Case;
import Personnage.Personnage;

public class Arme  extends EquipementOffensif{
    public Arme() {
        this.setType("Arme");
        this.setNivDAttaque(3);
        this.setNom("Massue");
    }

    public void interagir(Personnage personnage) {

    }


}
