/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author sofiv
 */
public class Conexiones {
    
    
    public Connection con;
    public Connection getConnection () throws ClassNotFoundException, SQLException {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/programacionavanzada?user=root";
        Class.forName(driver);
            return DriverManager.getConnection(url,"root","soff");
    }
    public Connection AbrirConexion() throws ClassNotFoundException, SQLException{
        con = getConnection();
        return con;
    }
    public void CerrarConexion() throws SQLException{
       con.close();
    }
}
