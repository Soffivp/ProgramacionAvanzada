/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Clase.Cliente;
import java.util.regex.Pattern;

/**
 *
 * @author SALAI
 */
public class LHijos {

    public static boolean validarEdad(Cliente obj) {
            if (obj.getHijos().get(0).getEdad()> 0) {
                return true;
            } else {
                return false;
            }
        
      

    }

}
