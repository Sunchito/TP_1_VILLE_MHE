package net.ent.etrs.tpville.model.entities;


/*
------Capitale------
 */


public class Capitale extends Ville{


    private Monument monument;

    public Monument getMonument() {
        return monument;
    }

    public void setMonument(Monument monument) {
        this.monument = monument;
    }

    @Override
    public String toString() {
        return "Capitale{" +
                "monument=" + monument +
                "} " + super.toString();
    }

    public Capitale(String ville) {
        super(ville);
    }
}
