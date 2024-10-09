package Case;

import Case.Case;
import Personnage.Personnage;

public class CaseVide implements Case {
    public void interagir(Personnage personnage) {
        System.out.println("Case vide, mais restez sur vos gardes");
    }
}
