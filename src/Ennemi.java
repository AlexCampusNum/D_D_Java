import Case.Case;
import Personnage.Personnage;

public class Ennemi implements Case {
    private String nom;
    private int nivDefense;
    private int forceDAttaque;
    private int pointDeVie;

    public Ennemi(String nom, int nivDefense, int forceDAttaque, int pointDeVie) {
        this.nom = nom;
        this.nivDefense = nivDefense;
        this.forceDAttaque = forceDAttaque;
        this.pointDeVie = pointDeVie;
    }

    public void interagir(Personnage personnage){

    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNivDefense() {
        return nivDefense;
    }

    public void setNivDefense(int nivDefense) {
        this.nivDefense = nivDefense;
    }

    public int getForceDAttaque() {
        return forceDAttaque;
    }

    public void setForceDAttaque(int forceDAttaque) {
        this.forceDAttaque = forceDAttaque;
    }

    public int getPointDeVie() {
        return pointDeVie;
    }

    public void setPointDeVie(int pointDeVie) {
        this.pointDeVie = pointDeVie;
    }
}
