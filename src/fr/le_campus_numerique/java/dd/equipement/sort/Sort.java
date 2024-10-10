package fr.le_campus_numerique.java.dd.equipement.sort;

import fr.le_campus_numerique.java.dd.potion.dossier.Case;
import fr.le_campus_numerique.java.dd.equipement.EquipementOffensif;
import fr.le_campus_numerique.java.dd.personnage.*;

public class Sort extends EquipementOffensif implements Case {
    public Sort(String type, int nivDAttaque, String nom) {
        this.setType(type);
        this.setNivDAttaque(nivDAttaque);
        this.setNom(nom);
    }

    public void interagir(Personnage personnage) {
        System.out.println("Vous trouvez une " + getNom());
        if (personnage instanceof Magicien && this.getNivDAttaque() > personnage.getEquipementOffensif().getNivDAttaque()) {
            personnage.setEquipementOffensif(this);
            System.out.println(personnage.getNom() + " est maintenant équipé avec le sort " + getNom());
        } else {
            System.out.println("Ce personnage ne peut pas s'équiper de ce sort.");
        }
    }
}
