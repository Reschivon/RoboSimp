import java.util.Scanner;

public class RoboSimp{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        displayFooData robotDisplay = new displayFooData();
        String input = "y";

        while (input.equals("y")){
            robotDisplay.updateRobotPose();
            System.out.println("Would you like to update Robot Pose? y/n");
            input = scan.next();
        }


        System.out.println("We see you would not like to use this anymore and are very sad.");
        System.out.println("Thank you for using RoboSimp.");

    }


}