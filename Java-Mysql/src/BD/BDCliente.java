/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD;

import Clases.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author sofiv
 */
public class BDCliente {

    Conexiones bdConexion = new Conexiones();
    Cliente objcliente = new Cliente();

    public int InsertarCliente(Cliente objcliente) throws ClassNotFoundException, SQLException {
        String Sentencia = "Insert into Clientes (Cedula,Nombres,Apellidos) "
                + "values (?,?,?)";
        PreparedStatement ps = bdConexion.getConnection().prepareStatement(Sentencia);
        ps.setString(1, objcliente.getCedula());
        ps.setString(2, objcliente.getNombres());
        ps.setString(3, objcliente.getApellidos());
        return ps.executeUpdate(); //1 si se inserta -- 0 si no inserta
    }

    public ResultSet RecuperarCliente(Cliente objCliente) throws ClassNotFoundException, SQLException {
        String Sentencia = "SELECT * FROM Clientes where Cedula = ?";
        PreparedStatement ps = bdConexion.getConnection().prepareStatement(Sentencia);
        ps.setString(1, objcliente.getCedula());
        return ps.executeQuery();
    }
    
    
    
        public int InsertarEsposa(Cliente objcliente) throws ClassNotFoundException, SQLException {
        String Sentencia = "Insert into Esposa (Cedula,Nombres,Apellidos) "
                + "values (?,?,?,?)";
        PreparedStatement ps = bdConexion.getConnection().prepareStatement(Sentencia);
        ps.setString(1, objcliente.getEsposa().getCedula());
        ps.setString(2, objcliente.getEsposa().getNombre());
        ps.setString(3, objcliente.getEsposa().getApellidos());
        ps.setInt(4, objcliente.getIdCli());
        return ps.executeUpdate(); //1 si se inserta -- 0 si no inserta
    }
    
  
}
