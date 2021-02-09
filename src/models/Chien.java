package models;

import utils.Utils;

public class Chien extends Animal {

    boolean isLabrador;

    public Chien(String nom, int age, boolean isLabrador) {
        super(nom, age);
        this.isLabrador = isLabrador;
    }

    @Override
    public void seDeplacer() {
        Utils.aff("Je me déplace comme un chien");
    }

    public void aboyer(){

    }

}
