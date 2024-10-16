package _training;

public class IfStatementSolution {
    public static void main(String[] args) {
        boolean brushedTeeth = true;
        boolean tookMints = false;
        boolean didHomework = false;
        boolean preparedForRobotics = true;

        // Common Answer
        if ((brushedTeeth || tookMints) && didHomework && preparedForRobotics) {
            System.out.println("I can go to robotics tonight!");
        } else {
            if (!(brushedTeeth || tookMints)) {
                System.out.println("Gotta freshen up!");
            }
            if (!didHomework) {
                System.out.println("Oh darn, I gotta do my Math homework!");
            }
            if (!preparedForRobotics) {
                System.out.println("Oop, I need to finish finding my sponsors!");
            }
            System.out.println("I can't go to robotics yet.");
        }

        // Shorthand
        if ((brushedTeeth || tookMints) && didHomework && preparedForRobotics) {
            System.out.println("I can go to robotics tonight!");
        } else if (!(brushedTeeth || tookMints)) {
            System.out.println("Gotta freshen up!");
        } else if (!didHomework) {
            System.out.println("Oh darn, I gotta do my Math homework!");
        } else if (!preparedForRobotics) {
            System.out.println("Oop, I need to finish finding my sponsors!");
        }
    }
}
