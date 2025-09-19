package co.edu.uniquindio.poo.tareas.model;

public class Pato extends Animal {
    public Pato(String nombre, String raza) {
        super(nombre, raza);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: cuack");
    }
}