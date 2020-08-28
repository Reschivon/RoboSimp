import java.lang.Math;

public class simulator{
    public static double x = 0 ;
    public static double y = 0;
    private static double rot = 0;

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
        double left = MotorControl.leftMotorDegrees();
        double right = MotorControl.rightMotorDegrees();

        //System.out.println("degs "+left + " " + right);

        double forwards = (left + right)/2.0;
        double rotation = (right - left)/2.0;

        double yChange = forwards * Math.sin(rot);
        double xChange = forwards * Math.cos(rot);

        x += xChange;
        y += yChange;
        rot += rotation;

        System.out.println("new coords " + x + " " + y);
    }
}

