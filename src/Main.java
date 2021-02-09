import models.Animal;
import models.Chien;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("toto", 22);
        Chien chien = new Chien("toti", 33, true);

        faireSeDeplacer(chien);

    }

    public static void faireSeDeplacer(Animal animal){
        animal.seDeplacer();
    }

}
