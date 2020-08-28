import static java.lang.Math.atan2;

// for getting the destination from the destination asker
class Directionator{
    static int x;
    static int y;
    public static void setDestination(){
        x = directionAsker.x;
        y = directionAsker.y;
    }
    
    // for going forward or backward
    static double goForwardsOrBackwards(){
       RotationUtil.direction Rot = RotationUtil.turnLeftOrRight(simulator.getRotation(), atan2((simulator.y - y),(simulator.x - x)));
       if (Rot == RotationUtil.direction.none) {
           return 1;
       }
       else {
           return 0;
       }
    }
    
    // getting the angle to rotate from the simulator
    static double getAngleRotation(){
        RotationUtil.direction Rot = RotationUtil.turnLeftOrRight(simulator.getRotation(), atan2((simulator.y - y),(simulator.x - x)));
        if (Rot == RotationUtil.direction.left) {
            return -1;
        } 
        if (Rot == RotationUtil.direction.right) {
            return 1;
        }
        if (Rot == RotationUtil.direction.none) {
            return 0;
        }
        return 0;
    }
}
