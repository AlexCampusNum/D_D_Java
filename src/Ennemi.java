import Case.Case;
import Personnage.Personnage;

public class Ennemi implements Case {
    private String nom;
    private int forceDAttaque;
    private int pointDeVie;

    public Ennemi(String nom, int forceDAttaque, int pointDeVie) {
        this.nom = nom;
        this.forceDAttaque = forceDAttaque;
        this.pointDeVie = pointDeVie;
    }

    public void interagir(Personnage personnage){
        System.out.println("Vous vous retrouvez face à un " + nom);
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
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
