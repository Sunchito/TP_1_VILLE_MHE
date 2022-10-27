package net.ent.etrs.tpville.model.entities;

/*
------Ville------
 */


public class Ville {

    //ATTRIBUTS
    private int nbHabitants;
    private String nomPays;
    private char categorie;
    private String nom;


    //TO STRING
    @Override
    public String toString() {
        return nom;
    }


    //CONSTRUCTEUR
    public Ville(String ville) {
        this.setNom(ville);
    }

    public Ville(int nbHabitants, String nom) {

        this.nbHabitants = nbHabitants;
        this.nom = nom;
        this.setCategorie();
        this.decrisToi();
    }


    //GETTER ET SETTER

    public int getNbHabitants() {
        return nbHabitants;
    }

    public void setNbHabitants(int nbHabitants) {
        this.nbHabitants = nbHabitants;
    }

    public String getNomPays() {
        return nomPays;
    }

    public void setNomPays(String nomPays) {
        this.nomPays = nomPays;
    }

    public char getCategorie() {
        return categorie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom.toUpperCase();
    }

    /**
     * Définit la catégorie de la ville en fonction de son nombre d'habitants -->
     * ? : >= 0
     * A : >= 1000
     * B : >= 10 000
     * C : >= 100 000
     * D : >= 500 000
     * E : >= 1 000 000
     * F : >= 5 000 000
     * G : >= 10 000 000
     */
    private void setCategorie() {
        if (this.nbHabitants >= 10000000) {
            this.categorie = 'G';
        } else if (this.nbHabitants >= 5000000) {
            this.categorie = 'F';
        } else if (this.nbHabitants >= 1000000) {
            this.categorie = 'E';
        } else if (this.nbHabitants >= 500000) {
            this.categorie = 'D';
        } else if (this.nbHabitants >= 100000) {
            this.categorie = 'C';
        } else if (this.nbHabitants >= 10000) {
            this.categorie = 'B';
        } else if (this.nbHabitants >= 1000) {
            this.categorie = 'A';
        } else if (this.nbHabitants >= 0) {
            this.categorie = '?';
        }
    }


    //COMPARER
    public String comparer(Ville autreVille) {
        String str = new String();
        String str2;

        if (autreVille.getNbHabitants() > this.getNbHabitants()) {
            str = autreVille.getNom() + "est une ville plus peuplée que " + this.nom;
        } else {
            str = this.nom + " est une ville plus peuplée que " + autreVille.getNom();
        }
        return str;
}

    //METHODE DECRIS TOI
    public void decrisToi(){
        System.out.printf("\n%s est une ville de %s habitant(s), => elle est donc de catégorie : %s \n-----------------------------------------------------------------------------------\n", this.nom, this.nbHabitants, this.categorie);
    }

}






