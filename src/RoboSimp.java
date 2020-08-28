public class RoboSimp{

    public static void main(String[] args) {
        DirectionAsker.getInput();
        //set Destination forever
        Directionator.getDestination();

        Display.makeScreen();

        //simulator gets motor movement from motorControl which asks directionator for directions
        while (Math.abs(simulator.getX() - DirectionAsker.getX()) > 2 ||
                Math.abs(simulator.getX() - DirectionAsker.getX()) > 2) {
            MotorControl.update();
            simulator.update();

            try {
                Thread.sleep(70);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("We see you would not like to use this anymore and are very sad.");
        System.out.println("Thank you for using RoboSimp.");
    }


}