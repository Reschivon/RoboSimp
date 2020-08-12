import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class displayFooData {
    // initialize class variables
    int x;
    int y;
    int rotation;

    Scanner scan = new Scanner(System.in);
    BufferedImage image;
    JFrame frame;

    public displayFooData() {
        frame = new JFrame("Robot Simulator");
        frame.setSize(800, 800);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //import the image
        try {
            image = ImageIO.read(new File("src/assets/RobotImage.jpeg"));
        } catch (IOException e){
            System.out.println(e);
        }
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

        frame.add(new JPanel() {
              public void paintComponent(Graphics g) {
                  Graphics2D g2d = (Graphics2D)g;
                  AffineTransform nonRotated = g2d.getTransform();
                  g2d.drawString("Robot x = " + x, 10, 20);
                  g2d.drawString("Robot y = " + y, 10, 60);
                  g2d.drawString("Robot rotation = " + rotation, 10, 100);

                  g2d.rotate(Math.toRadians(rotation));
                  g2d.drawImage(image, x, y,100,100,this);


                  //reset image to original nonRotated form
                  g2d.setTransform(nonRotated);
              }
            });
        }
}
