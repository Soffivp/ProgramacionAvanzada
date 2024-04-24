/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author sofiv
 */
public class Cliente {
    int idCli;
    String cedula;
    String nombres;
    String apellidos;
    Esposa esposa;
    ArrayList<Direccion> direc;

    public Cliente() {
    }

    public Cliente(int idCli, String cedula, String nombres, String apellidos) {
        this.idCli = idCli;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Esposa getEsposa() {
        return esposa;
    }

    public void setEsposa(Esposa esposa) {
        this.esposa = esposa;
    }

    public ArrayList<Direccion> getDirec() {
        return direc;
    }

    public void setDirec(ArrayList<Direccion> direc) {
        this.direc = direc;
    }

    @Override
    public String toString() {
        return "Cliente" + "idCli=" + idCli + ", cedula=" + cedula + ", nombres=" + nombres + ", apellidos=" + apellidos;
    }
    
    
    
}
