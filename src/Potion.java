import Case.Case;
import Personnage.Personnage;

public class Potion implements Case {

    private String type;
    private String nom;
    private int valeur;

    public Potion(String type, String nom, int valeur) {
        this.type = type;
        this.nom = nom;
        this.valeur = valeur;
    }

    public void interagir(Personnage personnage){

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }
}
