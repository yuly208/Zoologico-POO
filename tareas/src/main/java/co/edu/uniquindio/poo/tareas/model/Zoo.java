package co.edu.uniquindio.poo.tareas.model;

import java.util.ArrayList;
import java.util.Scanner;


public class Zoo {

	private String nombre;
	private String direccion;
	private String nit;
	private ArrayList<Animal> listaAnimales;
	
	public Zoo(String nombre,String direccion,String nit) {
		
		this.nombre=nombre;
		this.direccion=direccion;
		this.nit=nit;
		this.listaAnimales=new ArrayList<>();
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion=direccion;
	}
	
	public String getNit() {
		return nit;
	}
	
	public void setNit(String nit) {
		this.nit=nit;
	}
	
	public ArrayList<Animal> getListaAnimales(){
		return listaAnimales;
	}
	
	public void setListaAnimales(ArrayList<Animal> listaAnimales) {
		this.listaAnimales=listaAnimales;
	}
	
	
	
	public Animal buscarAnimales(String nombre) {
		
		for(Animal a: listaAnimales) {
			if(a.getNombre().equalsIgnoreCase(nombre))
			{
				
				return a;
			}
			
		}
		
		return null;
	
	}
	
	//CRUD
	
	//Registrar
	
	public String registrarAnimal(Animal animal){
        String resultado = "";

        if(buscarAnimales(animal.getNombre()) == null){
            listaAnimales.add(animal);
            resultado = "Registro exitoso";
        }else{
            resultado = "Ya existe el animal con este nombre";
        }
        return resultado;
    }
	
	
	
	
	
	  // Buscar

   
	public Animal buscarAnimal(String nombre) {
	 for(Animal a: listaAnimales) {
		 if(a.getNombre().equalsIgnoreCase(nombre)) {
			 return a;
		 }
	 
	 }
	
	return null;
	
	
		
		
	}
	

     //Update
	public void actualizarAnimal(String nombre) {
	    Scanner sc = new Scanner(System.in);

	    Animal animal = buscarAnimal(nombre);

	    if (animal != null) {
	        System.out.print("Dame el nuevo nombre: ");
	        String nuevoNombre = sc.nextLine();
	        animal.setNombre(nuevoNombre);
	        System.out.println("El animal fue actualizado.");
	    } else {
	        System.out.println("No se encontró un animal con ese nombre.");
	    }
	}

	
    
    //remove
   
     public String removerAnimal(Animal animal){
    	 
    	 String resultado="";
    	 
      if(buscarAnimales(animal.getNombre())!=null){
    	  
         listaAnimales.remove(animal);
      
         resultado="el animal ha sido removido de la lista exitosamente";
      
         
      }
      else {
    	  
    	  resultado="el animal no ha sido encontrado";
    	  
      }
         return resultado;
      }
    	 
    		  
    	 
    	 
 
}
