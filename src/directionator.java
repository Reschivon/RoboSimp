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
       if directionAsker.x < simulator.x{
           //turn & goForward
       }
    }
    
    // getting the angle to rotate from the simulator
    static double getAngleRotation(){
        return 0;
    }

    static double goForwardsOrBackwards(){
        // turn first and then go forward
        // else if turn first and then go backwards if directionAsker x > simulator.x
        // else just stay in position(no Movement)
        // get the angle rotation from the simulator and use it in the movement of the robot


        // turn using arctan to turn towards dest, and then move forward
        // getAngleRotation = atan((sim.y-dest.y)/(sim.x-dest.x))

        // 
    }
}