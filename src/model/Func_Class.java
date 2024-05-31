package model;

import database.db;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

public class Func_Class {

    // fucntion to customize the jTable
    public void customTable(JTable table) {
        table.setSelectionBackground(new Color(153, 153, 153));
        table.setSelectionForeground(new Color(40, 40, 40));
        table.setRowHeight(40);
        table.setShowGrid(true);
        table.setGridColor(new Color(230, 230, 230));
        table.setShowHorizontalLines(true);
        table.setBackground(new Color(248, 248, 248));
    }

    // function to customize the jTable
    public ResultSet getData(String query) {
        PreparedStatement ps;
        ResultSet rs = null;

        try {
            ps = db.getConnection().prepareStatement(query);
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Func_Class.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rs;
    }
}
