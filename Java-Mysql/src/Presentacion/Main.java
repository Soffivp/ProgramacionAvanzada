/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Presentacion;

import BD.BDCliente;
import Clases.Cliente;
import Logica.LCliente;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sofiv
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static Cliente objcliente = new Cliente();
    static LCliente objlcliente = new LCliente();
    static BDCliente bdcliente = new BDCliente();

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
            throws ClassNotFoundException, SQLException {
        String opc;
        String aux;

        do {
            System.out.println("-----Menu-----");
            System.out.println("1) Ingresar Cliente");
            System.out.println("2) Buscar Cliente");
            System.out.println("3) Actualizar Cliente");
            System.out.println("4) Listar Cliente");
            System.out.println("5) Agregar Direccion");
            System.out.println("6) Agregar Esposa");
            System.out.println("7) Salir");
            System.out.print("Ingrese un opcion: ");
            opc = sc.nextLine();
            switch (opc) {
                case "1":
                    IngresarCliente();
                    break;

                case "2":
                    BuscarCliente();
                    break;

                case "3":
                    ActualizarCliente();
                    break;
                case "4":
                    ListarCliente();
                    break;
                case "5":
                    AgregarDireccion();
                    break;
                case "6":
                    Agregaresposa();
                    break;
                default:
                    System.out.println(
                            "Opción no válida");
            }

        } while (opc!= 7);
     
        
        

    

    

               

    private static void ActualizarCliente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void AgregarDireccion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void ListarCliente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void IngresarCliente() throws ClassNotFoundException, SQLException {

        Cliente objcliente = new Cliente();
        LCliente objLCliente = new LCliente();
        System.out.println("Ingrese la cedula");
        aux = sc.nextLine();
        objcliente.setCedula(aux);
        System.out.println("Ingrese los nombres");
        aux = sc.nextLine();
        objcliente.setNombres(aux);
        System.out.println("Ingrese los apellidos");
        aux = sc.nextLine();
        objcliente.setApellidos(aux);
        objLCliente.AgregarCliente(objcliente);

    }

    private static CLiente BuscarCliente() throws
            ClassNotFoundException, SQLException {
        Cliente objCliente = new Cliente();
        LCliente objLCliente = new LCliente();

        System.out.println("Ingrese la cedula");
        aux = sc.nextLine();
        objCliente.setCedula(aux);
        objLCliente.RecuperarClientes(objCliente);
        System.out.println(objCliente.toString());

        return objCliente;

    }

    private static void Agregaresposa() throws ClassNotFoundException, SQLException {
        BuscarCliente();
        System.out.println("DATOS DE LA ESPOSA");
        System.out.println("Ingrese la cedula");
        aux = sc.nextLine();
        objcliente.getEsposa().setCedula(aux);
        System.out.println("Ingrese los nombres");
        aux = sc.nextLine();
        objcliente.getEsposa().setNombre(aux);
        System.out.println("Ingrese los apellidos");
        aux = sc.nextLine();
        objcliente.getEsposa().setApellidos(aux);
        objlcliente.AgregarCliente(objcliente);

    }

}

}


