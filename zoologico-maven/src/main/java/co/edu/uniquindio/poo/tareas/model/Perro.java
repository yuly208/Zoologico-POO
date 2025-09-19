package co.edu.uniquindio.poo.tareas.model;

public class Perro extends Animal {
    public Perro(String nombre, String raza) {
        super(nombre, raza);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: guau");
    }
}