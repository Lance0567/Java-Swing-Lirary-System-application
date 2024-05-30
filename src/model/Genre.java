package model;

import database.db;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Genre {

    // constructors
    public Genre() {
    }

    ;

    public Genre(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int id;
    private String name;

    // functions
    // insert a new genre function
    public void addGenre(String name) {
        String insertQuery = "INSERT INTO book_genres (name) VALUES (?)";
        try {
            PreparedStatement ps = db.getConnection().prepareStatement(insertQuery);

            ps.setString(1, name);
            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Genre Added", "add genre", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Genre Not Added", "add genre", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // update genre by id function
    public void updateGenre(int id, String name) {
        String updateQuery = "UPDATE book_genres SET name = ? WHERE id = ?";
        try {
            PreparedStatement ps = db.getConnection().prepareStatement(updateQuery);

            ps.setString(1, name);
            ps.setInt(2, id);

            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Genre Updated", "update genre", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Genre Not Updated", "update genre", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // remove genre by id function
    public void removeGenre(int id) {
        String removeQuery = "DELETE FROM book_genres WHERE id = ?";
        try {
            PreparedStatement ps = db.getConnection().prepareStatement(removeQuery);

            ps.setInt(1, id);

            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Genre Deleted", "remove", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Genre Not Deleted", "remove", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // function to populate arraylist with genres
    public ArrayList<Genre> genreList() {
        ArrayList<Genre> gList = new ArrayList<>();

        String selectQuery = "SELECT * FROM book_genres";
        ResultSet rs;
        PreparedStatement ps;

        try {
            ps = db.getConnection().prepareStatement(selectQuery);
            rs = ps.executeQuery();

            Genre genre;
            while (rs.next()) {
                genre = new Genre(rs.getInt("id"), rs.getString("name"));
                gList.add(genre);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }

        return gList;
    }
}
