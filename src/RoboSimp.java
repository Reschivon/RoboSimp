import java.util.Scanner;

public class RoboSimp{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter destination x:");
        int xDest = scan.nextInt();

        System.out.println("Enter destination y:");
        int yDest = scan.nextInt();

        directionator.setDestination(xDest, yDest);
        simulator.update();
        //directionator.take x, y, and rot from simulator()
        display.updateRobotGraphics();
    }
}