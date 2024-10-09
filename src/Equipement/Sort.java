package Equipement;

import Personnage.Personnage;

public class Sort extends EquipementOffensif {
    public Sort(String type, int nivDAttaque, String nom) {
        this.setType(type);
        this.setNivDAttaque(nivDAttaque);
        this.setNom(nom);
    }

    public void interagir(Personnage personnage) {
        System.out.println("Vous trouvez une " + getNom());
        if (this.getType().equals(personnage.getEquipementOffensif().getType())) {
            personnage.setEquipementOffensif(this);
            System.out.println("Vous équipez " + personnage.getNom() + " avec " + getNom());
        } else {
            System.out.println("Ce personnage ne peut pas équiper ce sort.");
        }
    }
}
