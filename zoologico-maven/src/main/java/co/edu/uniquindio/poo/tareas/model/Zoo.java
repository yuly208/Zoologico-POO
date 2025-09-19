package co.edu.uniquindio.poo.tareas.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    private String nombre;
    private String direccion;
    private String nit;
    private ArrayList<Animal> listaAnimales;

    public Zoo(String nombre, String direccion, String nit) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nit = nit;
        this.listaAnimales = new ArrayList<>();
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getNit() { return nit; }
    public void setNit(String nit) { this.nit = nit; }

    public ArrayList<Animal> getListaAnimales() { return listaAnimales; }

    // CRUD

    public String registrarAnimal(Animal animal) {
        if(buscarAnimal(animal.getNombre()) == null) {
            listaAnimales.add(animal);
            return "Registro exitoso";
        } else {
            return "Ya existe un animal con este nombre";
        }
    }

    public Animal buscarAnimal(String nombre) {
        for(Animal a : listaAnimales) {
            if(a.getNombre().equalsIgnoreCase(nombre)) {
                return a;
            }
        }
        return null;
    }

    public void actualizarAnimal(String nombre) {
        Scanner sc = new Scanner(System.in);
        Animal animal = buscarAnimal(nombre);
        if(animal != null) {
            System.out.print("Dame el nuevo nombre: ");
            String nuevoNombre = sc.nextLine();
            animal.setNombre(nuevoNombre);
            System.out.println("El animal fue actualizado.");
        } else {
            System.out.println("No se encontró un animal con ese nombre.");
        }
    }

    public String removerAnimal(Animal animal) {
        if(listaAnimales.remove(animal)) {
            return "El animal ha sido removido exitosamente";
        } else {
            return "El animal no ha sido encontrado";
        }
    }
}