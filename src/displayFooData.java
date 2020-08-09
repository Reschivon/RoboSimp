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
                image = rotate(image, rotation);
                g.drawImage(image,x,y,100,100,this);

                repaint();
//                revalidate();
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

    // Initialize Getters
    public int getX(){
        return x;
    }

    public int getY(){return y;}

    public int getRotation(){return rotation;}

}
