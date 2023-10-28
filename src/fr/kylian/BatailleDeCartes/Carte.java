package fr.kylian.BatailleDeCartes;

public class Carte {

    private String Couleur;
    private int Valeur;


    public Carte(String couleur, int valeur){

        this.Couleur = couleur;
        this.Valeur = valeur;
    }

    public String getCouleur() {
        return this.Couleur;
    }

    public void setCouleur(String couleur) {
        this.Couleur = couleur;
    }

    public int getValeur() {
        return this.Valeur;
    }

    public void setValeur(int valeur) {
        this.Valeur = valeur;
    }


    public Carte comparer(Carte carte1, Carte carte2) {

        if(carte1.getValeur() > carte2.getValeur())
            return carte1;
        else
            return carte2;
    }
}


