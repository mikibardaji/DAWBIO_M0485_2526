package dao;

import model.Wrestler;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import persistencia.DbConnect;

public class WrestlerDAO {

    Connection conn;


    public WrestlerDAO() throws SQLException, ClassNotFoundException {
        DbConnect.loadDriver();
        conn = DbConnect.getConnection();
        createTable();
    }

    //no era necessari pero el deixem aqui
    public void createTable() throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS wrestlers (" +
                "id INT PRIMARY KEY, " +
                "name VARCHAR(255), " +
                "weight DOUBLE, " +
                "category VARCHAR(50), " +
                "wins INT, " +
                "total_fights INT)";
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DbConnect.getConnection();
            stmt = conn.createStatement();
            stmt.execute(sql);
        } finally {
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        }
    }

    public boolean insertOrUpdateWrestler(Wrestler wrestler) throws SQLException {
        String selectSql = "SELECT id FROM wrestlers WHERE id = ?";
        
        PreparedStatement selectStmt = null;
    
        ResultSet rs = null;
        try {
            
            selectStmt = conn.prepareStatement(selectSql);
            selectStmt.setInt(1, wrestler.getId());
            rs = selectStmt.executeQuery();

            if (rs.next()) {
                actualitzarWrestler(wrestler);
                return false; // Updated
            } else {
                // Insert
                inserirWrestler(wrestler);
                return true; // Inserted
            }
        } finally {
            if (rs != null) rs.close();
            if (selectStmt != null) selectStmt.close();
            if (conn != null) conn.close();
        }
    }

    private void inserirWrestler(Wrestler wrestler) throws SQLException {
        PreparedStatement insertStmt = null;
        String insertSql = "INSERT INTO wrestlers (id, name, weight, category, wins, total_fights) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            insertStmt = conn.prepareStatement(insertSql);
            insertStmt.setInt(1, wrestler.getId());
            insertStmt.setString(2, wrestler.getName());
            insertStmt.setDouble(3, wrestler.getWeight());
            insertStmt.setString(4, wrestler.getCategory());
            insertStmt.setInt(5, wrestler.getWins());
            insertStmt.setInt(6, wrestler.getTotalFights());
            insertStmt.executeUpdate();
        } finally {
            if (insertStmt != null) try { insertStmt.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
    }

    private void actualitzarWrestler(Wrestler wrestler) throws SQLException {
        String updateSql = "UPDATE wrestlers SET name = ?, weight = ?, category = ?, wins = ?, total_fights = ? WHERE id = ?";
        PreparedStatement updateStmt = null;
        try {
            updateStmt = conn.prepareStatement(updateSql);
            updateStmt.setString(1, wrestler.getName());
            updateStmt.setDouble(2, wrestler.getWeight());
            updateStmt.setString(3, wrestler.getCategory());
            updateStmt.setInt(4, wrestler.getWins());
            updateStmt.setInt(5, wrestler.getTotalFights());
            updateStmt.setInt(6, wrestler.getId());
            updateStmt.executeUpdate();
        
        } finally {
            if (updateStmt != null) try { updateStmt.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
    }

    public List<Wrestler> getAllWrestlers() throws SQLException {
        List<Wrestler> wrestlers = new ArrayList<>();
        String sql = "SELECT * FROM wrestlers";
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Wrestler w = new Wrestler();
                w.setId(rs.getInt("id"));
                w.setName(rs.getString("name"));
                w.setWeight(rs.getDouble("weight"));
                //w.setCategory(rs.getString("category"));
                //no cal perque el category es calcula a partir del pes, així que es pot ometre i deixar que el mètode assignCategory() s'encarregui de posar la categoria correcta
                w.setWins(rs.getInt("wins"));
                w.setTotalFights(rs.getInt("total_fights"));
                wrestlers.add(w);
            }
        } finally {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        }
        return wrestlers;
    }

    public Wrestler getWrestlerById(int id) throws SQLException {
        String sql = "SELECT * FROM wrestlers WHERE id = ?";
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            if (rs.next()) {
                Wrestler w = new Wrestler();
                w.setId(rs.getInt("id"));
                w.setName(rs.getString("name"));
                w.setWeight(rs.getDouble("weight"));
                //w.setCategory(rs.getString("category"));
                w.setWins(rs.getInt("wins"));
                w.setTotalFights(rs.getInt("total_fights"));
                return w;
            }
        } finally {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        }
        return null;
    }

    public void updateWrestlerStats(int id, int wins, int totalFights) throws SQLException {
        String sql = "UPDATE wrestlers SET wins = ?, total_fights = ? WHERE id = ?";
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, wins);
            stmt.setInt(2, totalFights);
            stmt.setInt(3, id);
            stmt.executeUpdate();
        } finally {
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        }
    }

    public List<Wrestler> getWrestlersByCategory(String category) throws SQLException {
        List<Wrestler> wrestlers = new ArrayList<>();
        String sql = "SELECT * FROM wrestlers WHERE category = ? ORDER BY wins DESC";
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, category);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Wrestler w = new Wrestler();
                w.setId(rs.getInt("id"));
                w.setName(rs.getString("name"));
                w.setWeight(rs.getDouble("weight"));
               // w.setCategory(rs.getString("category"));
                w.setWins(rs.getInt("wins"));
                w.setTotalFights(rs.getInt("total_fights"));
                wrestlers.add(w);
            }
        } finally {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        }
        return wrestlers;
    }
}