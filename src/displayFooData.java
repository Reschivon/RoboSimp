import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class displayFooData {
    // initialize class variables
    int x;
    int y;
    int rotation;

    Scanner scan = new Scanner(System.in);
    private BufferedImage image;

    public displayFooData() {
        JFrame frame = new JFrame("Robot Simulator");
        frame.setSize(800, 800);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {
            //TODO make this path relative
            image = ImageIO.read(new File("/Users/JustKyle-ngaround/Desktop/ud282-master/RoboSimp/src/FullSizeRender.jpeg"));
        } catch (IOException e){
            System.out.println(e);
        }

        frame.add(new JPanel() {
            public void paintComponent(Graphics g) {
                g.drawString("Robot x = " + x, 10, 20);
                g.drawString("Robot y = " + y, 10, 60);
                g.drawString("Robot rotation = " + rotation, 10, 100);

                // blit image
                g.setColor(Color.YELLOW);
//                g.fillRect(x, y, 100, 30);
//                g.drawImage(image, x, y, this);
                // Rotate the image and then draw it
                image = rotateImageByDegrees(image, rotation);
                g.drawImage(image,x,y,100,100,this);

                repaint();
                revalidate();
            }

        });
    }

    public int getInput(String message){
        System.out.println("Set " + message + ":");
        String input = scan.next();

        return Integer.parseInt(input);
    }

    public void updateRobotPose() {
        x = getInput("X");
        y = getInput("Y");
        rotation = getInput("Rotation");
    }

    // Rotate image code
    public BufferedImage rotateImageByDegrees(BufferedImage img, double angle) {

        double rads = Math.toRadians(angle);
        double sin = Math.abs(Math.sin(rads)), cos = Math.abs(Math.cos(rads));
        int w = img.getWidth();
        int h = img.getHeight();
        int newWidth = (int) Math.floor(w * cos + h * sin);
        int newHeight = (int) Math.floor(h * cos + w * sin);

        BufferedImage rotated = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = rotated.createGraphics();
        AffineTransform at = new AffineTransform();
        at.translate((newWidth - w) / 2, (newHeight - h) / 2);

        int x = w / 2;
        int y = h / 2;

        at.rotate(rads, x, y);
        g2d.setTransform(at);
        g2d.drawImage(img, 0, 0, this);
        g2d.setColor(Color.RED);
        g2d.drawRect(0, 0, newWidth - 1, newHeight - 1);
        g2d.dispose();

        return rotated;
    }
    // Initialize Getters
    public int getX(){
        return x;
    }

    public int getY(){return y;}

    public int getRotation(){return rotation;}

}
