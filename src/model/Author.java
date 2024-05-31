package model;

import database.db;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Author {

    public Author() {
    }

    public Author(int id, String firstName, String lastName, String fieldOfExpertise, String about) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fieldOfExpertise = fieldOfExpertise;
        this.about = about;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFieldOfExpertise() {
        return fieldOfExpertise;
    }

    public void setFieldOfExpertise(String fieldOfExpertise) {
        this.fieldOfExpertise = fieldOfExpertise;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    private int id;
    private String firstName;
    private String lastName;
    private String fieldOfExpertise;
    private String about;

    // functions
    // insert a new author function
    public void addAuthor(String fname, String lname, String expertise, String about) {
        String insertQuery = "INSERT INTO author (firstName, lastName, expertise, about) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = db.getConnection().prepareStatement(insertQuery);

            ps.setString(1, fname);
            ps.setString(2, lname);
            ps.setString(3, expertise);
            ps.setString(4, about);

            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Author Added", "add author", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Author Not Added", "add author", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // update author by id function
    public void updateAuthor(int id, String fname, String lname, String expertise, String about) {
        String updateQuery = "UPDATE author SET firstName = ?, lastName = ?, expertise = ?, about = ? WHERE id = ?";
        try {
            PreparedStatement ps = db.getConnection().prepareStatement(updateQuery);

            ps.setString(1, fname);
            ps.setString(2, lname);
            ps.setString(3, expertise);
            ps.setString(4, about);
            ps.setInt(5, id);

            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Author Updated", "update author", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Author Not Updated", "update author", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // remove author by id function
    public void removeAuthor(int id) {
        String removeQuery = "DELETE FROM author WHERE id = ?";
        try {
            PreparedStatement ps = db.getConnection().prepareStatement(removeQuery);

            ps.setInt(1, id);

            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Author Deleted", "remove", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Author Not Deleted", "remove", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // function to populate arraylist with authors
    public ArrayList<Author> authorList() {
        ArrayList<Author> aList = new ArrayList<>();
                         
        model.Func_Class func = new Func_Class();

        try {
            
            ResultSet rs = func.getData("SELECT * FROM author");

            Author author;
            while (rs.next()) {
                author = new Author(rs.getInt("id"), rs.getString("firstName"), rs.getString("lastName"), rs.getString("expertise"), rs.getString("about"));
                aList.add(author);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }

        return aList;
    }
}
