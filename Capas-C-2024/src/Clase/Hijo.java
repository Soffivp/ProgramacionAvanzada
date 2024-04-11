/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase;

/**
 *
 * @author SALAI
 */
public class Hijo {
    String nombre;
    Double edad;
    
    //edad mayor a o

    public Hijo() {
    }

    public Hijo(String nombre, Double edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getEdad() {
        return edad;
    }

    public void setEdad(Double edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Hijo: "+ nombre + ", edad= " + edad + "\n";
    }
    
    
    
    
}
