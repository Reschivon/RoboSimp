import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

public class displayJPanel extends JPanel {
    Graphics2D g2d;
    int x;
    int y;
    int rotation;
    BufferedImage image;

    public displayJPanel(int x, int y, int rotation, BufferedImage image){
        x = x;
        y = y;
        rotation = rotation;
        image = image;
    }
    public void paintComponent(Graphics g) {
        g2d = (Graphics2D)g;
        AffineTransform nonRotated = g2d.getTransform();
        g2d.drawString("Robot x = " + "45", 10, 20);
        g2d.drawString("Robot y = " + "400", 10, 60);
        g2d.drawString("Robot rotation = " + "rotation", 10, 100);

        g2d.rotate(Math.toRadians(45));
        g2d.drawImage(image, x, y,100,100,this);


        //reset image to original nonRotated form
        g2d.setTransform(nonRotated);
    }
}
