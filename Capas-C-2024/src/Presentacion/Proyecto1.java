/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Presentacion;

import Clase.Cliente;
import Clase.Direcciones;
import Clase.Hijo;
import Logica.LCliente;
import Logica.LHijos;
import java.util.ArrayList;
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
        Direcciones dir = new Direcciones();
        LCliente objlcliente = new LCliente();
        LHijos objLHijo = new LHijos();
        Hijo objHijo = new Hijo();
        ArrayList<Hijo> Lhijos = Lhijos = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String aux;
        double auxn;
        int nhijos;
        String nom;
        String ap;

//        System.out.println("Ingrese la cedula del usuario");
//        aux = scan.nextLine();
//        obj.setCedula(aux);
//        System.out.println("Ingrese su nombre");
//        nom = scan.nextLine();
//        obj.setNombre(nom);
//        //scan.nextLine();
//        System.out.println("Ingrese su apellido");
//        ap = scan.nextLine();
//        obj.setApellidos(ap);
//        //scan.nextLine();
//        System.out.println("Ingrese su correo");
//        aux = scan.nextLine();
//        obj.setEmail(aux);
//        System.out.println("Ingrese su calle principal");
//        aux = scan.nextLine();
//        dir.setCalle1(aux);
//        System.out.println("Ingrese su calle secundaria");
//        aux = scan.nextLine();
//        dir.setCalle2(aux);
//        obj.setDireccion(dir);
       
//        System.out.println("Ingrese el numero de hijos que tiene");
//        nhijos = scan.nextInt();
//        
//      
//
//        for (int i = 0; i < nhijos; i++) {
//            System.out.println("Ingrese el nombre de su hijo");
//            aux = scan.nextLine();
//            objHijo.setNombre(aux);
//            scan.nextLine();
//            System.out.println("Ingrese la edad de su hijo");
//            auxn = scan.nextDouble();
//            objHijo.setEdad(auxn);
//
//            Lhijos.add(objHijo);
//            obj.setHijos(Lhijos);
//
//        }

        //scan.nextLine();
        if (objlcliente.validarCedula(obj)) {

            if (objlcliente.validarCorreo(obj)) {

                if (objlcliente.validarDireccion(obj)) {
                    ;
                    if (objLHijo.validarEdad(obj)) {
                        System.out.println(obj.toString());
                    } else {
                        System.out.println("Edad incorrecta incorrecta");
                    }

                } else {
                    System.out.println("Direccion incorrecta");
                }
            } else {
                System.out.println("Correo incorrecto");
            }
        } else {
            System.out.println("Cedula Incorrecta");
        }

    }

}
