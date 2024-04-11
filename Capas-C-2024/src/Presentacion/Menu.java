/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentacion;

import Clase.Cliente;
import Clase.Direcciones;
import Clase.Hijo;
import Logica.LCliente;
import Logica.LHijos;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author SALAI
 */
public class Menu {

    static Cliente objCliente = new Cliente();
    static LCliente objLCliente = new LCliente();
    static LHijos objLHijo = new LHijos();
    static Hijo objHijo = new Hijo();
    static ArrayList<Hijo> Lhijos = Lhijos = new ArrayList<>();
    static String aux;
    static double auxn;
    static Scanner scan = new Scanner(System.in);
    static Direcciones dir = new Direcciones();
    static int nhijos;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int op = 0;
        String aux;
        System.out.println("1. Ingresar Cliente");
        System.out.println("2. Ingresar Direccion");
        System.out.println("3. Ingresar Hijos");
        System.out.println("4. Listar");
        System.out.println("5. Salir \n");

        aux = scan.nextLine();
        op = Integer.parseInt(aux);

        do {
            switch (op) {
                case 1:
                    ingresarCliente(objCliente);
                    break;
                case 2:
                    ingresarDireccion(objCliente);
                    break;
                case 3:
                    ingresarHijos(objCliente);
                    break;
                case 4:

                    break;
                case 5:

                    break;
                default:
                    throw new AssertionError();
            }
        } while (op != 0);
    }

    private static void ingresarCliente(Cliente obj) {
        if (obj != null) {
            System.out.println("Ingrese la cedula del usuario");
            aux = scan.nextLine();
            obj.setCedula(aux);
            System.out.println("Ingrese su nombre");
            aux = scan.nextLine();
            obj.setNombre(aux);
            //scan.nextLine();
            System.out.println("Ingrese su apellido");
            aux = scan.nextLine();
            obj.setApellidos(aux);
            //scan.nextLine();
            System.out.println("Ingrese su correo");
            aux = scan.nextLine();
            obj.setEmail(aux);

        }
    }

    private static void ingresarDireccion(Cliente objCliente) {
        System.out.println("Ingrese su calle principal");
        aux = scan.nextLine();
        dir.setCalle1(aux);
        System.out.println("Ingrese su calle secundaria");
        aux = scan.nextLine();
        dir.setCalle2(aux);
        objCliente.setDireccion(dir);
    }

    private static void ingresarHijos(Cliente objCliente) {

        System.out.println("Ingrese el numero de hijos que tiene");
        nhijos = scan.nextInt();

        for (int i = 0; i < nhijos; i++) {
            System.out.println("Ingrese el nombre de su hijo");
            aux = scan.nextLine();
            objHijo.setNombre(aux);
            scan.nextLine();
            System.out.println("Ingrese la edad de su hijo");
            auxn = scan.nextDouble();
            objHijo.setEdad(auxn);

            Lhijos.add(objHijo);
            objCliente.setHijos(Lhijos);

        }
    }

}
