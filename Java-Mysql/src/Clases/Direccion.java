/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author sofiv
 */
public class Direccion {
    int idDir;
    String calle1;
    String calle2;

    public Direccion() {
    }

    public Direccion(int idDir, String calle1, String calle2) {
        this.idDir = idDir;
        this.calle1 = calle1;
        this.calle2 = calle2;
    }

    public int getIdDir() {
        return idDir;
    }

    public void setIdDir(int idDir) {
        this.idDir = idDir;
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

    @Override
    public String toString() {
        return "Direccion{" + "idDir=" + idDir + ", calle1=" + calle1 + ", calle2=" + calle2 + '}';
    }
    
    
    
}
