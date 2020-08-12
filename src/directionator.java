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
        int goForward = 1;
        int goBackwards = -1;
        int noMovement = 0;
    }
    
    // getting the angle to rotate from the simulator
    static double getAngleRotation(){
        return 0;
    }
}