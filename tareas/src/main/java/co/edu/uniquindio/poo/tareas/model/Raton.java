package co.edu.uniquindio.poo.tareas.model;

public class Raton extends Animal {
    public Raton(String nombre, String raza) {
        super(nombre, raza);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: quizz");
    }
}
