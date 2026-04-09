/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Persistencia.Country;
import Persistencia.DbConnect;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        
            //printAllCountries(10, 78,"AA");
            printAllCountriesPrepared(5, 5000);
            insertCountry();
            printAllCountriesPrepared(1, 1);

        } catch (ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
        }
    }

    private void printAllCountries(int id1, int esperanza, String cap) {
        try {
            //crear la conexió amb la base de dades
            Connection conn = DbConnect.getConnection();
            if (conn!=null)
            {
                //sentencia 
                Statement stmt = conn.createStatement(); //objecte que podra executar instruccions sql a la connexió
                String query = "SELECT * FROM COUNTRIES "
                        + "where id >= 10";
                String queryWhere = "SELECT * FROM COUNTRIES "
                        + "where id >= " + id1
                        + " and lifeexpectancy" + esperanza
                        + " and capital like '" + cap + "' ";
                System.out.println(query);
                ResultSet rs = stmt.executeQuery(query);
                //recorrer el Resultset (Cursor)
                while(rs.next()) //leer de una en una next
                {//recuperar totes les columnes
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    double surface = rs.getDouble("Surface");
                    int esperanzaVida = rs.getInt("lifeexpectancy");
                    System.out.println("Pais: " + name + " id: " + id + 
                      " extension: " + surface + " esperanza vida: "
                    + esperanzaVida);
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
    
    private void printAllCountriesPrepared(int id1, int habitantes) {
        try {
            //crear la conexió amb la base de dades
            Connection conn = DbConnect.getConnection();
            if (conn!=null)
            {//inhabitants mas del valor X
                String query = "SELECT * FROM COUNTRIES "
                        + "WHERE INHABITANTS >= ? "
                        + "AND ID > ? ; ";
                //prepareStatement 
                PreparedStatement pstmt = conn.prepareStatement(query);
                //asignar els valors que son variables
                pstmt.setInt(1, habitantes);
                pstmt.setInt(2, id1);
                
               
                
                System.out.println(query);
                ResultSet rs = pstmt.executeQuery();
                //recorrer el Resultset (Cursor)
                while(rs.next()) //leer de una en una next
                {//recuperar totes les columnes
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    double surface = rs.getDouble("Surface");
                    int esperanzaVida = rs.getInt("lifeexpectancy");
                    System.out.println("Pais: " + name + " id: " + id + 
                      " extension: " + surface + " esperanza vida: "
                    + esperanzaVida);
                }
               
                System.out.println("Fin listado");
                rs.close();
                pstmt.close();
                conn.close();
            }
            
        } catch (SQLException ex) {
             System.err.println(ex.getMessage());
        }
    }    

    private void insertCountry() {
        
        try {
            Connection conn = DbConnect.getConnection();
            //preguntar datos al usuario
            Country nuevo = new Country(100, "Ecuador", "Quito", 1000, 4000, 5000000, 81);
            
            String query = "INSERT INTO COUNTRIES "
                    + " (NAME,CAPITAL,SURFACE,INHABITANTS,PIB,LIFEEXPECTANCY) "
                    + " VALUES (?,?,?,?,?,?);";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, nuevo.getName());
            pstmt.setString(2, nuevo.getCapital());
            pstmt.setDouble(3, nuevo.getSurface());
            pstmt.setInt(4, nuevo.getInhabitants());
            pstmt.setDouble(5, nuevo.getPib());
            pstmt.setInt(6, nuevo.getLifeexpectancy());
            
            int filasAfectadas = pstmt.executeUpdate();
            System.out.println("Filas afectadas: " + filasAfectadas);
            pstmt.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(VistaConsola.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
