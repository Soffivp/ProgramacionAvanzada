/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Clase.Cliente;
import java.util.regex.Pattern;

/**
 *
 * @author UTPL
 */
public class LCliente {
    //Metodos de verificacion de clases o procesos}

    public static boolean validarCedula(Cliente obj) {
        //define expresion regular para numeros
        // String regex = "[0-9]+{10}";
        String regex = "\\d{10}";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(obj.cedula).matches();
    }

    public static boolean validarCorreo(Cliente obj) {
        //define expresion regular para numeros
        // String regex = "[0-9]+{10}";
        String regex = "[A-Za-z0-9]+@[a-z]+\\.[a-z]+";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(obj.email).matches();
    }

    public static boolean validarDireccion(Cliente obj) {
        //define expresion regular para numeros
        // String regex = "[0-9]+{10}";
        String regex = "(A-Za-z)\\\\(\\s+\\1)";
        Pattern pattern = Pattern.compile(regex);
        String dir = obj.direccion.toString();
        System.out.println(dir);
        return pattern.matcher(dir).matches();
    }
}
