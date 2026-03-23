/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Persistencia.DbConnect;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author mabardaji
 */
public class VistaConsola {
 
    public void run()
    {
        try {
            //Sempre que es vulgui BD
            DbConnect.loadDriver();
        
            printAllCountries();
        
        
        
        
        
        } catch (ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
        }
    }

    private void printAllCountries() {
        try {
            //crear la conexió amb la base de dades
            Connection conn = DbConnect.getConnection();
            if (conn!=null)
            {
                //sentencia 
                Statement stmt = conn.createStatement(); //objecte que podra executar instruccions sql a la connexió
                String query = "SELECT * FROM COUNTRIES where id = 1000";
                ResultSet rs = stmt.executeQuery(query);
                //recorrer el Resultset (Cursor)
                while(rs.next())
                {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    double surface = rs.getDouble("Surface");
                    System.out.println("Pais: " + name + " id: " + id + 
                      " extension: " + surface);
                }
                System.out.println("Fin listado");
                rs.close();
                stmt.close();
                conn.close();
            }
            
        } catch (SQLException ex) {
             System.err.println(ex.getMessage());
        }
    }
}
