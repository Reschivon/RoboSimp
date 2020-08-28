import static java.lang.Math.atan2;


class Directionator{
    private static int x;
    private static int y;

    // getting the destination from the destination asker
    public static void getDestination(){
        x = DirectionAsker.getX();
        y = DirectionAsker.getY();
    }
    
    // for going forward or backward
    static double goForwardsOrBackwards(){
       return RotationUtil.turnLeftOrRight(
               simulator.getRotation(),
               Math.toDegrees(atan2((simulator.y - y),(simulator.x - x))))
           == RotationUtil.direction.none? 1: 0;
    }
    
    // getting the angle to rotate from the simulator
    static double getAngleRotation(){
        switch (RotationUtil.turnLeftOrRight(simulator.getRotation(),
                Math.toDegrees(atan2((simulator.y - y),(simulator.x - x))))) {
            case left:
                return -1;
            case right:
                return 1;
            case none:
                return 0;
        }

        return -2;
    }
}
