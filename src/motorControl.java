public class motorControl{

	// under the assumption that negative angles are CCW and positive are CW 
	int wheel_circum = 10; //just some random values for now
	int bot_diameter = 20;
	int rotated = 0;

	public static int leftMotorDegrees(int desired_rot, int direction){
		// while we aren't at the desired rotation, rotate a little
		// then we go in the direction bit by bit until we reach destination
		// also must account for size of wheel but that should be ok
		if(Math.abs(rotated) < Math.abs(desired_rot)){
			int rot_direction = desired_rot/Math.abs(desired_rot)
			rotated += 10;
			int distance_to_move = Math.PI*bot_diameter*(10/360);
			return rot_direction * distance_to_move*360 / wheel_circum;
		}
		else{
			return 360*direction
		}
	}

	public static int rightMotorDegrees(int desired_rot, int direction){
		// same as above but for the other motor
		if(Math.abs(rotated) < Math.abs(desired_rot)){
			int rot_direction = -desired_rot/Math.abs(desired_rot)
			rotated += 10;
			int distance_to_move = Math.PI*bot_diameter*(10/360);
			return rot_direction * distance_to_move*360 / wheel_circum;
		}
		else{
			return 360*direction
		}
	}
    
}
