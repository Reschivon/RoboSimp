// for getting the destination from the destination asker
class directionator{
    static int x;
    static int y;
    public static void setDestination(){
        x = directionAsker.x;
        y = directionAsker.y;
    }
    
    // for going forward or backward
    static double goForwardsOrBackwards(){
       RotationUtil.direction Rot = RotationUtil.turnLeftOrRight(simulator.getRotation(), atan2((simulator.y - y)/(simulator.x - x)));
       if (Rot == none) {
           return 1;
       }
       else {
           return 0;
       }
    }
    
    // getting the angle to rotate from the simulator
    static double getAngleRotation(){
        if (Rot == left) {
            return -1;
        } 
        if (Rot == right) {
            return 1;
        }
        if (Rot == none) {
            return 0;
        }
    }

    static double goForwards(){
        RotationUtil.direction Rot = RotationUtil.turnLeftOrRight(simulator.getRotation(), atan2((simulator.y - y)/(simulator.x - x)));
        
        if (Rot == left){
            // turn left
        }
        if (Rot == right){
            // turn right
        }
        if (Rot == none) {
            //goForward
        }
    }
}