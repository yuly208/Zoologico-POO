package co.edu.uniquindio.poo.tareas.model;

public class Conejo extends Animal {
    public Conejo(String nombre, String raza) {
        super(nombre, raza);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: sniff");
    }
}