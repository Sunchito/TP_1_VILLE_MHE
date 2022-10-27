package net.ent.etrs.tpville;

import net.ent.etrs.tpville.model.entities.Ville;

import java.util.ArrayList;
import java.util.List;


/*
------Main------
@author Maxime Marchione.
@version v1.0
 */


public class Main {
    public static void main(String[] args) {

        //CREATION DE VILLES
        Ville v1 = new Ville(50000, "Bayonne");
        Ville v2 = new Ville(2800000, "Rôme");
        Ville v3 = new Ville(13000000, "Tokyo");
        Ville v4 = new Ville(890000, "Marseille");
        Ville v5 = new Ville(70000, "Ajaccio");


        //AFFICHER CATEGORIES VILLES
/**    System.out.println(v1.getCategorie());
       System.out.println(v2.getCategorie());
       System.out.println(v3.getCategorie());
       System.out.println(v4.getCategorie());
       System.out.println(v5.getCategorie());
*/

        //INITIALISATION LISTE
        List <Ville> mesVilles = new ArrayList<>();
        mesVilles.add(v1);
        mesVilles.add(v2);
        mesVilles.add(v3);
        mesVilles.add(v4);
        mesVilles.add(v5);

        //AFFICHER LA LISTE AVEC LE NOM, NB HABITANTS ET LA CATEGORIE DES VILLES
        System.out.println(mesVilles + "\n");


        //COMPARER NB HABITANTS
        System.out.println("|------" + v4.comparer(v1) + "------|");

    }
}