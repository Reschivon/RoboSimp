import java.lang.Math;

public class simulator{
    private static double x;
    private static double y;
    private static double rot;

    public static int getX(){
        return (int) x;
    }

    public static int  getRotation(){
        return (int) rot;
    }

    public static int getY(){
        return (int) y;
    }

    //take info from motor control
    public static void update(){
        int left = motorControl.leftMotorDegrees();
        int right = motorControl.rightMotorDegrees();

        double forwards = (left + right)/2.0;
        double rotation = (right - left)/2.0;

        double yChange = forwards * Math.sin(rot);
        double xChange = forwards * Math.cos(rot);

        x += xChange;
        y += yChange;
        rot += rotation;
    }
}