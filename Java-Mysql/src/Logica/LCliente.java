/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import BD.BDCliente;
import Clases.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author sofiv
 */
public class LCliente {

    static BDCliente objbd = new BDCliente();
    // static Cliente objCliente = new Cliente();

    public void AgregarCliente(Cliente objcliente) 
            throws ClassNotFoundException, SQLException {
        objbd.InsertarCliente(objcliente);

    }

    public static void ObtenerCliente(Cliente objcliente) 
            throws ClassNotFoundException, SQLException {
        //TRABAJPO de los algoritmos
        ResultSet rs = objbd.RecuperarCliente(objcliente);
        while (rs.next()) {
            objcliente.setCedula(rs.getString(2));
            objcliente.setNombres(rs.getString(3));
        }
        rs.close();
    }

    public static void RecuperarClientes(Cliente objcliente)
            throws ClassNotFoundException, SQLException {
        //TRABAJPO de los algoritmos
        ResultSet rs = objbd.RecuperarCliente(objcliente);
        while (rs.next()) {
            objcliente.setIdCli(rs.getString(1));
            objcliente.setNombres(rs.getString(3));
            objcliente.setApellidos(rs.getString(4));
        }
        rs.close();

    }

    public void AgregarEsposa(Cliente objcliente)
            throws ClassNotFoundException, SQLException {
        objbd.InsertarEsposa(objcliente);

    }
}
