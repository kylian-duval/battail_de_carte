package fr.kylian.BatailleDeCartes;

import fr.kylian.BatailleDeCartes.Carte;

public class Joueur {

   private int ScoreJoueur = 0;
   private Carte[] CarteJoueur = new Carte[9];

   public Carte TireUneCarte(int i){

        return CarteJoueur[i];
   }

   public void RecupPaquetJoueur(Carte[] carteEnMain) {
        CarteJoueur = carteEnMain;
   }

   public void SetScoreJoueur(int score){
       this.ScoreJoueur+= score;
   }

   public int GetScoreJoueur(){
       return this.ScoreJoueur;
   }




}
