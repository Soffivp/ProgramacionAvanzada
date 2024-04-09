/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase;

import java.util.ArrayList;

/**
 *
 * @author UTPL
 */
public class Direcciones {
    String calle1;
    String calle2;
    Direcciones direccion;
    String email;
    ArrayList<Direcciones> listaDirecciones;

    public Direcciones() {
    }

    public Direcciones(String calle1, String calle2, Direcciones direccion, ArrayList<Direcciones> listaDirecciones) {
        this.calle1 = calle1;
        this.calle2 = calle2;
        this.direccion = direccion;
        this.listaDirecciones = listaDirecciones;
    }

    public String getCalle1() {
        return calle1;
    }

    public void setCalle1(String calle1) {
        this.calle1 = calle1;
    }

    public String getCalle2() {
        return calle2;
    }

    public void setCalle2(String calle2) {
        this.calle2 = calle2;
    }

    public Direcciones getDireccion() {
        return direccion;
    }

    public void setDireccion(Direcciones direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Direcciones> getListaDirecciones() {
        return listaDirecciones;
    }

    public void setListaDirecciones(ArrayList<Direcciones> listaDirecciones) {
        this.listaDirecciones = listaDirecciones;
    }
    
    
}

