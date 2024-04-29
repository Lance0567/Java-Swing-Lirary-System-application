package swing;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;
import model.StatusType;

public class TableStatus extends JLabel {

    public StatusType getType() {
        return type;
    }

    public TableStatus() {
        setForeground(Color.WHITE);
    }

    private StatusType type;

    public void setType(StatusType type) {
        this.type = type;
        setText(type.toString());
        repaint();
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        if (type != null) {
            Graphics2D g2 = (Graphics2D) grphcs;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            GradientPaint g;
            if (type == StatusType.PENDING) {
                g = new GradientPaint(0, 0, new Color(255, 224, 0), 0, getHeight(), new Color(202, 197, 49));
            } else if (type == StatusType.APPROVED) {
                g = new GradientPaint(0, 0, new Color(86, 171, 47), 0, getHeight(), new Color(86, 171, 47));
            } else {
                g = new GradientPaint(0, 0, new Color(237, 33, 58), 0, getHeight(), new Color(147, 41, 30));
            }
            g2.setPaint(g);
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), 1, 1);
        }
        super.paintComponent(grphcs);
    }
}
