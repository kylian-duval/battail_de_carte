package fr.kylian.BatailleDeCartes;

import java.util.Scanner;



public class Bataille {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //création des joueurs
        Joueur joueur1 = new Joueur();
        Joueur joueur2 = new Joueur();


        //initialise le paquet de carte
        Carte[] paquet = new Carte[10];
        Carte[] paquetJoueur1 = new Carte[10];
        Carte[] paquetJoueur2 = new Carte[10];
        Carte CarteVinqueur;

        //tableau de couleur
        String[] TabCouleur = {"Noir","Rouge"};



        //rand pour Math.random()
        int max = 1;
        int min = 0;
        int range = max - min + 1;
        int rand;

        for(int i = 0; i < paquet.length; i++){
             rand = (int)(Math.random() * range) + min;
            paquet[i] = new Carte(TabCouleur[rand], (i+1));
        }


        //rand entre 0 et 9 pour Math.random()
        max = 9;
        min = 0;
        range = max - min + 1;
        //paquet joueur 1
        for (int i = 0; i < paquetJoueur1.length; i++) {
            rand = (int)(Math.random() * range) + min;
            paquetJoueur1[i] = paquet[rand];
        }
        joueur1.RecupPaquetJoueur(paquetJoueur1);

        //paquet joueur 2
        for (int i = 0; i < paquetJoueur1.length; i++) {
            rand = (int)(Math.random() * range) + min;
            paquetJoueur2[i] = paquet[rand];
        }
        joueur2.RecupPaquetJoueur(paquetJoueur2);

        System.out.println("--------------------------------------------------");
        System.out.println("Distribution Carte terminer");
        System.out.println("--------------------------------------------------");
        System.out.println("la parti commence");

        //debut de la parti
        for(int i = 0; i < paquet.length; i++){
            System.out.println("--------------------------------------------------");
            System.out.println("Manche:"+(i+1));
            Carte carte1 = joueur1.TireUneCarte(i);
            Carte carte2 = joueur2.TireUneCarte(i);
            System.out.println("Carte joueur1--->"+ carte1.getValeur()+" "+carte1.getCouleur());
            System.out.println("Carte joueur2--->"+ carte2.getValeur()+" "+carte2.getCouleur());
            System.out.println("Score: Joueur1:"+ joueur1.GetScoreJoueur()+" Score: Joueur2:"+joueur2.GetScoreJoueur());
            CarteVinqueur = carte1.comparer(carte1, carte2);
            if(CarteVinqueur.getValeur() == carte1.getValeur()){
                System.out.println("Victoire Joueur 1 pour cette Manque");
                joueur1.SetScoreJoueur(1);
            } else if (CarteVinqueur.getValeur() == carte2.getValeur()) {
                System.out.println("Victoire Joueur 2 pour cette Manque");
                joueur2.SetScoreJoueur(1);
            }
            System.out.println("--------------------------------------------------");
            System.out.println("Appuyer sur la touche entrer pour passer a la manche suivante......");
            scanner.nextLine();


        }


        System.out.println("--------------------------------------------------");
        System.out.println("Fin de la Parti");
        //fin de la parti

        //comparésion des score des joueur
        if(joueur1.GetScoreJoueur() == joueur2.GetScoreJoueur())
            System.out.println("Joueur1 et Joueur2 son a égalité !!!!!!");
        else if(joueur1.GetScoreJoueur() > joueur2.GetScoreJoueur())
            System.out.println("Joueur1 remporte la parti !!!!!!");
        else if (joueur1.GetScoreJoueur() < joueur2.GetScoreJoueur())
            System.out.println("Joueur2 remporte la parti !!!!!!");
        System.out.println("--------------------------------------------------");
        System.out.println("Appuyer sur la touche entrer pour terminer......");
        scanner.nextLine();
    }
}
