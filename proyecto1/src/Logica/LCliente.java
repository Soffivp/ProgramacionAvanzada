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
}
