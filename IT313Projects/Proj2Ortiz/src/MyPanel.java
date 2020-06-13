/*
Armando Ortiz
9-24-19
Project 2a
*/
// import statements for drawing
import javax.swing.*;
import java.awt.*;
public class MyPanel extends JPanel {
    // Drawing a surprised face

    public MyPanel( ) {
        // creating a panel with a peru color background to resemble dirt
        setBackground(new Color(0xCD853F));
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw circle for the face
        // x y width height
        g.setColor(new Color(0xF0E68C));
        g.fillOval(20, 20, 300, 300);
        g.setColor(Color.black);
        g.drawOval(20, 20, 300, 300);
        // Nose with a Indian red nose
        g.setColor(new Color(0xCD5C5C));
        g.fillOval(130, 190, 80, 80);
        g.setColor(Color.black);
        g.drawOval(130, 190, 80, 80);
        // The next 4 are white eyes with black pupils
        g.setColor(new Color(0xFFFFFF));
        g.fillOval(180, 60, 80, 140);
        g.setColor(Color.black);
        g.drawOval(180, 60, 80, 140);

        g.setColor(new Color(0x000000));
        g.fillOval(200, 80, 40, 100);
        g.setColor(Color.black);
        g.drawOval(200, 80, 40, 100);

        g.setColor(new Color(0xFFFFFF));
        g.fillOval(80, 60, 80, 140);
        g.setColor(Color.black);
        g.drawOval(80, 60, 80, 140);

        g.setColor(new Color(0x000000));
        g.fillOval(100, 80, 40, 100);
        g.setColor(Color.black);
        g.drawOval(100, 80, 40, 100);
        // Surprised mouth
        g.setColor(new Color(0x000000));
        g.fillOval(120, 270, 40, 40);
        g.setColor(Color.black);
        g.drawOval(120, 270, 40, 40);
        // left nostril
        g.setColor(new Color(0x000000));
        g.fillOval(140, 220, 20, 20);
        g.setColor(Color.black);
        g.drawOval(140, 220, 20, 20);
        // right nostril
        g.setColor(new Color(0x000000));
        g.fillOval(180, 220, 20, 20);
        g.setColor(Color.black);
        g.drawOval(180, 220, 20, 20);

    }
}
