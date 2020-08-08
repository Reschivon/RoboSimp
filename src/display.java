package javatutorial.net;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class graphics extends JPanel {
    // initialize class variables
    int x;
    int y;
    int rotation;

    public void blitPose(Graphics g) {
        g.drawString("Robot x = " + x.toString(), 10, 10);
        g.drawString("Robot y = " + y.toString(), 10, 50);
        g.drawString("Robot rotation = " + rotation.toString(), 10, 100);

    }

    public void displayRobotPositions() {
        JFrame frame = new JFrame("Robot Simulator");
        frame.getContentPane().add(new graphics());
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }

    public void updateRobotGraphics(){
        x = simulator.getX();
        y = simulator.getY();
        rotation = simulator.getRotation();

        blitPose();
    }
}