/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase;

/**
 *
 * @author UTPL
 */
public class Cliente {
    public String cedula;
    public String nombre;
    public String apellidos;
    public Direcciones direccion;
    public String email;
    //ArrayList<Direcciones> listaDirecciones;

    public Cliente() {
    }

    public Cliente(String cedula, String nombre, String apellidos, Direcciones direccion,String email) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.email = email;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Direcciones getDireccion() {
        return direccion;
    }

    public void setDireccion(Direcciones direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Datos Usuario:\n" + "cedula= " + cedula + ", nombre= " + nombre + ", apellidos= " + apellidos + "\n" +
                "correo= " + email + "dirección= " + direccion;
    }
    
   
  
    
}
