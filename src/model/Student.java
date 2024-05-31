package model;

import database.db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Student {
    // Fields
    private int id;
    private String studentNumber;
    private String fullName;
    private String emailAddress;
    private String phoneNumber;
    private String year;
    private String course;
    private String gender;
    private byte[] profilePicture;

    // Constructors
    public Student(int id, String studentNumber, String fullName, String emailAddress, String phoneNumber, String year, String course, String gender, byte[] profilePicture) {
        this.id = id;
        this.studentNumber = studentNumber;
        this.fullName = fullName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.year = year;
        this.course = course;
        this.gender = gender;
        this.profilePicture = profilePicture;
    }
    
    public Student() {
    }

    // Getters and Setters
    // ...

    // Insert a new student
    public void addStudent(String student_number, String full_name, String email, String phone_number, String year, String course, String gender, byte[] profile_picture) {
        String insertQuery = "INSERT INTO student (student_number, full_name, email, phone_number, year, course, gender, profile_picture) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = db.getConnection();
             PreparedStatement ps = conn.prepareStatement(insertQuery)) {

            ps.setString(1, student_number);
            ps.setString(2, full_name);
            ps.setString(3, email);
            ps.setString(4, phone_number);
            ps.setString(5, year);
            ps.setString(6, course);
            ps.setString(7, gender);
            ps.setBytes(8, profile_picture);

            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Student Added", "add student", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Student Not Added", "add student", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Update student by id
    public void updateStudent(int id, String student_number, String full_name, String email, String phone_number, String year, String course, String gender, byte[] profile_picture) {
        String updateQuery = "UPDATE student SET student_number = ?, full_name = ?, email = ?, phone_number = ?, year = ?, course = ?, gender = ?, profile_picture = ? WHERE id = ?";
        try (Connection conn = db.getConnection();
             PreparedStatement ps = conn.prepareStatement(updateQuery)) {

            ps.setString(1, student_number);
            ps.setString(2, full_name);
            ps.setString(3, email);
            ps.setString(4, phone_number);
            ps.setString(5, year);
            ps.setString(6, course);
            ps.setString(7, gender);
            ps.setBytes(8, profile_picture);
            ps.setInt(9, id);

            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Student Updated", "update student", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Student Not Updated", "update student", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Remove student by id
    public void removeStudent(int id) {
        String removeQuery = "DELETE FROM student WHERE id = ?";
        try (Connection conn = db.getConnection();
             PreparedStatement ps = conn.prepareStatement(removeQuery)) {

            ps.setInt(1, id);

            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Student Deleted", "remove", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Student Not Deleted", "remove", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Function to populate ArrayList with students
    public ArrayList<Student> studentList() {
        ArrayList<Student> sList = new ArrayList<>();
        model.Func_Class func = new Func_Class();

        try (ResultSet rs = func.getData("SELECT * FROM student")) {

            while (rs.next()) {
                Student student = new Student(
                    rs.getInt("id"),
                    rs.getString("student_number"),
                    rs.getString("full_name"),
                    rs.getString("email"),
                    rs.getString("phone_number"),
                    rs.getString("year"),
                    rs.getString("course"),
                    rs.getString("gender"),
                    rs.getBytes("profile_picture")
                );
                sList.add(student);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }

        return sList;
    }
}
