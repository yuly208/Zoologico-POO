package co.edu.uniquindio.poo.tareas.App;

import co.edu.uniquindio.poo.tareas.model.*;

public class Aplicacion {
    public static void main(String[] args) {
        Zoo zoologico = new Zoo("Zoo Armenia", "calle 19", "3116798");

        Animal gato = new Gato("kira", "siames");
        Animal perro = new Perro("paco", "criollo");
        Animal raton = new Raton("jerry", "Spiny");
        Animal conejo = new Conejo("bugs", "holandes");
        Animal pato = new Pato("lucas", "campbell");

        zoologico.registrarAnimal(pato);
        zoologico.registrarAnimal(conejo);
        zoologico.registrarAnimal(raton);
        zoologico.registrarAnimal(gato);
        zoologico.registrarAnimal(perro);

        System.out.println("Animales en el zoologico:");
        for (Animal a : zoologico.getListaAnimales()) {
            System.out.println(a);
            a.hacerSonido();
        }
    }
}