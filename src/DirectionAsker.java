import java.util.Scanner;

public class DirectionAsker {
    static int xpoint;
    static int ypoint;

    public static void getInput() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the x coordinate");
        xpoint = myObj.nextInt();
        System.out.println("Enter the y coordinate");
        ypoint = myObj.nextInt();

    }

    public static int getX() {
        return xpoint;
    }

    public static int getY() {
        return ypoint;
    }
}