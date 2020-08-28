import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Display {
    //width and height
    static final int imageSize = 80;
    static BufferedImage image;
    static JFrame frame = null;

    public static void makeScreen() {
        frame = new JFrame("Robot Simulator");
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //import the image
        try {
            image = ImageIO.read(new File("src/assets/RobotImage.jpeg"));
        } catch (IOException e){
            System.out.println(e);
        }

        JPanel panel = new JPanel() {
            public void paintComponent(Graphics g) {
            //clear screen
            super.paintComponent(g);

            Graphics2D g2d = (Graphics2D)g;
            AffineTransform nonRotated = g2d.getTransform();

            double rotation = simulator.getRotation();
            double x = simulator.getX();
            double y = simulator.getY();

                System.out.println("xy "+ x + " " + y);

            g2d.drawString("Robot x = " + x, 10, 20);
            g2d.drawString("Robot y = " + y, 10, 60);
            g2d.drawString("Robot rotation = " + rotation, 10, 100);

            g2d.rotate(Math.toRadians(rotation), x + imageSize/2, y + imageSize/2);
//                  g2d.transform(rotateAT);
//                  image = rotate(image, rotation);
            g2d.drawImage(image, (int)x, (int)y,imageSize,imageSize,this);

            //reset image to original nonRotated form
            g2d.setTransform(nonRotated);
            repaint();
            }
        };

        frame.add(panel);
        panel.repaint();

    }

    // Rotate image code
    public static BufferedImage rotate(BufferedImage bimg, double angle) {

        int w = bimg.getWidth();
        int h = bimg.getHeight();

        BufferedImage rotated = new BufferedImage(w, h, bimg.getType());
        Graphics2D graphic = rotated.createGraphics();
        graphic.rotate(Math.toRadians(angle), w/2, h/2);
        graphic.drawImage(bimg, null, 0, 0);
        graphic.dispose();
        return rotated;
    }
}

