package fr.le_campus_numerique.java.dd.equipement.philtre;

import fr.le_campus_numerique.java.dd.caseDd.Case;
import fr.le_campus_numerique.java.dd.equipement.EquipementDefensif;
import fr.le_campus_numerique.java.dd.personnage.*;

public class Philtre extends EquipementDefensif implements Case {
    public Philtre(String type, int nivDefense, String nom) {
        this.setType(type);
        this.setNivDefense(nivDefense);
        this.setNom(nom);
    }

    public void interagir(Personnage personnage) {
        System.out.println("Vous trouvez une " + getNom());
        if (personnage instanceof Magicien && this.getNivDefense() > personnage.getEquipementDefensif().getNivDefense()) {
            personnage.setEquipementDefensif(this);
            System.out.println(personnage.getNom() + " est maintenant équipé avec un " + getNom());
        } else {
            System.out.println("Ce personnage ne peut pas équiper ce philtre.");
        }
    }
}
