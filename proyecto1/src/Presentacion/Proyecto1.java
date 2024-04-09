/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Presentacion;

import Clase.Cliente;
import Logica.LCliente;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * 9/04/2024
 *
 * @author UTPL
 */
public class Proyecto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente obj = new Cliente();
        LCliente objlcliente = new LCliente();
        Scanner scan = new Scanner(System.in);
        String ced;
        String nom;
        String ap;

        System.out.println("Ingrese la cedula del usuario");
        ced = scan.nextLine();
        obj.setCedula(ced);
        System.out.println("Ingrese su nombre");
        nom = scan.nextLine();
        obj.setNombre(nom);
        //scan.nextLine();
        System.out.println("Ingrese su apellido");
        ap = scan.nextLine();
        obj.setApellidos(ap);
        scan.nextLine();

        if (objlcliente.validarCedula(obj)) {
            System.out.println(obj.toString());
        } else {
            System.out.println("Cedula Incorrecta");
        }

    }

}
