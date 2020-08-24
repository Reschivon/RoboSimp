import java.lang.Math;

public class RotationUtil {
    public static void main(String[] args) {
        assert (turnLeftOrRight(0, 90) == direction.left);
        assert (turnLeftOrRight(-350, 350) == direction.right);
        assert (turnLeftOrRight(350, -350) == direction.left);
        assert (turnLeftOrRight(90, 230) == direction.left);
        assert (turnLeftOrRight(0, 179) == direction.left);
        assert (turnLeftOrRight(-1, 179) == direction.right);
//        assert (turnLeftOrRight(, ) == direction.);
//        assert (turnLeftOrRight(, ) == direction.);
//        assert (turnLeftOrRight(, ) == direction.);
    }

    enum direction{
        left, right, none
    }

    /**
     * Counterclockwise increasing
     * @param robotAngle Angle of target to control
     * @param destAngle  Desired angle of target
     * @return direction enum
     */
    static direction turnLeftOrRight(int robotAngle, int destAngle){
        if (robotAngle > 180){
            robotAngle = robotAngle % 360;
            if (robotAngle > 180) robotAngle -= 180;
        }else{
            robotAngle = robotAngle % 360;
            if (robotAngle < 180) robotAngle += 180;
        }

        return turnLeftOrRight180(robotAngle, destAngle);
    }

    /**
     * Uses -180 to 180 angle system, counterclockwise increasing
     * @param robotAngle Angle of target to control
     * @param destAngle  Desired angle of target
     * @return direction enum
     */
    static direction turnLeftOrRight180(int robotAngle, int destAngle){
        if (Math.abs (robotAngle - destAngle) <= 10) return direction.none;

        if (Math.abs(robotAngle - destAngle) < 180) {
            if (robotAngle - destAngle > 0) return direction.right;
            else                            return direction.left;

        }else{
            if (robotAngle - destAngle > 0) destAngle += 360;
            else                            robotAngle += 360;

            return turnLeftOrRight(robotAngle, destAngle);
        }
    }
}
