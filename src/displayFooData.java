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
    displayJPanel display;

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

        display = new displayJPanel(x, y, rotation, image);
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

        frame.add(display);
        }
}
