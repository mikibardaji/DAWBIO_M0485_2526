/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author mabardaji
 */
public class LuchadorDAOBD {

    Connection conn;
    public LuchadorDAOBD() throws ClassNotFoundException {
        DbConnect.loadDriver(); //cargo una vez
    }
    
    public List<Luchador> getAll() throws SQLException {
         List<Luchador> dato = new ArrayList<>(); 
        
       conn = DbConnect.getConnection();
       
        if (conn != null) {
          String query = "SELECT * FROM luchadores";
          
            PreparedStatement pstmt = conn.prepareStatement(query);
            //si hay una consulta tendria que hacerse un pstmt.setString etc.
            
            ResultSet resultado = pstmt.executeQuery();
            
            while(resultado.next()){
                int id = resultado.getInt("idLicencia");
                String name = resultado.getString("nombre");
                int peso = resultado.getInt("peso");

                Luchador datos = new Luchador(id, name, peso);
                dato.add(datos);
            }
            resultado.close();
            pstmt.close();
            conn.close();
        }
      
      
         return dato;
    }
    
    public int altaLuchador(Luchador Wrestler) throws SQLException {
       
        conn = DbConnect.getConnection();
       
        if (conn != null)
        {
       
            String query = "INSERT INTO LUCHADORES (idLicencia,nombre,peso) VALUES (?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(query);

            pstmt.setInt(1, Wrestler.getIdLicencia());
            pstmt.setString(2, Wrestler.getNombre());
            pstmt.setInt(3, Wrestler.getPeso());
            int entero = pstmt.executeUpdate();
           
            pstmt.close();
            conn.close();
            return entero;
       
        }
    return 0;    
    }

    
    public int removeLuchador(Luchador borrado) throws SQLException {
        conn = DbConnect.getConnection();
       
        if(conn!=null){

            String query = "DELETE FROM LUCHADORES WHERE UPPER(NOMBRE) LIKE ? ";
               
            PreparedStatement pstmt = conn.prepareStatement(query);
            //si hay consulta tendria que hacerse un pstmt.setString etc...
           
            pstmt.setString(1, "%" + borrado.getNombre().toUpperCase() + "%");
           
            int confBorrado = pstmt.executeUpdate();
           
            pstmt.close();
            conn.close();
            return confBorrado;
        }
        return 0;
    }

    public List<Luchador> filtrarLuchadorPeso(int pesoMax) throws SQLException {
        //validacions respecte al enmatzematge 
        List<Luchador> todos = new LinkedList<>();
        conn = DbConnect.getConnection();
        if(conn!=null){
            String query = "SELECT * FROM luchadores "
                    + " WHERE PESO <= ?";
            System.out.println(query);
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, pesoMax);
            ResultSet cursor = pstmt.executeQuery();
            while (cursor.next())
            {
                int id = cursor.getInt("idLicencia");
                String name = cursor.getString("nombre");
                int peso = cursor.getInt("peso");
                
                Luchador escogido = new Luchador(id, name, peso);
                todos.add(escogido);
            }
            cursor.close();
            pstmt.close();
            conn.close();
            return todos;
        }
        else
        {
            throw new SQLException("Error en coneixion");
        }
        
    }


}
