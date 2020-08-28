//import java.awt.Graphics;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//
//public class display{
//    // initialize class variables
//    int x;
//    int y;
//    int rotation;
//
//    public void updateRobotGraphics() {
//        x = simulator.getX();
//        y = simulator.getY();
//        rotation = simulator.getRotation();
//    }
//
//    public display() {
//        JFrame frame = new JFrame("Robot Simulator");
//        frame.setSize(300, 300);
//        frame.setVisible(true);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        frame.add(new JPanel() {
//            public void paintComponent(Graphics g) {
//                g.drawString("Robot x = " + x, 10, 10);
//                g.drawString("Robot y = " + y, 10, 50);
//                g.drawString("Robot rotation = " + rotation, 10, 100);
//
//                repaint();
//            }
//        });
//    }
//}