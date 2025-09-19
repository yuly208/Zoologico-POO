package co.edu.uniquindio.poo.tareas.model;

public class Gato extends Animal {
    public Gato(String nombre, String raza) {
        super(nombre, raza);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: miau");
    }
}
