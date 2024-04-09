package swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import model.Model_Menu;

public class MenuItem extends javax.swing.JPanel {

    private boolean selected;
    
    public MenuItem(Model_Menu data) {
        initComponents();
        setOpaque(false);
        if(data.getType()== Model_Menu.MenuType.MENU) {
            lbIcon.setIcon(data.toIcon());
            lbName.setText(data.getName());
        } else if(data.getType() == Model_Menu.MenuType.TITLE) {
            lbIcon.setText(data.getName());
            lbIcon.setFont(new Font("sansserif", 1, 12));
            lbName.setVisible(false);
        } else {
            lbName.setText(" ");
        }
    }
    
    public void setSelected(boolean selected) {
        this.selected = selected;
        repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbIcon = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(400, 25));

        lbIcon.setForeground(new java.awt.Color(255, 255, 255));

        lbName.setForeground(new java.awt.Color(255, 255, 255));
        lbName.setText("Menu Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbIcon)
                .addGap(18, 18, 18)
                .addComponent(lbName)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbName, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics grphcs) {
        if(selected) {
            Graphics2D g2=(Graphics2D)grphcs;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);                
            g2.setColor(new Color(255, 255, 255, 80));
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), 5, 5);
        }
        super.paintComponent(grphcs); 
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbName;
    // End of variables declaration//GEN-END:variables
}
