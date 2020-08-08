public class motorControl{

	// under the assumption that negative angles are CCW and positive are CW 
	int wheel_circum = 10; //just some random values for now
	int bot_diameter = 20;
	int rotated = 0;

	public static int leftMotorDegrees(int desired_rot, int direction){
		int direction = directionator.goForwardsOrBackwards()
		int desired_rot = directionator.getAngleRotation()
		if(Math.abs(rotated) < Math.abs(desired_rot)){
			int rot_direction = -desired_rot/Math.abs(desired_rot)
			rotated += 10;
			int distance_to_move = Math.PI*bot_diameter*(10/360);
			return rot_direction * distance_to_move*360 / wheel_circum;
		}

		int x_dist = abs(simulator.getX() - newX)
		int y_dist = abs(simulator.getY() - newY)

		else if(x_dist < 3 and y_dist < 3){
			return 36*direction
		}
		else{
			rotated = 0
			return 0
		}
	}

	public static int rightMotorDegrees(){
		int direction = directionator.goForwardsOrBackwards()
		int desired_rot = directionator.getAngleRotation()
		if(Math.abs(rotated) < Math.abs(desired_rot)){
			int rot_direction = -desired_rot/Math.abs(desired_rot)
			rotated += 10;
			int distance_to_move = Math.PI*bot_diameter*(10/360);
			return rot_direction * distance_to_move*360 / wheel_circum;
		}

		int x_dist = abs(simulator.getX() - newX)
		int y_dist = abs(simulator.getY() - newY)

		else if(x_dist < 3 and y_dist < 3){
			return 36*direction
		}
		else{
			rotated = 0
			return 0
		}
	}

}