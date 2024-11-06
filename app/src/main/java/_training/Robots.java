package _training;

public class Robots {
    static void driveRobot(String direction, double speed){
        System.out.println("Robot is driving "+direction);
    }
    static void shootRobot(String direction){
        System.out.println("Robot is shooting to the "+direction);
    }
    public static void main(String[] args){
        double robotSpeed = 20; // Set the robot speed
        driveRobot("forward", robotSpeed); // Drive the robot forward
        shootRobot("left"); // Shoot the robot to the left
    }
}
