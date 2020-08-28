public class MotorControl {

	// under the assumption that negative angles are CCW and positive are CW 
	static int wheel_circum = 10; //just some random values for now
	static int bot_diameter = 20;

	private static double leftMotorDegrees;
	private static double rightMotorDegrees;

	public static void update(){
		double direction = Directionator.goForwardsOrBackwards();
		double desired_rot = Directionator.getAngleRotation();

		leftMotorDegrees = desired_rot + direction;
		rightMotorDegrees = -desired_rot + direction;
	}
	public static double leftMotorDegrees(){
		return leftMotorDegrees;
	}
	public static double rightMotorDegrees(){
		return rightMotorDegrees;
	}
	/*
	public static double pleftMotorDegrees(){

		int newX, newY;
		int x_dist = Math.abs(simulator.getX() - newX);
		int y_dist = Math.abs(simulator.getY() - newY);
		double dist = Math.sqrt(x_dist*x_dist + y_dist*y_dist);
		double angle_dist = Math.abs(Math.abs(simulator.getRotation()) - Math.abs(desired_rot));
		int rot_direction = desired_rot / Math.abs(desired_rot);

		if(angle_dist >= 10){
			double distance_to_move = Math.PI * bot_diameter * (10.0 / 360);
			return rot_direction * distance_to_move * 360 / wheel_circum;
		}
		else if(angle_dist < 10 && angle_dist > 0){
			double distance_to_move = Math.PI * bot_diameter * (angle_dist / 360);
			return rot_direction * distance_to_move * 360 / wheel_circum;
		}
		else if(dist >= 5){
			return 180*direction;
		}
		else if(dist < 5){
			return dist/wheel_circum * 360*direction;
		}
		else{
			return 0;
		}
	}

	public static double prightMotorDegrees(){
		double direction = Directionator.goForwardsOrBackwards();
		double desired_rot = Directionator.getAngleRotation();
		int x_dist = Math.abs(simulator.getX() - newX);
		int y_dist = Math.abs(simulator.getY() - newY);
		int newX, newY;
		double dist = Math.sqrt(x_dist*x_dist + y_dist*y_dist);
		double angle_dist = Math.abs(Math.abs(simulator.getRotation()) - Math.abs(desired_rot));
		int rot_direction = -desired_rot / Math.abs(desired_rot);

		if(angle_dist >= 10){
			double distance_to_move = Math.PI * bot_diameter * (10.0 / 360);
			return rot_direction * distance_to_move * 360 / wheel_circum;
		}
		else if(angle_dist < 10 && angle_dist > 0){
			double distance_to_move = Math.PI * bot_diameter * (angle_dist / 360);
			return rot_direction * distance_to_move * 360 / wheel_circum;
		}
		else if(dist >= 5){
			return 180*direction;
		}
		else if(dist < 5){
			return dist/wheel_circum * 360*direction;
		}
		else{
			return 0;
		}
	}
*/
}
